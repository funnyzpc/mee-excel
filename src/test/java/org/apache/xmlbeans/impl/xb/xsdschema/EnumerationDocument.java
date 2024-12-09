/*
 * An XML document type.
 * Localname: enumeration
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.EnumerationDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one enumeration(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface EnumerationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.EnumerationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "enumeration052edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "enumeration" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet getEnumeration();

    /**
     * Sets the "enumeration" element
     */
    void setEnumeration(org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet enumeration);

    /**
     * Appends and returns a new empty "enumeration" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet addNewEnumeration();
}
