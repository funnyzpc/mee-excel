/*
 * An XML attribute type.
 * Localname: id
 * Namespace: http://www.w3.org/XML/1998/namespace
 * Java type: org.apache.xmlbeans.impl.xb.xmlschema.IdAttribute
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one id(@http://www.w3.org/XML/1998/namespace) attribute.
 *
 * This is a complex type.
 */
public interface IdAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xmlschema.IdAttribute> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLLANG.TypeSystemHolder.typeSystem, "idd759attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();
}
