/*
 * An XML document type.
 * Localname: totalDigits
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one totalDigits(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface TotalDigitsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "totaldigits4a8bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "totalDigits" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits getTotalDigits();

    /**
     * Sets the "totalDigits" element
     */
    void setTotalDigits(org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits totalDigits);

    /**
     * Appends and returns a new empty "totalDigits" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits addNewTotalDigits();

    /**
     * An XML totalDigits(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface TotalDigits extends org.apache.xmlbeans.impl.xb.xsdschema.NumFacet {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "totaldigits2615elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();

    }
}
