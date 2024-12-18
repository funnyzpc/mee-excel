/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hssf.extractor;

import static org.apache.poi.hssf.model.InternalWorkbook.OLD_WORKBOOK_DIR_ENTRY_NAME;
import static org.apache.poi.hssf.model.InternalWorkbook.WORKBOOK;
import static org.apache.poi.hssf.model.InternalWorkbook.WORKBOOK_DIR_ENTRY_NAMES;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.extractor.POITextExtractor;
import org.apache.poi.hssf.OldExcelFormatException;
import org.apache.poi.hssf.record.BOFRecord;
import org.apache.poi.hssf.record.CodepageRecord;
import org.apache.poi.hssf.record.FormulaRecord;
import org.apache.poi.hssf.record.NumberRecord;
import org.apache.poi.hssf.record.OldFormulaRecord;
import org.apache.poi.hssf.record.OldLabelRecord;
import org.apache.poi.hssf.record.OldSheetRecord;
import org.apache.poi.hssf.record.OldStringRecord;
import org.apache.poi.hssf.record.RKRecord;
import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentNode;
import org.apache.poi.poifs.filesystem.Entry;
import org.apache.poi.poifs.filesystem.FileMagic;
import org.apache.poi.poifs.filesystem.NotOLE2FileException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.util.IOUtils;

/**
 * A text extractor for old Excel files, which are too old for
 *  HSSFWorkbook to handle. This includes Excel 95, and very old
 *  (pre-OLE2) Excel files, such as Excel 4 files.
 * <p>
 * Returns much (but not all) of the textual content of the file,
 *  suitable for indexing by something like Apache Lucene, or used
 *  by Apache Tika, but not really intended for display to the user.
 * </p>
 */
public class OldExcelExtractor implements POITextExtractor {

    private static final int FILE_PASS_RECORD_SID = 0x2f;

    private RecordInputStream ris;

    // sometimes we hold the stream here and thus need to ensure it is closed at some point
    private Closeable toClose;

    private int biffVersion;
    private int fileType;

    public OldExcelExtractor(InputStream input) throws IOException {
        open(input);
    }

    @SuppressWarnings("java:S2093")
    public OldExcelExtractor(File f) throws IOException {
        POIFSFileSystem poifs = null;
        try {
            poifs = new POIFSFileSystem(f);
            open(poifs);
            toClose = poifs;
            return;
        } catch (OldExcelFormatException | NotOLE2FileException e) {
            // will be handled by workaround below
        } finally {
            if (toClose == null) {
                IOUtils.closeQuietly(poifs);
            }
        }

        @SuppressWarnings("resource")
        InputStream biffStream = Files.newInputStream(f.toPath());
        try {
            open(biffStream);
        } catch (IOException | RuntimeException e)  {
            // ensure that the stream is properly closed here if an Exception
            // is thrown while opening
            biffStream.close();

            toClose.close();

            throw e;
        }
    }

    public OldExcelExtractor(POIFSFileSystem fs) throws IOException {
        toClose = fs;

        open(fs);
    }

    public OldExcelExtractor(DirectoryNode directory) throws IOException {
        toClose = directory.getFileSystem();

        open(directory);
    }

    @SuppressWarnings("java:S2093")
    private void open(InputStream biffStream) throws IOException {
        BufferedInputStream bis = (biffStream instanceof BufferedInputStream)
            ? (BufferedInputStream)biffStream
            : new BufferedInputStream(biffStream, 8);

        if (FileMagic.valueOf(bis) == FileMagic.OLE2) {
            POIFSFileSystem poifs = new POIFSFileSystem(bis);
            try {
                open(poifs);
                toClose = poifs; // Fixed by GR, we should not close it here
            } finally {
                if (toClose == null) {
                    poifs.close();
                }
            }
        } else {
            ris = new RecordInputStream(bis);
            toClose = bis;
            prepare();
        }
    }

    private void open(POIFSFileSystem fs) throws IOException {
        open(fs.getRoot());
    }

    private void open(DirectoryNode directory) throws IOException {
        DocumentNode book;
        try {
            Entry entry = directory.getEntryCaseInsensitive(OLD_WORKBOOK_DIR_ENTRY_NAME);
            if (!(entry instanceof DocumentNode)) {
                throw new IllegalArgumentException("Did not have an Excel 5/95 Book stream: " + entry);
            }
            book = (DocumentNode) entry;
        } catch (FileNotFoundException | IllegalArgumentException e) {
            // some files have "Workbook" instead
            Entry entry = directory.getEntryCaseInsensitive(WORKBOOK);
            if (!(entry instanceof DocumentNode)) {
                throw new IllegalArgumentException("Did not have an Excel 5/95 Book stream: " + entry);
            }
            book = (DocumentNode) entry;
        }

        ris = new RecordInputStream(directory.createDocumentInputStream(book));
        prepare();
    }


    private void prepare() {
        if (! ris.hasNextRecord()) {
            throw new IllegalArgumentException("File contains no records!");
        }
        ris.nextRecord();

        // Work out what version we're dealing with
        int bofSid = ris.getSid();
        switch (bofSid) {
            case BOFRecord.biff2_sid:
                biffVersion = 2;
                break;
            case BOFRecord.biff3_sid:
                biffVersion = 3;
                break;
            case BOFRecord.biff4_sid:
                biffVersion = 4;
                break;
            case BOFRecord.biff5_sid:
                biffVersion = 5;
                break;
            default:
                throw new IllegalArgumentException("File does not begin with a BOF, found sid of " + bofSid);
        }

        // Get the type
        BOFRecord bof = new BOFRecord(ris);
        fileType = bof.getType();
    }

    /**
     * The Biff version, largely corresponding to the Excel version
     *
     * @return the Biff version
     */
    public int getBiffVersion() {
        return biffVersion;
    }

    /**
     * The kind of the file, one of {@link BOFRecord#TYPE_WORKSHEET},
     *  {@link BOFRecord#TYPE_CHART}, {@link BOFRecord#TYPE_EXCEL_4_MACRO}
     *  or {@link BOFRecord#TYPE_WORKSPACE_FILE}
     *
     * @return the file type
     */
    public int getFileType() {
        return fileType;
    }


    protected void handleNumericCell(StringBuilder text, double value) {
        // TODO Need to fetch / use format strings
        text.append(value);
        text.append('\n');
    }

    @Override
    public boolean isCloseFilesystem() {
        return toClose != null;
    }

    @Override
    public Closeable getFilesystem() {
        return toClose;
    }

    @Override
    public Object getDocument() {
        return ris;
    }
}
