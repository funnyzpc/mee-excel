/*
 * XML Type:  CT_Location
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Location(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTLocation extends XmlObject {
    DocumentFactory<CTLocation> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctlocationc23etype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "ref" attribute
     */
    String getRef();

    /**
     * Gets (as xml) the "ref" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef();

    /**
     * Sets the "ref" attribute
     */
    void setRef(String ref);

    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref);

    /**
     * Gets the "firstHeaderRow" attribute
     */
    long getFirstHeaderRow();

    /**
     * Gets (as xml) the "firstHeaderRow" attribute
     */
    XmlUnsignedInt xgetFirstHeaderRow();

    /**
     * Sets the "firstHeaderRow" attribute
     */
    void setFirstHeaderRow(long firstHeaderRow);

    /**
     * Sets (as xml) the "firstHeaderRow" attribute
     */
    void xsetFirstHeaderRow(XmlUnsignedInt firstHeaderRow);

    /**
     * Gets the "firstDataRow" attribute
     */
    long getFirstDataRow();

    /**
     * Gets (as xml) the "firstDataRow" attribute
     */
    XmlUnsignedInt xgetFirstDataRow();

    /**
     * Sets the "firstDataRow" attribute
     */
    void setFirstDataRow(long firstDataRow);

    /**
     * Sets (as xml) the "firstDataRow" attribute
     */
    void xsetFirstDataRow(XmlUnsignedInt firstDataRow);

    /**
     * Gets the "firstDataCol" attribute
     */
    long getFirstDataCol();

    /**
     * Gets (as xml) the "firstDataCol" attribute
     */
    XmlUnsignedInt xgetFirstDataCol();

    /**
     * Sets the "firstDataCol" attribute
     */
    void setFirstDataCol(long firstDataCol);

    /**
     * Sets (as xml) the "firstDataCol" attribute
     */
    void xsetFirstDataCol(XmlUnsignedInt firstDataCol);

    /**
     * Gets the "rowPageCount" attribute
     */
    long getRowPageCount();

    /**
     * Gets (as xml) the "rowPageCount" attribute
     */
    XmlUnsignedInt xgetRowPageCount();

    /**
     * True if has "rowPageCount" attribute
     */
    boolean isSetRowPageCount();

    /**
     * Sets the "rowPageCount" attribute
     */
    void setRowPageCount(long rowPageCount);

    /**
     * Sets (as xml) the "rowPageCount" attribute
     */
    void xsetRowPageCount(XmlUnsignedInt rowPageCount);

    /**
     * Unsets the "rowPageCount" attribute
     */
    void unsetRowPageCount();

    /**
     * Gets the "colPageCount" attribute
     */
    long getColPageCount();

    /**
     * Gets (as xml) the "colPageCount" attribute
     */
    XmlUnsignedInt xgetColPageCount();

    /**
     * True if has "colPageCount" attribute
     */
    boolean isSetColPageCount();

    /**
     * Sets the "colPageCount" attribute
     */
    void setColPageCount(long colPageCount);

    /**
     * Sets (as xml) the "colPageCount" attribute
     */
    void xsetColPageCount(XmlUnsignedInt colPageCount);

    /**
     * Unsets the "colPageCount" attribute
     */
    void unsetColPageCount();
}
