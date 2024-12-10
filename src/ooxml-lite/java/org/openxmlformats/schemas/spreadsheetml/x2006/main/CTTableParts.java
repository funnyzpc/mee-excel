/*
 * XML Type:  CT_TableParts
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_TableParts(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTableParts extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTTableParts> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cttablepartsf6bbtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets ith "tablePart" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart getTablePartArray(int i);

    /**
     * Returns number of "tablePart" element
     */
    int sizeOfTablePartArray();


    /**
     * Removes the ith "tablePart" element
     */
    void removeTablePart(int i);

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
