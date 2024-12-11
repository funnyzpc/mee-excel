/*
 * XML Type:  CT_Sheets
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Sheets(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheets extends XmlObject {
    DocumentFactory<CTSheets> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsheets49fdtype");
    SchemaType type = Factory.getType();


    /**
     * Gets array of all "sheet" elements
     */
    CTSheet[] getSheetArray();

    /**
     * Gets ith "sheet" element
     */
    CTSheet getSheetArray(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "sheet" element
     */
    CTSheet addNewSheet();

    /**
     * Removes the ith "sheet" element
     */
    void removeSheet(int i);
}
