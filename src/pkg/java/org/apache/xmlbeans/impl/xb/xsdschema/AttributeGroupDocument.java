/*
 * An XML document type.
 * Localname: attributeGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * A document containing one attributeGroup(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface AttributeGroupDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<AttributeGroupDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "attributegroup4520doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "attributeGroup" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup getAttributeGroup();

}
