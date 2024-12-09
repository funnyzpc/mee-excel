/*
 * An XML document type.
 * Localname: all
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AllDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one all(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface AllDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.AllDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "all7214doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "all" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.All getAll();

    /**
     * Sets the "all" element
     */
    void setAll(org.apache.xmlbeans.impl.xb.xsdschema.All all);

    /**
     * Appends and returns a new empty "all" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.All addNewAll();
}
