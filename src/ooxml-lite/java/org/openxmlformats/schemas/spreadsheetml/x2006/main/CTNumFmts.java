/*
 * XML Type:  CT_NumFmts
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_NumFmts(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTNumFmts extends XmlObject {
    DocumentFactory<CTNumFmts> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctnumfmtsb58btype");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "numFmt" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt> getNumFmtList();

    /**
     * Gets array of all "numFmt" elements
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt[] getNumFmtArray();

    /**
     * Gets ith "numFmt" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt getNumFmtArray(int i);

    /**
     * Returns number of "numFmt" element
     */
    int sizeOfNumFmtArray();

    /**
     * Sets array of all "numFmt" element
     */
    void setNumFmtArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt[] numFmtArray);

    /**
     * Sets ith "numFmt" element
     */
    void setNumFmtArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt numFmt);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "numFmt" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt insertNewNumFmt(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "numFmt" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt addNewNumFmt();

    /**
     * Removes the ith "numFmt" element
     */
    void removeNumFmt(int i);

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
