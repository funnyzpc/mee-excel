/*
 * An XML document type.
 * Localname: documentation
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument
 *
 * Automatically generated - do not modify.
 */
package poi.org.apache.xmlbeans.impl.xb.xsdschema;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.schema.ElementFactory;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;
import poi.org.apache.xmlbeans.XmlAnyURI;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute;
import poi.org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder;


/**
 * A document containing one documentation(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface DocumentationDocument extends XmlObject {
    DocumentFactory<DocumentationDocument> Factory = new DocumentFactory<>(TypeSystemHolder.typeSystem, "documentation6cdbdoctype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "documentation" element
     */
    DocumentationDocument.Documentation getDocumentation();

    /**
     * Sets the "documentation" element
     */
    void setDocumentation(DocumentationDocument.Documentation documentation);

    /**
     * Appends and returns a new empty "documentation" element
     */
    DocumentationDocument.Documentation addNewDocumentation();

    /**
     * An XML documentation(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Documentation extends XmlObject {
        ElementFactory<DocumentationDocument.Documentation> Factory = new ElementFactory<>(TypeSystemHolder.typeSystem, "documentationa475elemtype");
        SchemaType type = Factory.getType();


        /**
         * Gets the "source" attribute
         */
        java.lang.String getSource();

        /**
         * Gets (as xml) the "source" attribute
         */
        XmlAnyURI xgetSource();

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
        void xsetSource(XmlAnyURI source);

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
        LangAttribute.Lang xgetLang();

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
        void xsetLang(LangAttribute.Lang lang);

        /**
         * Unsets the "lang" attribute
         */
        void unsetLang();
    }
}
