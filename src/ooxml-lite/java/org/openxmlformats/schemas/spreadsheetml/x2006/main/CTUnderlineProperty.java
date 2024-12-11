/*
 * XML Type:  CT_UnderlineProperty
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_UnderlineProperty(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTUnderlineProperty extends XmlObject {
    DocumentFactory<CTUnderlineProperty> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctunderlineproperty8e20type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues.Enum getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues xgetVal();

    /**
     * True if has "val" attribute
     */
    boolean isSetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues.Enum val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues val);

    /**
     * Unsets the "val" attribute
     */
    void unsetVal();
}
