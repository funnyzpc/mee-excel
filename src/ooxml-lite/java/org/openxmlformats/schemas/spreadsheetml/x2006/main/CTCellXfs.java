/*
 * XML Type:  CT_CellXfs
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_CellXfs(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCellXfs extends XmlObject {
    DocumentFactory<CTCellXfs> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcellxfs1322type");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "xf" elements
     */
    java.util.List<CTXf> getXfList();

    /**
     * Gets array of all "xf" elements
     */
    CTXf[] getXfArray();

    /**
     * Gets ith "xf" element
     */
    CTXf getXfArray(int i);

    /**
     * Returns number of "xf" element
     */
    int sizeOfXfArray();

    /**
     * Sets array of all "xf" element
     */
    void setXfArray(CTXf[] xfArray);

    /**
     * Sets ith "xf" element
     */
    void setXfArray(int i, CTXf xf);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "xf" element
     */
    CTXf insertNewXf(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "xf" element
     */
    CTXf addNewXf();

    /**
     * Removes the ith "xf" element
     */
    void removeXf(int i);

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
