/*
 * An XML document type.
 * Localname: fractionDigits
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.FractionDigitsDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one fractionDigits(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface FractionDigitsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.FractionDigitsDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "fractiondigitsed7bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "fractionDigits" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getFractionDigits();

    /**
     * Sets the "fractionDigits" element
     */
    void setFractionDigits(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet fractionDigits);

    /**
     * Appends and returns a new empty "fractionDigits" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewFractionDigits();
}
