/*
 * XML Type:  CT_Sheets
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Sheets(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheets extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTSheets> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsheets49fdtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "sheet" elements
     */
    java.util.List<CTSheet> getSheetList();

    /**
     * Gets array of all "sheet" elements
     */
    CTSheet[] getSheetArray();

    /**
     * Gets ith "sheet" element
     */
    CTSheet getSheetArray(int i);

    /**
     * Returns number of "sheet" element
     */
    int sizeOfSheetArray();

    /**
     * Sets array of all "sheet" element
     */
    void setSheetArray(CTSheet[] sheetArray);

    /**
     * Sets ith "sheet" element
     */
    void setSheetArray(int i, CTSheet sheet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheet" element
     */
    CTSheet insertNewSheet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "sheet" element
     */
    CTSheet addNewSheet();

    /**
     * Removes the ith "sheet" element
     */
    void removeSheet(int i);
}
