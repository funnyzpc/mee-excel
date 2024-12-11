/*
 * XML Type:  CT_BooleanProperty
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_BooleanProperty(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTBooleanProperty extends XmlObject {
    DocumentFactory<CTBooleanProperty> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctbooleanproperty1f3ctype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    boolean getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    XmlBoolean xgetVal();

    /**
     * True if has "val" attribute
     */
    boolean isSetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(boolean val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(XmlBoolean val);

    /**
     * Unsets the "val" attribute
     */
    void unsetVal();
}
