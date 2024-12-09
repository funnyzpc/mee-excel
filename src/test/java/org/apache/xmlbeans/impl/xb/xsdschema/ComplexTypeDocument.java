/*
 * An XML document type.
 * Localname: complexType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ComplexTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one complexType(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface ComplexTypeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.ComplexTypeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "complextype83cbdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "complexType" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType getComplexType();

    /**
     * Sets the "complexType" element
     */
    void setComplexType(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType complexType);

    /**
     * Appends and returns a new empty "complexType" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType addNewComplexType();
}
