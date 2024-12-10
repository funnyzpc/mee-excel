/*
 * An XML document type.
 * Localname: simpleType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SimpleTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one simpleType(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface SimpleTypeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.SimpleTypeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "simpletypedef7doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "simpleType" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType getSimpleType();

    /**
     * Sets the "simpleType" element
     */
    void setSimpleType(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType simpleType);

    /**
     * Appends and returns a new empty "simpleType" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType addNewSimpleType();
}
