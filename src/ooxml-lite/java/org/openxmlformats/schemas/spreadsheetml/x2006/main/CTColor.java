/*
 * XML Type:  CT_Color
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTColor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Color(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTColor extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTColor> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcolord2c2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();

    /**
     * Sets the "rgb" attribute
     */
    void setRgb(byte[] rgb);
    /**
     * Sets the "indexed" attribute
     */
    void setIndexed(long indexed);

    /**
     * Gets the "auto" attribute
     */
    boolean getAuto();
    /**
     * Sets the "auto" attribute
     */
    void setAuto(boolean auto);
    /**
     * True if has "indexed" attribute
     */
    boolean isSetIndexed();
    /**
     * True if has "rgb" attribute
     */
    boolean isSetRgb();
    /**
     * True if has "theme" attribute
     */
    boolean isSetTheme();
    /**
     * Gets the "rgb" attribute
     */
    byte[] getRgb();
    /**
     * Sets the "theme" attribute
     */
    void setTheme(long theme);

    /**
     * Gets the "tint" attribute
     */
    double getTint();

    /**
     * Gets the "theme" attribute
     */
    long getTheme();
    /**
     * True if has "tint" attribute
     */
    boolean isSetTint();
    /**
     * Gets the "indexed" attribute
     */
    long getIndexed();
    /**
     * Sets the "tint" attribute
     */
    void setTint(double tint);

    /**
     * Unsets the "indexed" attribute
     */
    void unsetIndexed();
    /**
     * True if has "auto" attribute
     */
    boolean isSetAuto();

}
