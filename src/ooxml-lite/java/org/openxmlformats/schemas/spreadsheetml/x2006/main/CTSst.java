/*
 * XML Type:  CT_Sst
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Sst(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSst extends XmlObject {
    DocumentFactory<CTSst> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsst44f3type");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "si" elements
     */
    java.util.List<CTRst> getSiList();

    /**
     * Gets array of all "si" elements
     */
    CTRst[] getSiArray();

    /**
     * Gets ith "si" element
     */
    CTRst getSiArray(int i);

    /**
     * Returns number of "si" element
     */
    int sizeOfSiArray();

    /**
     * Sets array of all "si" element
     */
    void setSiArray(CTRst[] siArray);

    /**
     * Sets ith "si" element
     */
    void setSiArray(int i, CTRst si);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "si" element
     */
    CTRst insertNewSi(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "si" element
     */
    CTRst addNewSi();

    /**
     * Removes the ith "si" element
     */
    void removeSi(int i);

//    /**
//     * Gets the "extLst" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();
//
//    /**
//     * True if has "extLst" element
//     */
//    boolean isSetExtLst();
//
//    /**
//     * Sets the "extLst" element
//     */
//    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);
//
//    /**
//     * Appends and returns a new empty "extLst" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();

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

    /**
     * Gets the "uniqueCount" attribute
     */
    long getUniqueCount();

    /**
     * Gets (as xml) the "uniqueCount" attribute
     */
    XmlUnsignedInt xgetUniqueCount();

    /**
     * True if has "uniqueCount" attribute
     */
    boolean isSetUniqueCount();

    /**
     * Sets the "uniqueCount" attribute
     */
    void setUniqueCount(long uniqueCount);

//    /**
//     * Sets (as xml) the "uniqueCount" attribute
//     */
//    void xsetUniqueCount(org.apache.xmlbeans.XmlUnsignedInt uniqueCount);
//
//    /**
//     * Unsets the "uniqueCount" attribute
//     */
//    void unsetUniqueCount();
}
