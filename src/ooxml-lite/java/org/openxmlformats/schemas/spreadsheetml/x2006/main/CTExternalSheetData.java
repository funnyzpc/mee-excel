/*
 * XML Type:  CT_ExternalSheetData
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_ExternalSheetData(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalSheetData extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTExternalSheetData> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctexternalsheetdatafd3dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "row" elements
     */
    java.util.List<CTExternalRow> getRowList();

    /**
     * Gets array of all "row" elements
     */
    CTExternalRow[] getRowArray();

    /**
     * Gets ith "row" element
     */
    CTExternalRow getRowArray(int i);

    /**
     * Returns number of "row" element
     */
    int sizeOfRowArray();

    /**
     * Sets array of all "row" element
     */
    void setRowArray(CTExternalRow[] rowArray);

    /**
     * Sets ith "row" element
     */
    void setRowArray(int i, CTExternalRow row);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "row" element
     */
    CTExternalRow insertNewRow(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "row" element
     */
    CTExternalRow addNewRow();

    /**
     * Removes the ith "row" element
     */
    void removeRow(int i);

    /**
     * Gets the "sheetId" attribute
     */
    long getSheetId();

    /**
     * Gets (as xml) the "sheetId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetSheetId();

    /**
     * Sets the "sheetId" attribute
     */
    void setSheetId(long sheetId);

    /**
     * Sets (as xml) the "sheetId" attribute
     */
    void xsetSheetId(org.apache.xmlbeans.XmlUnsignedInt sheetId);

    /**
     * Gets the "refreshError" attribute
     */
    boolean getRefreshError();

    /**
     * Gets (as xml) the "refreshError" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRefreshError();

    /**
     * True if has "refreshError" attribute
     */
    boolean isSetRefreshError();

    /**
     * Sets the "refreshError" attribute
     */
    void setRefreshError(boolean refreshError);

    /**
     * Sets (as xml) the "refreshError" attribute
     */
    void xsetRefreshError(org.apache.xmlbeans.XmlBoolean refreshError);

    /**
     * Unsets the "refreshError" attribute
     */
    void unsetRefreshError();
}
