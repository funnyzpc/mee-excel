/*
 * XML Type:  CT_Fills
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Fills(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFills extends XmlObject {
    DocumentFactory<CTFills> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfills2c6ftype");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "fill" elements
     */
    java.util.List<CTFill> getFillList();

    /**
     * Gets array of all "fill" elements
     */
    CTFill[] getFillArray();

    /**
     * Gets ith "fill" element
     */
    CTFill getFillArray(int i);

    /**
     * Returns number of "fill" element
     */
    int sizeOfFillArray();

    /**
     * Sets array of all "fill" element
     */
    void setFillArray(CTFill[] fillArray);

    /**
     * Sets ith "fill" element
     */
    void setFillArray(int i, CTFill fill);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "fill" element
     */
    CTFill insertNewFill(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "fill" element
     */
    CTFill addNewFill();

    /**
     * Removes the ith "fill" element
     */
    void removeFill(int i);

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
