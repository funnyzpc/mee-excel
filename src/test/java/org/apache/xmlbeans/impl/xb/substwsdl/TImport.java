/*
 * XML Type:  TImport
 * Namespace: http://www.apache.org/internal/xmlbeans/wsdlsubst
 * Java type: org.apache.xmlbeans.impl.xb.substwsdl.TImport
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.substwsdl;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TImport(@http://www.apache.org/internal/xmlbeans/wsdlsubst).
 *
 * This is a complex type.
 */
public interface TImport extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.substwsdl.TImport> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "timport22datype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "namespace" attribute
     */
    java.lang.String getNamespace();

    /**
     * Gets (as xml) the "namespace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetNamespace();

    /**
     * Sets the "namespace" attribute
     */
    void setNamespace(java.lang.String namespace);

    /**
     * Sets (as xml) the "namespace" attribute
     */
    void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace);

    /**
     * Gets the "location" attribute
     */
    java.lang.String getLocation();

    /**
     * Gets (as xml) the "location" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetLocation();

    /**
     * Sets the "location" attribute
     */
    void setLocation(java.lang.String location);

    /**
     * Sets (as xml) the "location" attribute
     */
    void xsetLocation(org.apache.xmlbeans.XmlAnyURI location);
}
