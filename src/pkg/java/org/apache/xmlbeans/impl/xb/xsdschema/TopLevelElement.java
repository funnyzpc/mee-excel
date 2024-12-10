/*
 * XML Type:  topLevelElement
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML topLevelElement(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface TopLevelElement extends org.apache.xmlbeans.impl.xb.xsdschema.Element {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "toplevelelement98d8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetName();

    /**
     * True if has "name" attribute
     */
    boolean isSetName();

    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlNCName name);

    /**
     * Unsets the "name" attribute
     */
    void unsetName();
}
