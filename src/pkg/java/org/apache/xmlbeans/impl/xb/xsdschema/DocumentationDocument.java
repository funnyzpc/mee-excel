/*
 * An XML document type.
 * Localname: documentation
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one documentation(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface DocumentationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "documentation6cdbdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "documentation" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation getDocumentation();

    /**
     * Sets the "documentation" element
     */
    void setDocumentation(org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation documentation);

    /**
     * Appends and returns a new empty "documentation" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation addNewDocumentation();

    /**
     * An XML documentation(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Documentation extends org.apache.xmlbeans.XmlObject {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "documentationa475elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "source" attribute
         */
        java.lang.String getSource();

        /**
         * Gets (as xml) the "source" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetSource();

        /**
         * True if has "source" attribute
         */
        boolean isSetSource();

        /**
         * Sets the "source" attribute
         */
        void setSource(java.lang.String source);

        /**
         * Sets (as xml) the "source" attribute
         */
        void xsetSource(org.apache.xmlbeans.XmlAnyURI source);

        /**
         * Unsets the "source" attribute
         */
        void unsetSource();

        /**
         * Gets the "lang" attribute
         */
        java.lang.String getLang();

        /**
         * Gets (as xml) the "lang" attribute
         */
        org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang xgetLang();

        /**
         * True if has "lang" attribute
         */
        boolean isSetLang();

        /**
         * Sets the "lang" attribute
         */
        void setLang(java.lang.String lang);

        /**
         * Sets (as xml) the "lang" attribute
         */
        void xsetLang(org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang lang);

        /**
         * Unsets the "lang" attribute
         */
        void unsetLang();
    }
}
