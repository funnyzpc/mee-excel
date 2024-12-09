/*
 * An XML document type.
 * Localname: length
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.LengthDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one length(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface LengthDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.LengthDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "length7edddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "length" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getLength();

    /**
     * Sets the "length" element
     */
    void setLength(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet length);

    /**
     * Appends and returns a new empty "length" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewLength();
}
