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
package org.apache.poi.xssf.extractor;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import poi.org.apache.xmlbeans.XmlException;

/**
 * Implementation of a text extractor or xlsb Excel
 * files that uses SAX-like binary parsing.
 *
 * @since 3.16-beta3
 */
public class XSSFBEventBasedExcelExtractor extends XSSFEventBasedExcelExtractor {

    private static final Logger LOGGER = LogManager.getLogger(XSSFBEventBasedExcelExtractor.class);

    public static final List<XSSFRelation> SUPPORTED_TYPES = Collections.singletonList(
            XSSFRelation.XLSB_BINARY_WORKBOOK
    );

    private boolean handleHyperlinksInCells;

    public XSSFBEventBasedExcelExtractor(String path) throws XmlException, OpenXML4JException, IOException {
        super(path);
    }

    public XSSFBEventBasedExcelExtractor(OPCPackage container) throws XmlException, OpenXML4JException, IOException {
        super(container);
    }

    public void setHandleHyperlinksInCells(boolean handleHyperlinksInCells) {
        this.handleHyperlinksInCells = handleHyperlinksInCells;
    }

    /**
     * Should we return the formula itself, and not
     * the result it produces? Default is false
     * This is currently unsupported for xssfb
     */
    @Override
    public void setFormulasNotResults(boolean formulasNotResults) {
        throw new IllegalArgumentException("Not currently supported");
    }

//    /**
//     * Processes the given sheet
//     */
//    public void processSheet(
//            SheetContentsHandler sheetContentsExtractor,
//            XSSFBStylesTable styles,
//            XSSFBCommentsTable comments,
//            SharedStrings strings,
//            InputStream sheetInputStream)
//            throws IOException {
//
//        DataFormatter formatter;
//        if (getLocale() == null) {
//            formatter = new DataFormatter();
//        } else {
//            formatter = new DataFormatter(getLocale());
//        }
//
//        XSSFBSheetHandler xssfbSheetHandler = new XSSFBSheetHandler(
//                sheetInputStream,
//                styles, comments, strings, sheetContentsExtractor, formatter, getFormulasNotResults()
//        );
//        xssfbSheetHandler.parse();
//    }


}
