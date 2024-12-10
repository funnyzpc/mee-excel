/*
 * An XML document type.
 * Localname: key
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.KeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one key(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface KeyDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.KeyDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "key5d16doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "key" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Keybase getKey();

    /**
     * Sets the "key" element
     */
    void setKey(org.apache.xmlbeans.impl.xb.xsdschema.Keybase key);

    /**
     * Appends and returns a new empty "key" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Keybase addNewKey();
}
