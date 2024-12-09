/*
 * XML Type:  CT_ExternalSheetDataSet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_ExternalSheetDataSet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalSheetDataSet extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTExternalSheetDataSet> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctexternalsheetdataset07adtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "sheetData" elements
     */
    java.util.List<CTExternalSheetData> getSheetDataList();

    /**
     * Gets array of all "sheetData" elements
     */
    CTExternalSheetData[] getSheetDataArray();

    /**
     * Gets ith "sheetData" element
     */
    CTExternalSheetData getSheetDataArray(int i);

    /**
     * Returns number of "sheetData" element
     */
    int sizeOfSheetDataArray();

    /**
     * Sets array of all "sheetData" element
     */
    void setSheetDataArray(CTExternalSheetData[] sheetDataArray);

    /**
     * Sets ith "sheetData" element
     */
    void setSheetDataArray(int i, CTExternalSheetData sheetData);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheetData" element
     */
    CTExternalSheetData insertNewSheetData(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "sheetData" element
     */
    CTExternalSheetData addNewSheetData();

    /**
     * Removes the ith "sheetData" element
     */
    void removeSheetData(int i);
}
