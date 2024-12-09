/*
 * An XML document type.
 * Localname: sequence
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SequenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one sequence(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface SequenceDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.SequenceDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "sequencecba2doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "sequence" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getSequence();

    /**
     * Sets the "sequence" element
     */
    void setSequence(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup sequence);

    /**
     * Appends and returns a new empty "sequence" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewSequence();
}
