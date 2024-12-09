/*
 * An XML document type.
 * Localname: group
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one group(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface GroupDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.GroupDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "group6eb6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "group" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup getGroup();

    /**
     * Sets the "group" element
     */
    void setGroup(org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup group);

    /**
     * Appends and returns a new empty "group" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup addNewGroup();
}
