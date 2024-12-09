/*
 * An XML document type.
 * Localname: sst
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.SstDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * A document containing one sst(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface SstDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<SstDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "sstf81fdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "sst" element
     */
    CTSst getSst();

    /**
     * Sets the "sst" element
     */
    void setSst(CTSst sst);

    /**
     * Appends and returns a new empty "sst" element
     */
    CTSst addNewSst();
}
