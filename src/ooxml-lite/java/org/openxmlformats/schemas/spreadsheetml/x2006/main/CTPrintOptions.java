/*
 * XML Type:  CT_PrintOptions
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_PrintOptions(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPrintOptions extends XmlObject {
    DocumentFactory<CTPrintOptions> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctprintoptions943atype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "horizontalCentered" attribute
     */
    boolean getHorizontalCentered();

    /**
     * Gets (as xml) the "horizontalCentered" attribute
     */
    XmlBoolean xgetHorizontalCentered();

    /**
     * True if has "horizontalCentered" attribute
     */
    boolean isSetHorizontalCentered();

    /**
     * Sets the "horizontalCentered" attribute
     */
    void setHorizontalCentered(boolean horizontalCentered);

    /**
     * Sets (as xml) the "horizontalCentered" attribute
     */
    void xsetHorizontalCentered(XmlBoolean horizontalCentered);

    /**
     * Unsets the "horizontalCentered" attribute
     */
    void unsetHorizontalCentered();

    /**
     * Gets the "verticalCentered" attribute
     */
    boolean getVerticalCentered();

    /**
     * Gets (as xml) the "verticalCentered" attribute
     */
    XmlBoolean xgetVerticalCentered();

    /**
     * True if has "verticalCentered" attribute
     */
    boolean isSetVerticalCentered();

    /**
     * Sets the "verticalCentered" attribute
     */
    void setVerticalCentered(boolean verticalCentered);

    /**
     * Sets (as xml) the "verticalCentered" attribute
     */
    void xsetVerticalCentered(XmlBoolean verticalCentered);

    /**
     * Unsets the "verticalCentered" attribute
     */
    void unsetVerticalCentered();

    /**
     * Gets the "headings" attribute
     */
    boolean getHeadings();

    /**
     * Gets (as xml) the "headings" attribute
     */
    XmlBoolean xgetHeadings();

    /**
     * True if has "headings" attribute
     */
    boolean isSetHeadings();

    /**
     * Sets the "headings" attribute
     */
    void setHeadings(boolean headings);

    /**
     * Sets (as xml) the "headings" attribute
     */
    void xsetHeadings(XmlBoolean headings);

    /**
     * Unsets the "headings" attribute
     */
    void unsetHeadings();

    /**
     * Gets the "gridLines" attribute
     */
    boolean getGridLines();

    /**
     * Gets (as xml) the "gridLines" attribute
     */
    XmlBoolean xgetGridLines();

    /**
     * True if has "gridLines" attribute
     */
    boolean isSetGridLines();

    /**
     * Sets the "gridLines" attribute
     */
    void setGridLines(boolean gridLines);

    /**
     * Sets (as xml) the "gridLines" attribute
     */
    void xsetGridLines(XmlBoolean gridLines);

    /**
     * Unsets the "gridLines" attribute
     */
    void unsetGridLines();

    /**
     * Gets the "gridLinesSet" attribute
     */
    boolean getGridLinesSet();

    /**
     * Gets (as xml) the "gridLinesSet" attribute
     */
    XmlBoolean xgetGridLinesSet();

    /**
     * True if has "gridLinesSet" attribute
     */
    boolean isSetGridLinesSet();

    /**
     * Sets the "gridLinesSet" attribute
     */
    void setGridLinesSet(boolean gridLinesSet);

    /**
     * Sets (as xml) the "gridLinesSet" attribute
     */
    void xsetGridLinesSet(XmlBoolean gridLinesSet);

    /**
     * Unsets the "gridLinesSet" attribute
     */
    void unsetGridLinesSet();
}
