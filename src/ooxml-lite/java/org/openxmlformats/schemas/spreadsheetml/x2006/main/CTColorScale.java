/*
 * XML Type:  CT_ColorScale
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_ColorScale(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTColorScale extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTColorScale> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcolorscale1a70type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "cfvo" elements
     */
    java.util.List<CTCfvo> getCfvoList();

    /**
     * Gets array of all "cfvo" elements
     */
    CTCfvo[] getCfvoArray();

    /**
     * Gets ith "cfvo" element
     */
    CTCfvo getCfvoArray(int i);

    /**
     * Returns number of "cfvo" element
     */
    int sizeOfCfvoArray();

    /**
     * Sets array of all "cfvo" element
     */
    void setCfvoArray(CTCfvo[] cfvoArray);

    /**
     * Sets ith "cfvo" element
     */
    void setCfvoArray(int i, CTCfvo cfvo);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "cfvo" element
     */
    CTCfvo insertNewCfvo(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "cfvo" element
     */
    CTCfvo addNewCfvo();

    /**
     * Removes the ith "cfvo" element
     */
    void removeCfvo(int i);

    /**
     * Gets a List of "color" elements
     */
    java.util.List<CTColor> getColorList();

    /**
     * Gets array of all "color" elements
     */
    CTColor[] getColorArray();

    /**
     * Gets ith "color" element
     */
    CTColor getColorArray(int i);

    /**
     * Returns number of "color" element
     */
    int sizeOfColorArray();

    /**
     * Sets array of all "color" element
     */
    void setColorArray(CTColor[] colorArray);

    /**
     * Sets ith "color" element
     */
    void setColorArray(int i, CTColor color);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "color" element
     */
    CTColor insertNewColor(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "color" element
     */
    CTColor addNewColor();

    /**
     * Removes the ith "color" element
     */
    void removeColor(int i);
}
