/*
 * An XML document type.
 * Localname: selector
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one selector(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface SelectorDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "selectorcb44doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "selector" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector getSelector();

    /**
     * Sets the "selector" element
     */
    void setSelector(org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector selector);

    /**
     * Appends and returns a new empty "selector" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector addNewSelector();

    /**
     * An XML selector(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Selector extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "selector233felemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "xpath" attribute
         */
        java.lang.String getXpath();

        /**
         * Gets (as xml) the "xpath" attribute
         */
        org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector.Xpath xgetXpath();

        /**
         * Sets the "xpath" attribute
         */
        void setXpath(java.lang.String xpath);

        /**
         * Sets (as xml) the "xpath" attribute
         */
        void xsetXpath(org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector.Xpath xpath);

        /**
         * An XML xpath(@).
         *
         * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument$Selector$Xpath.
         */
        public interface Xpath extends org.apache.xmlbeans.XmlToken {
            ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector.Xpath> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "xpath6f9aattrtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();

        }
    }
}
