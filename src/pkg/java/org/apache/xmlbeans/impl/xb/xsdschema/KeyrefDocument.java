/*
 * An XML document type.
 * Localname: keyref
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one keyref(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface KeyrefDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "keyref45afdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "keyref" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref getKeyref();

    /**
     * Sets the "keyref" element
     */
    void setKeyref(org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref keyref);

    /**
     * Appends and returns a new empty "keyref" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref addNewKeyref();

    /**
     * An XML keyref(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Keyref extends org.apache.xmlbeans.impl.xb.xsdschema.Keybase {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "keyref7a1felemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "refer" attribute
         */
        javax.xml.namespace.QName getRefer();

        /**
         * Gets (as xml) the "refer" attribute
         */
        org.apache.xmlbeans.XmlQName xgetRefer();

        /**
         * Sets the "refer" attribute
         */
        void setRefer(javax.xml.namespace.QName refer);

        /**
         * Sets (as xml) the "refer" attribute
         */
        void xsetRefer(org.apache.xmlbeans.XmlQName refer);
    }
}
