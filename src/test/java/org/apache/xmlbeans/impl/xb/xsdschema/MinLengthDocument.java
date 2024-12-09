/*
 * An XML document type.
 * Localname: minLength
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.MinLengthDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one minLength(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface MinLengthDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.MinLengthDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "minlengthe7fddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "minLength" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getMinLength();

    /**
     * Sets the "minLength" element
     */
    void setMinLength(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet minLength);

    /**
     * Appends and returns a new empty "minLength" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewMinLength();
}
