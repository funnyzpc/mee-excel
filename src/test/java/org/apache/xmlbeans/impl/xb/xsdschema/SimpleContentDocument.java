/*
 * An XML document type.
 * Localname: simpleContent
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one simpleContent(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface SimpleContentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "simplecontent8acedoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "simpleContent" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent getSimpleContent();

    /**
     * Sets the "simpleContent" element
     */
    void setSimpleContent(org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent simpleContent);

    /**
     * Appends and returns a new empty "simpleContent" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent addNewSimpleContent();

    /**
     * An XML simpleContent(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface SimpleContent extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "simplecontent9a5belemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "restriction" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.SimpleRestrictionType getRestriction();

        /**
         * True if has "restriction" element
         */
        boolean isSetRestriction();

        /**
         * Sets the "restriction" element
         */
        void setRestriction(org.apache.xmlbeans.impl.xb.xsdschema.SimpleRestrictionType restriction);

        /**
         * Appends and returns a new empty "restriction" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.SimpleRestrictionType addNewRestriction();

        /**
         * Unsets the "restriction" element
         */
        void unsetRestriction();

        /**
         * Gets the "extension" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.SimpleExtensionType getExtension();

        /**
         * True if has "extension" element
         */
        boolean isSetExtension();

        /**
         * Sets the "extension" element
         */
        void setExtension(org.apache.xmlbeans.impl.xb.xsdschema.SimpleExtensionType extension);

        /**
         * Appends and returns a new empty "extension" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.SimpleExtensionType addNewExtension();

        /**
         * Unsets the "extension" element
         */
        void unsetExtension();
    }
}
