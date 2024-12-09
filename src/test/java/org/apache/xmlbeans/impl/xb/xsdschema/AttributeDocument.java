/*
 * An XML document type.
 * Localname: attribute
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one attribute(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface AttributeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.AttributeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "attributeedb9doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "attribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute getAttribute();

    /**
     * Sets the "attribute" element
     */
    void setAttribute(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute attribute);

    /**
     * Appends and returns a new empty "attribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute addNewAttribute();
}
