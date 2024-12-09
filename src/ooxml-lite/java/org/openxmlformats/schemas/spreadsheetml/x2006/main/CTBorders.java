/*
 * XML Type:  CT_Borders
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Borders(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTBorders extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTBorders> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctborders0d66type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "border" elements
     */
    java.util.List<CTBorder> getBorderList();

    /**
     * Gets array of all "border" elements
     */
    CTBorder[] getBorderArray();

    /**
     * Gets ith "border" element
     */
    CTBorder getBorderArray(int i);

    /**
     * Returns number of "border" element
     */
    int sizeOfBorderArray();

    /**
     * Sets array of all "border" element
     */
    void setBorderArray(CTBorder[] borderArray);

    /**
     * Sets ith "border" element
     */
    void setBorderArray(int i, CTBorder border);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "border" element
     */
    CTBorder insertNewBorder(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "border" element
     */
    CTBorder addNewBorder();

    /**
     * Removes the ith "border" element
     */
    void removeBorder(int i);

    /**
     * Gets the "count" attribute
     */
    long getCount();

    /**
     * Gets (as xml) the "count" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCount();

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
    void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count);

    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
}
