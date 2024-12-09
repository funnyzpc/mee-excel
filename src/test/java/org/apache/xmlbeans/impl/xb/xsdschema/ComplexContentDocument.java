/*
 * An XML document type.
 * Localname: complexContent
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one complexContent(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface ComplexContentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "complexcontentc57adoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "complexContent" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent getComplexContent();

    /**
     * Sets the "complexContent" element
     */
    void setComplexContent(org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent complexContent);

    /**
     * Appends and returns a new empty "complexContent" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent addNewComplexContent();

    /**
     * An XML complexContent(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface ComplexContent extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "complexcontentaa7felemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "restriction" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.ComplexRestrictionType getRestriction();

        /**
         * True if has "restriction" element
         */
        boolean isSetRestriction();

        /**
         * Sets the "restriction" element
         */
        void setRestriction(org.apache.xmlbeans.impl.xb.xsdschema.ComplexRestrictionType restriction);

        /**
         * Appends and returns a new empty "restriction" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.ComplexRestrictionType addNewRestriction();

        /**
         * Unsets the "restriction" element
         */
        void unsetRestriction();

        /**
         * Gets the "extension" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType getExtension();

        /**
         * True if has "extension" element
         */
        boolean isSetExtension();

        /**
         * Sets the "extension" element
         */
        void setExtension(org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType extension);

        /**
         * Appends and returns a new empty "extension" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType addNewExtension();

        /**
         * Unsets the "extension" element
         */
        void unsetExtension();

        /**
         * Gets the "mixed" attribute
         */
        boolean getMixed();

        /**
         * Gets (as xml) the "mixed" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetMixed();

        /**
         * True if has "mixed" attribute
         */
        boolean isSetMixed();

        /**
         * Sets the "mixed" attribute
         */
        void setMixed(boolean mixed);

        /**
         * Sets (as xml) the "mixed" attribute
         */
        void xsetMixed(org.apache.xmlbeans.XmlBoolean mixed);

        /**
         * Unsets the "mixed" attribute
         */
        void unsetMixed();
    }
}
