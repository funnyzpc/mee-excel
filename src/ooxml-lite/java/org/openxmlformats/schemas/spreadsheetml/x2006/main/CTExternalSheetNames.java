/*
 * XML Type:  CT_ExternalSheetNames
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_ExternalSheetNames(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalSheetNames extends XmlObject {
    DocumentFactory<CTExternalSheetNames> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctexternalsheetnames7eddtype");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "sheetName" elements
     */
    java.util.List<CTExternalSheetName> getSheetNameList();

    /**
     * Gets array of all "sheetName" elements
     */
    CTExternalSheetName[] getSheetNameArray();

    /**
     * Gets ith "sheetName" element
     */
    CTExternalSheetName getSheetNameArray(int i);

    /**
     * Returns number of "sheetName" element
     */
    int sizeOfSheetNameArray();

    /**
     * Sets array of all "sheetName" element
     */
    void setSheetNameArray(CTExternalSheetName[] sheetNameArray);

    /**
     * Sets ith "sheetName" element
     */
    void setSheetNameArray(int i, CTExternalSheetName sheetName);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheetName" element
     */
    CTExternalSheetName insertNewSheetName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "sheetName" element
     */
    CTExternalSheetName addNewSheetName();

    /**
     * Removes the ith "sheetName" element
     */
    void removeSheetName(int i);
}
