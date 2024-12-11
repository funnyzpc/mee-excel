/*
 * XML Type:  CT_ExternalRow
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_ExternalRow(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalRow extends XmlObject {
    DocumentFactory<CTExternalRow> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctexternalrowa22etype");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "cell" elements
     */
    java.util.List<CTExternalCell> getCellList();

    /**
     * Gets array of all "cell" elements
     */
    CTExternalCell[] getCellArray();

    /**
     * Gets ith "cell" element
     */
    CTExternalCell getCellArray(int i);

    /**
     * Returns number of "cell" element
     */
    int sizeOfCellArray();

    /**
     * Sets array of all "cell" element
     */
    void setCellArray(CTExternalCell[] cellArray);

    /**
     * Sets ith "cell" element
     */
    void setCellArray(int i, CTExternalCell cell);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "cell" element
     */
    CTExternalCell insertNewCell(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "cell" element
     */
    CTExternalCell addNewCell();

    /**
     * Removes the ith "cell" element
     */
    void removeCell(int i);

    /**
     * Gets the "r" attribute
     */
    long getR();

    /**
     * Gets (as xml) the "r" attribute
     */
    XmlUnsignedInt xgetR();

    /**
     * Sets the "r" attribute
     */
    void setR(long r);

    /**
     * Sets (as xml) the "r" attribute
     */
    void xsetR(XmlUnsignedInt r);
}
