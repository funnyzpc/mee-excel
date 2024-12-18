/*
 * XML Type:  CT_Field
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlInt;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Field(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTField extends XmlObject {
    DocumentFactory<CTField> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfieldc999type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "x" attribute
     */
    int getX();

    /**
     * Gets (as xml) the "x" attribute
     */
    XmlInt xgetX();

    /**
     * Sets the "x" attribute
     */
    void setX(int x);

    /**
     * Sets (as xml) the "x" attribute
     */
    void xsetX(XmlInt x);
}
