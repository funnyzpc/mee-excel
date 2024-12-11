/*
 * XML Type:  CT_SheetData
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_SheetData(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheetData extends XmlObject {
    DocumentFactory<CTSheetData> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsheetdata8408type");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "row" elements
     */
    java.util.List<CTRow> getRowList();

    /**
     * Gets array of all "row" elements
     */
    CTRow[] getRowArray();

    /**
     * Gets ith "row" element
     */
    CTRow getRowArray(int i);

    /**
     * Returns number of "row" element
     */
    int sizeOfRowArray();

    /**
     * Sets array of all "row" element
     */
    void setRowArray(CTRow[] rowArray);

    /**
     * Sets ith "row" element
     */
    void setRowArray(int i, CTRow row);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "row" element
     */
    CTRow insertNewRow(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "row" element
     */
    CTRow addNewRow();

    /**
     * Removes the ith "row" element
     */
    void removeRow(int i);
}
