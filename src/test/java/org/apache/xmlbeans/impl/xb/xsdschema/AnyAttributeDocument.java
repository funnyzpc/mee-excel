/*
 * An XML document type.
 * Localname: anyAttribute
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AnyAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one anyAttribute(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface AnyAttributeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.AnyAttributeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "anyattribute23b3doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "anyAttribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Wildcard getAnyAttribute();

    /**
     * Sets the "anyAttribute" element
     */
    void setAnyAttribute(org.apache.xmlbeans.impl.xb.xsdschema.Wildcard anyAttribute);

    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Wildcard addNewAnyAttribute();
}
