/*
 * XML Type:  CT_FontFamily
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontFamily
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_FontFamily(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFontFamily extends XmlObject {
    DocumentFactory<CTFontFamily> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfontfamily685ctype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    int getVal();

//    /**
//     * Gets (as xml) the "val" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontFamily xgetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(int val);

//    /**
//     * Sets (as xml) the "val" attribute
//     */
//    void xsetVal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontFamily val);
}
