/*
 * An XML attribute type.
 * Localname: base
 * Namespace: http://www.w3.org/XML/1998/namespace
 * Java type: org.apache.xmlbeans.impl.xb.xmlschema.BaseAttribute
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one base(@http://www.w3.org/XML/1998/namespace) attribute.
 *
 * This is a complex type.
 */
public interface BaseAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xmlschema.BaseAttribute> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLLANG.TypeSystemHolder.typeSystem, "basece23attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "base" attribute
     */
    java.lang.String getBase();

    /**
     * Gets (as xml) the "base" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetBase();

    /**
     * True if has "base" attribute
     */
    boolean isSetBase();

    /**
     * Sets the "base" attribute
     */
    void setBase(java.lang.String base);

    /**
     * Sets (as xml) the "base" attribute
     */
    void xsetBase(org.apache.xmlbeans.XmlAnyURI base);

    /**
     * Unsets the "base" attribute
     */
    void unsetBase();
}
