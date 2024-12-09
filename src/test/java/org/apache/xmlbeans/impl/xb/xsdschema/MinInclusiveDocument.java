/*
 * An XML document type.
 * Localname: minInclusive
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.MinInclusiveDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one minInclusive(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface MinInclusiveDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.MinInclusiveDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "mininclusive8b49doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "minInclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet getMinInclusive();

    /**
     * Sets the "minInclusive" element
     */
    void setMinInclusive(org.apache.xmlbeans.impl.xb.xsdschema.Facet minInclusive);

    /**
     * Appends and returns a new empty "minInclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMinInclusive();
}
