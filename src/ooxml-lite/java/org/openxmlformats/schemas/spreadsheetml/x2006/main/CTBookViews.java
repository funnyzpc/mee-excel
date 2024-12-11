/*
 * XML Type:  CT_BookViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_BookViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTBookViews extends XmlObject {
    DocumentFactory<CTBookViews> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctbookviewsb864type");
    SchemaType type = Factory.getType();



    /**
     * Gets array of all "workbookView" elements
     */
    CTBookView[] getWorkbookViewArray();

    /**
     * Gets ith "workbookView" element
     */
    CTBookView getWorkbookViewArray(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "workbookView" element
     */
    CTBookView addNewWorkbookView();

}
