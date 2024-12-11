/*
 * XML Type:  CT_X
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlInt;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_X(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTX extends XmlObject {
    DocumentFactory<CTX> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctx8517type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "v" attribute
     */
    int getV();

    /**
     * Gets (as xml) the "v" attribute
     */
    XmlInt xgetV();

    /**
     * True if has "v" attribute
     */
    boolean isSetV();

    /**
     * Sets the "v" attribute
     */
    void setV(int v);

    /**
     * Sets (as xml) the "v" attribute
     */
    void xsetV(XmlInt v);

    /**
     * Unsets the "v" attribute
     */
    void unsetV();
}
