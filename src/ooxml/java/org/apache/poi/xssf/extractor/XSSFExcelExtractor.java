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
import java.util.*;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.ooxml.extractor.POIXMLTextExtractor;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.HeaderFooter;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import poi.org.apache.xmlbeans.XmlException;

/**
 * Helper class to extract text from an OOXML Excel file
 */
public class XSSFExcelExtractor
       implements POIXMLTextExtractor, org.apache.poi.ss.extractor.ExcelExtractor {
    public static final List<XSSFRelation> SUPPORTED_TYPES = Collections.unmodifiableList(
            Arrays.asList(
                    XSSFRelation.WORKBOOK, XSSFRelation.MACRO_TEMPLATE_WORKBOOK,
                    XSSFRelation.MACRO_ADDIN_WORKBOOK, XSSFRelation.TEMPLATE_WORKBOOK,
                    XSSFRelation.MACROS_WORKBOOK
            )
    );

    private Locale locale;
    private final XSSFWorkbook workbook;
    private final DataFormatter dataFormatter;
    private boolean includeSheetNames = true;
    private boolean formulasNotResults;
    private boolean includeCellComments;
    private boolean includeHeadersFooters = true;
    private boolean includeTextBoxes = true;
    private boolean doCloseFilesystem = true;

    public XSSFExcelExtractor(OPCPackage container) throws XmlException, OpenXML4JException, IOException {
        this(new XSSFWorkbook(container));
    }
    public XSSFExcelExtractor(XSSFWorkbook workbook) {
        this.workbook = workbook;
        this.dataFormatter = new DataFormatter();
        this.dataFormatter.setUseCachedValuesForFormulaCells(true);
    }

    /**
     * Should sheet names be included? Default is true
     */
    public void setIncludeSheetNames(boolean includeSheetNames) {
        this.includeSheetNames = includeSheetNames;
    }
    /**
     * Should we return the formula itself, and not
     *  the result it produces? Default is false
     */
    public void setFormulasNotResults(boolean formulasNotResults) {
        this.formulasNotResults = formulasNotResults;
    }
    /**
     * Should cell comments be included? Default is false
     */
    public void setIncludeCellComments(boolean includeCellComments) {
        this.includeCellComments = includeCellComments;
    }
    /**
     * Should headers and footers be included? Default is true
     */
    public void setIncludeHeadersFooters(boolean includeHeadersFooters) {
        this.includeHeadersFooters = includeHeadersFooters;
    }
    /**
     * Should text within textboxes be included? Default is true
     * @param includeTextBoxes True if textboxes should be included, false if not.
     */
    public void setIncludeTextBoxes(boolean includeTextBoxes){
        this.includeTextBoxes = includeTextBoxes;
    }
    /**
     * What Locale should be used for formatting numbers (based
     *  on the styles applied to the cells)
     */
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    private void handleStringCell(StringBuilder text, Cell cell) {
        String contents = cell.getRichStringCellValue().getString();
        checkMaxTextSize(text, contents);
        text.append(contents);
    }

//    private void handleNonStringCell(StringBuilder text, Cell cell, DataFormatter formatter) {
//        CellType type = cell.getCellType();
//        if (type == CellType.FORMULA) {
//            type = cell.getCachedFormulaResultType();
//            if (type == CellType.STRING) {
//                handleStringCell(text, cell);
//                return;
//            }
//        }
//
//        if (type == CellType.NUMERIC) {
//            CellStyle cs = cell.getCellStyle();
//
//            if (cs != null && cs.getDataFormatString() != null) {
//                String contents = formatter.formatRawCellContents(
//                        cell.getNumericCellValue(), cs.getDataFormat(), cs.getDataFormatString());
//                checkMaxTextSize(text, contents);
//                text.append(contents);
//                return;
//            }
//        }
//
//        // No supported styling applies to this cell
//        String contents = dataFormatter.formatCellValue(cell);
//        if (contents != null) {
//            if (type == CellType.ERROR) {
//                // to match what XSSFEventBasedExcelExtractor does
//                contents = "ERROR:" + contents;
//            }
//            checkMaxTextSize(text, contents);
//            text.append(contents);
//        }
//    }

    private String extractHeaderFooter(HeaderFooter hf) {
        return ExcelExtractor._extractHeaderFooter(hf);
    }

    @Override
    public XSSFWorkbook getDocument() {
        return workbook;
    }

    @Override
    public boolean isCloseFilesystem() {
        return doCloseFilesystem;
    }

    @Override
    public XSSFWorkbook getFilesystem() {
        return workbook;
    }
}
