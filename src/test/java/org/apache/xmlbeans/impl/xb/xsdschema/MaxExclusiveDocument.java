/*
 * An XML document type.
 * Localname: maxExclusive
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.MaxExclusiveDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one maxExclusive(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface MaxExclusiveDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.MaxExclusiveDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "maxexclusive6d69doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "maxExclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet getMaxExclusive();

    /**
     * Sets the "maxExclusive" element
     */
    void setMaxExclusive(org.apache.xmlbeans.impl.xb.xsdschema.Facet maxExclusive);

    /**
     * Appends and returns a new empty "maxExclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMaxExclusive();
}
