/*
 * An XML document type.
 * Localname: group
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package poi.org.apache.xmlbeans.impl.xb.xsdschema;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder;


/**
 * A document containing one group(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface GroupDocument extends XmlObject {
    DocumentFactory<GroupDocument> Factory = new DocumentFactory<>(TypeSystemHolder.typeSystem, "group6eb6doctype");
    SchemaType type = Factory.getType();

    /**
     * Gets the "group" element
     */
    NamedGroup getGroup();

}
