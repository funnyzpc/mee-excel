/*
 * XML Type:  CT_IndexedColors
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_IndexedColors(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTIndexedColors extends XmlObject {
    DocumentFactory<CTIndexedColors> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctindexedcolorsa0a0type");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "rgbColor" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor> getRgbColorList();

//    /**
//     * Gets array of all "rgbColor" elements
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor[] getRgbColorArray();

    /**
     * Gets ith "rgbColor" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor getRgbColorArray(int i);

    /**
     * Returns number of "rgbColor" element
     */
    int sizeOfRgbColorArray();

//    /**
//     * Sets array of all "rgbColor" element
//     */
//    void setRgbColorArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor[] rgbColorArray);

    /**
     * Sets ith "rgbColor" element
     */
    void setRgbColorArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor rgbColor);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "rgbColor" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor insertNewRgbColor(int i);

//    /**
//     * Appends and returns a new empty value (as xml) as the last "rgbColor" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor addNewRgbColor();

    /**
     * Removes the ith "rgbColor" element
     */
    void removeRgbColor(int i);
}
