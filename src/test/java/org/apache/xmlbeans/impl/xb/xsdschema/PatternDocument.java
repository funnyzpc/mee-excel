/*
 * An XML document type.
 * Localname: pattern
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one pattern(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface PatternDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "pattern9585doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "pattern" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern getPattern();

    /**
     * Sets the "pattern" element
     */
    void setPattern(org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern pattern);

    /**
     * Appends and returns a new empty "pattern" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern addNewPattern();

    /**
     * An XML pattern(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Pattern extends org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "pattern6809elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();

    }
}
