/*
 * An XML document type.
 * Localname: choice
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ChoiceDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one choice(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface ChoiceDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.ChoiceDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "choicedf82doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "choice" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getChoice();

    /**
     * Sets the "choice" element
     */
    void setChoice(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup choice);

    /**
     * Appends and returns a new empty "choice" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewChoice();
}
