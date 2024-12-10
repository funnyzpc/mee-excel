/*
 * An XML document type.
 * Localname: any
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one any(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface AnyDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "anye729doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "any" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any getAny();

    /**
     * Sets the "any" element
     */
    void setAny(org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any any);

    /**
     * Appends and returns a new empty "any" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any addNewAny();

    /**
     * An XML any(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Any extends org.apache.xmlbeans.impl.xb.xsdschema.Wildcard {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "anye9d1elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "minOccurs" attribute
         */
        java.math.BigInteger getMinOccurs();

        /**
         * Gets (as xml) the "minOccurs" attribute
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetMinOccurs();

        /**
         * True if has "minOccurs" attribute
         */
        boolean isSetMinOccurs();

        /**
         * Sets the "minOccurs" attribute
         */
        void setMinOccurs(java.math.BigInteger minOccurs);

        /**
         * Sets (as xml) the "minOccurs" attribute
         */
        void xsetMinOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minOccurs);

        /**
         * Unsets the "minOccurs" attribute
         */
        void unsetMinOccurs();

        /**
         * Gets the "maxOccurs" attribute
         */
        java.lang.Object getMaxOccurs();

        /**
         * Gets (as xml) the "maxOccurs" attribute
         */
        org.apache.xmlbeans.impl.xb.xsdschema.AllNNI xgetMaxOccurs();

        /**
         * True if has "maxOccurs" attribute
         */
        boolean isSetMaxOccurs();

        /**
         * Sets the "maxOccurs" attribute
         */
        void setMaxOccurs(java.lang.Object maxOccurs);

        /**
         * Sets (as xml) the "maxOccurs" attribute
         */
        void xsetMaxOccurs(org.apache.xmlbeans.impl.xb.xsdschema.AllNNI maxOccurs);

        /**
         * Unsets the "maxOccurs" attribute
         */
        void unsetMaxOccurs();
    }
}
