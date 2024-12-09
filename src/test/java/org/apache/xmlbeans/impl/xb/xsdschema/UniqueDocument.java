/*
 * An XML document type.
 * Localname: unique
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.UniqueDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one unique(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface UniqueDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.UniqueDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "unique3752doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "unique" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Keybase getUnique();

    /**
     * Sets the "unique" element
     */
    void setUnique(org.apache.xmlbeans.impl.xb.xsdschema.Keybase unique);

    /**
     * Appends and returns a new empty "unique" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Keybase addNewUnique();
}
