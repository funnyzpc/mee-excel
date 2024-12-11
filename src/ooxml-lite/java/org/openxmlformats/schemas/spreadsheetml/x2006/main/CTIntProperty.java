/*
 * XML Type:  CT_IntProperty
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlInt;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_IntProperty(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTIntProperty extends XmlObject {
    DocumentFactory<CTIntProperty> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctintproperty32c3type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    int getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    XmlInt xgetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(int val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(XmlInt val);
}
