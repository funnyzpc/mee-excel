/*
 * An XML document type.
 * Localname: schema
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one schema(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface SchemaDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "schema0782doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "schema" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema getSchema();

    /**
     * Sets the "schema" element
     */
    void setSchema(org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema schema);

    /**
     * Appends and returns a new empty "schema" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema addNewSchema();

    /**
     * An XML schema(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Schema extends org.apache.xmlbeans.impl.xb.xsdschema.OpenAttrs {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "schemad77felemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


    }
}
