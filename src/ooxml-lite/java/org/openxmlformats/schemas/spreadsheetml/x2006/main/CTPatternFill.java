/*
 * XML Type:  CT_PatternFill
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_PatternFill(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPatternFill extends XmlObject {
    DocumentFactory<CTPatternFill> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctpatternfill7452type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "fgColor" element
     */
    CTColor getFgColor();

    /**
     * True if has "fgColor" element
     */
    boolean isSetFgColor();

    /**
     * Sets the "fgColor" element
     */
    void setFgColor(CTColor fgColor);

    /**
     * Appends and returns a new empty "fgColor" element
     */
    CTColor addNewFgColor();

    /**
     * Unsets the "fgColor" element
     */
    void unsetFgColor();

    /**
     * Gets the "bgColor" element
     */
    CTColor getBgColor();

    /**
     * True if has "bgColor" element
     */
    boolean isSetBgColor();

    /**
     * Sets the "bgColor" element
     */
    void setBgColor(CTColor bgColor);

    /**
     * Appends and returns a new empty "bgColor" element
     */
    CTColor addNewBgColor();

    /**
     * Unsets the "bgColor" element
     */
    void unsetBgColor();

    /**
     * Gets the "patternType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType.Enum getPatternType();

    /**
     * Gets (as xml) the "patternType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType xgetPatternType();

    /**
     * True if has "patternType" attribute
     */
    boolean isSetPatternType();

    /**
     * Sets the "patternType" attribute
     */
    void setPatternType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType.Enum patternType);

    /**
     * Sets (as xml) the "patternType" attribute
     */
    void xsetPatternType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType patternType);

    /**
     * Unsets the "patternType" attribute
     */
    void unsetPatternType();
}
