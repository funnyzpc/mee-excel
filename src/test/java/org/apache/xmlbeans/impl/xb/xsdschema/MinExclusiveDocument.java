/*
 * An XML document type.
 * Localname: minExclusive
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.MinExclusiveDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one minExclusive(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface MinExclusiveDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.MinExclusiveDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "minexclusive64d7doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "minExclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet getMinExclusive();

    /**
     * Sets the "minExclusive" element
     */
    void setMinExclusive(org.apache.xmlbeans.impl.xb.xsdschema.Facet minExclusive);

    /**
     * Appends and returns a new empty "minExclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMinExclusive();
}
