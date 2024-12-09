/*
 * An XML document type.
 * Localname: maxLength
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.MaxLengthDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one maxLength(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface MaxLengthDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.MaxLengthDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "maxlengthf8abdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "maxLength" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getMaxLength();

    /**
     * Sets the "maxLength" element
     */
    void setMaxLength(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet maxLength);

    /**
     * Appends and returns a new empty "maxLength" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewMaxLength();
}
