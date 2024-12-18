/*
 * XML Type:  CT_Fonts
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Fonts(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFonts extends XmlObject {
    DocumentFactory<CTFonts> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfonts6623type");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "font" elements
     */
    java.util.List<CTFont> getFontList();

    /**
     * Gets array of all "font" elements
     */
    CTFont[] getFontArray();

    /**
     * Gets ith "font" element
     */
    CTFont getFontArray(int i);

    /**
     * Returns number of "font" element
     */
    int sizeOfFontArray();

    /**
     * Sets array of all "font" element
     */
    void setFontArray(CTFont[] fontArray);

    /**
     * Sets ith "font" element
     */
    void setFontArray(int i, CTFont font);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "font" element
     */
    CTFont insertNewFont(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "font" element
     */
    CTFont addNewFont();

    /**
     * Removes the ith "font" element
     */
    void removeFont(int i);

    /**
     * Gets the "count" attribute
     */
    long getCount();

    /**
     * Gets (as xml) the "count" attribute
     */
    XmlUnsignedInt xgetCount();

    /**
     * True if has "count" attribute
     */
    boolean isSetCount();

    /**
     * Sets the "count" attribute
     */
    void setCount(long count);

    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(XmlUnsignedInt count);

    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
}
