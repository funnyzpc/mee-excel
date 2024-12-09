/*
 * XML Type:  CT_BookViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_BookViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTBookViews extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTBookViews> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctbookviewsb864type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "workbookView" elements
     */
    java.util.List<CTBookView> getWorkbookViewList();

    /**
     * Gets array of all "workbookView" elements
     */
    CTBookView[] getWorkbookViewArray();

    /**
     * Gets ith "workbookView" element
     */
    CTBookView getWorkbookViewArray(int i);

    /**
     * Returns number of "workbookView" element
     */
    int sizeOfWorkbookViewArray();

    /**
     * Sets array of all "workbookView" element
     */
    void setWorkbookViewArray(CTBookView[] workbookViewArray);

    /**
     * Sets ith "workbookView" element
     */
    void setWorkbookViewArray(int i, CTBookView workbookView);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "workbookView" element
     */
    CTBookView insertNewWorkbookView(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "workbookView" element
     */
    CTBookView addNewWorkbookView();

    /**
     * Removes the ith "workbookView" element
     */
    void removeWorkbookView(int i);
}
