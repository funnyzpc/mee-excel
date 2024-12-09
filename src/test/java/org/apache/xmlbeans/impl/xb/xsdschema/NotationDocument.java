/*
 * An XML document type.
 * Localname: notation
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one notation(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface NotationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "notation3381doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "notation" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation getNotation();

    /**
     * Sets the "notation" element
     */
    void setNotation(org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation notation);

    /**
     * Appends and returns a new empty "notation" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation addNewNotation();

    /**
     * An XML notation(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Notation extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "notation8b1felemtype");
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
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);

        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlNCName name);

        /**
         * Gets the "public" attribute
         */
        java.lang.String getPublic();

        /**
         * Gets (as xml) the "public" attribute
         */
        org.apache.xmlbeans.impl.xb.xsdschema.Public xgetPublic();

        /**
         * True if has "public" attribute
         */
        boolean isSetPublic();

        /**
         * Sets the "public" attribute
         */
        void setPublic(java.lang.String xpublic);

        /**
         * Sets (as xml) the "public" attribute
         */
        void xsetPublic(org.apache.xmlbeans.impl.xb.xsdschema.Public xpublic);

        /**
         * Unsets the "public" attribute
         */
        void unsetPublic();

        /**
         * Gets the "system" attribute
         */
        java.lang.String getSystem();

        /**
         * Gets (as xml) the "system" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetSystem();

        /**
         * True if has "system" attribute
         */
        boolean isSetSystem();

        /**
         * Sets the "system" attribute
         */
        void setSystem(java.lang.String system);

        /**
         * Sets (as xml) the "system" attribute
         */
        void xsetSystem(org.apache.xmlbeans.XmlAnyURI system);

        /**
         * Unsets the "system" attribute
         */
        void unsetSystem();
    }
}
