/*
 * An XML document type.
 * Localname: table
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.TableDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * A document containing one table(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface TableDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<TableDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "table0b99doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "table" element
     */
    CTTable getTable();

    /**
     * Sets the "table" element
     */
    void setTable(CTTable table);

    /**
     * Appends and returns a new empty "table" element
     */
    CTTable addNewTable();
}
