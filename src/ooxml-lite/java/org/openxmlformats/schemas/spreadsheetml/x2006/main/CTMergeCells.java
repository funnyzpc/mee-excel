/*
 * XML Type:  CT_MergeCells
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_MergeCells(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMergeCells extends XmlObject {
    DocumentFactory<CTMergeCells> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctmergecells1242type");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "mergeCell" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell> getMergeCellList();

    /**
     * Gets array of all "mergeCell" elements
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell[] getMergeCellArray();

    /**
     * Gets ith "mergeCell" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell getMergeCellArray(int i);

    /**
     * Returns number of "mergeCell" element
     */
    int sizeOfMergeCellArray();

    /**
     * Sets array of all "mergeCell" element
     */
    void setMergeCellArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell[] mergeCellArray);

    /**
     * Sets ith "mergeCell" element
     */
    void setMergeCellArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell mergeCell);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "mergeCell" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell insertNewMergeCell(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "mergeCell" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell addNewMergeCell();

    /**
     * Removes the ith "mergeCell" element
     */
    void removeMergeCell(int i);

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
