/*
 * An XML document type.
 * Localname: attributeGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupDocument
 *
 * Automatically generated - do not modify.
 */
package poi.org.apache.xmlbeans.impl.xb.xsdschema;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder;


/**
 * A document containing one attributeGroup(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface AttributeGroupDocument extends XmlObject {
    DocumentFactory<AttributeGroupDocument> Factory = new DocumentFactory<>(TypeSystemHolder.typeSystem, "attributegroup4520doctype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "attributeGroup" element
     */
    NamedAttributeGroup getAttributeGroup();

}
