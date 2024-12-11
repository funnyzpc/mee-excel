/*
 * XML Type:  CT_Dxfs
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Dxfs(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDxfs extends XmlObject {
    DocumentFactory<CTDxfs> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdxfsb26atype");
    SchemaType type = Factory.getType();


    /**
     * Gets array of all "dxf" elements
     */
    CTDxf[] getDxfArray();
    /**
     * Sets array of all "dxf" element
     */
    void setDxfArray(CTDxf[] dxfArray);


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
