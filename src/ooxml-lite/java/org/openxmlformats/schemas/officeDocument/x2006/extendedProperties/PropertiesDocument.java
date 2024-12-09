/*
 * An XML document type.
 * Localname: Properties
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/extended-properties
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.PropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.extendedProperties;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * A document containing one Properties(@http://schemas.openxmlformats.org/officeDocument/2006/extended-properties) element.
 *
 * This is a complex type.
 */
public interface PropertiesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<PropertiesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "propertiesee84doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Properties" element
     */
    CTProperties getProperties();

    /**
     * Sets the "Properties" element
     */
    void setProperties(CTProperties properties);

    /**
     * Appends and returns a new empty "Properties" element
     */
    CTProperties addNewProperties();
}
