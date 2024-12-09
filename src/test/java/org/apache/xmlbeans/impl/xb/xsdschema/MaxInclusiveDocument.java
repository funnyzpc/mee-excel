/*
 * An XML document type.
 * Localname: maxInclusive
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.MaxInclusiveDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one maxInclusive(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface MaxInclusiveDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.MaxInclusiveDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "maxinclusive93dbdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "maxInclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet getMaxInclusive();

    /**
     * Sets the "maxInclusive" element
     */
    void setMaxInclusive(org.apache.xmlbeans.impl.xb.xsdschema.Facet maxInclusive);

    /**
     * Appends and returns a new empty "maxInclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMaxInclusive();
}
