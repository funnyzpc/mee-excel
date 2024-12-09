/*
 * XML Type:  CT_SheetViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_SheetViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheetViews extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTSheetViews> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsheetviewsb918type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "sheetView" elements
     */
    java.util.List<CTSheetView> getSheetViewList();

    /**
     * Gets array of all "sheetView" elements
     */
    CTSheetView[] getSheetViewArray();

    /**
     * Gets ith "sheetView" element
     */
    CTSheetView getSheetViewArray(int i);

    /**
     * Returns number of "sheetView" element
     */
    int sizeOfSheetViewArray();

    /**
     * Sets array of all "sheetView" element
     */
    void setSheetViewArray(CTSheetView[] sheetViewArray);

    /**
     * Sets ith "sheetView" element
     */
    void setSheetViewArray(int i, CTSheetView sheetView);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheetView" element
     */
    CTSheetView insertNewSheetView(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "sheetView" element
     */
    CTSheetView addNewSheetView();

    /**
     * Removes the ith "sheetView" element
     */
    void removeSheetView(int i);

//    /**
//     * Gets the "extLst" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();

    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
}
