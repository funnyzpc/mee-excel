/*
 * XML Type:  CT_Fill
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Fill(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFill extends XmlObject {
    DocumentFactory<CTFill> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfill550ctype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "patternFill" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill getPatternFill();

    /**
     * True if has "patternFill" element
     */
    boolean isSetPatternFill();

    /**
     * Sets the "patternFill" element
     */
    void setPatternFill(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill patternFill);

    /**
     * Appends and returns a new empty "patternFill" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill addNewPatternFill();

//    /**
//     * Unsets the "patternFill" element
//     */
//    void unsetPatternFill();
//
//    /**
//     * Gets the "gradientFill" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill getGradientFill();
//
//    /**
//     * True if has "gradientFill" element
//     */
//    boolean isSetGradientFill();
//
//    /**
//     * Sets the "gradientFill" element
//     */
//    void setGradientFill(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill gradientFill);
//
//    /**
//     * Appends and returns a new empty "gradientFill" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill addNewGradientFill();
//
//    /**
//     * Unsets the "gradientFill" element
//     */
//    void unsetGradientFill();
}
