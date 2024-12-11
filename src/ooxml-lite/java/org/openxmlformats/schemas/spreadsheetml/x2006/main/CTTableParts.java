/*
 * XML Type:  CT_TableParts
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_TableParts(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTableParts extends XmlObject {
    DocumentFactory<CTTableParts> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cttablepartsf6bbtype");
    SchemaType type = Factory.getType();


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
