/*
 * XML Type:  CT_Worksheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Worksheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.addNewSheetPr
 */
public interface CTWorksheet extends XmlObject {
    DocumentFactory<CTWorksheet> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctworksheet530dtype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "sheetPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr getSheetPr();

    /**
     * Unsets the "mergeCells" element
     */
    void unsetMergeCells();
    /**
     * Gets the "mergeCells" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells getMergeCells();

    /**
     * True if has "mergeCells" element
     */
    boolean isSetMergeCells();
    /**
     * Gets the "sheetData" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData getSheetData();
    /**
     * True if has "pageMargins" element
     */
    boolean isSetPageMargins();
    /**
     * Gets the "pageMargins" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins getPageMargins();
    /**
     * Appends and returns a new empty "pageMargins" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins addNewPageMargins();
    /**
     * Gets the "tableParts" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts getTableParts();

    /**
     * Appends and returns a new empty "sheetPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr addNewSheetPr();

    /**
     * Gets array of all "cols" elements
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols[] getColsArray();
    /**
     * Gets ith "cols" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols getColsArray(int i);
    /**
     * Sets ith "cols" element
     */
    void setColsArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols cols);

    /**
     * Gets the "hyperlinks" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks getHyperlinks();

    /**
     * Appends and returns a new empty "hyperlinks" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks addNewHyperlinks();

    /**
     * True if has "dimension" element
     */
    boolean isSetDimension();


    /**
     * Gets the "dimension" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension getDimension();
    /**
     * Appends and returns a new empty "dimension" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension addNewDimension();


    /**
     * Unsets the "hyperlinks" element
     */
    void unsetHyperlinks();

    /**
     * Appends and returns a new empty value (as xml) as the last "cols" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols addNewCols();

    /**
     * True if has "sheetProtection" element
     */
    boolean isSetSheetProtection();

    /**
     * Gets the "sheetProtection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection getSheetProtection();


    /**
     * True if has "printOptions" element
     */
    boolean isSetPrintOptions();

    /**
     * Gets the "printOptions" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions getPrintOptions();

    /**
     * Appends and returns a new empty "printOptions" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions addNewPrintOptions();

    /**
     * Returns number of "cols" element
     */
    int sizeOfColsArray();

    /**
     * Sets array of all "cols" element
     */
    void setColsArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols[] colsArray);

    /**
     * Gets the "sheetFormatPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr getSheetFormatPr();

    /**
     * Appends and returns a new empty "sheetFormatPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr addNewSheetFormatPr();

    /**
     * True if has "sheetFormatPr" element
     */
    boolean isSetSheetFormatPr();

    /**
     * True if has "sheetCalcPr" element
     */
    boolean isSetSheetCalcPr();

    /**
     * Gets the "sheetCalcPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr getSheetCalcPr();

    /**
     * Appends and returns a new empty "sheetCalcPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr addNewSheetCalcPr();

    /**
     * Gets the "headerFooter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter getHeaderFooter();

    /**
     * Sets the "headerFooter" element
     */
    void setHeaderFooter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter headerFooter);

    /**
     * True if has "hyperlinks" element
     */
    boolean isSetHyperlinks();

    /**
     * Appends and returns a new empty "sheetViews" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews addNewSheetViews();

    /**
     * Unsets the "sheetProtection" element
     */
    void unsetSheetProtection();
    /**
     * Gets the "sheetViews" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews getSheetViews();

    /**
     * Appends and returns a new empty "sheetData" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData addNewSheetData();

    /**
     * Appends and returns a new empty "mergeCells" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells addNewMergeCells();
    /**
     * True if has "sheetViews" element
     */
    boolean isSetSheetViews();
    /**
     * Sets the "sheetPr" element
     */
    void setSheetPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr sheetPr);

    /**
     * Appends and returns a new empty "sheetProtection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection addNewSheetProtection();

    /**
     * Appends and returns a new empty value (as xml) as the last "conditionalFormatting" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting addNewConditionalFormatting();

    /**
     * Gets array of all "conditionalFormatting" elements
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting[] getConditionalFormattingArray();

    /**
     * Returns number of "conditionalFormatting" element
     */
    int sizeOfConditionalFormattingArray();
    /**
     * Gets ith "conditionalFormatting" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting getConditionalFormattingArray(int i);

    /**
     * Removes the ith "conditionalFormatting" element
     */
    void removeConditionalFormatting(int i);
    /**
     * Removes the ith "cols" element
     */
    void removeCols(int i);


}
