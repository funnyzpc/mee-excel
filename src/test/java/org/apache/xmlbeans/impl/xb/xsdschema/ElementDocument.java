/*
 * An XML document type.
 * Localname: element
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one element(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface ElementDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.ElementDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "element7f99doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "element" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement getElement();

    /**
     * Sets the "element" element
     */
    void setElement(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement element);

    /**
     * Appends and returns a new empty "element" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement addNewElement();
}
