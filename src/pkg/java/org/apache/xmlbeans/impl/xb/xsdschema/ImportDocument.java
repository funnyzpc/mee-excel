/*
 * An XML document type.
 * Localname: import
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one import(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface ImportDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "import99fedoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "import" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import getImport();

    /**
     * Sets the "import" element
     */
    void setImport(org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import ximport);

    /**
     * Appends and returns a new empty "import" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import addNewImport();

    /**
     * An XML import(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Import extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "importe2ffelemtype");
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
         * True if has "namespace" attribute
         */
        boolean isSetNamespace();

        /**
         * Sets the "namespace" attribute
         */
        void setNamespace(java.lang.String namespace);

        /**
         * Sets (as xml) the "namespace" attribute
         */
        void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace);

        /**
         * Unsets the "namespace" attribute
         */
        void unsetNamespace();

        /**
         * Gets the "schemaLocation" attribute
         */
        java.lang.String getSchemaLocation();

        /**
         * Gets (as xml) the "schemaLocation" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetSchemaLocation();

        /**
         * True if has "schemaLocation" attribute
         */
        boolean isSetSchemaLocation();

        /**
         * Sets the "schemaLocation" attribute
         */
        void setSchemaLocation(java.lang.String schemaLocation);

        /**
         * Sets (as xml) the "schemaLocation" attribute
         */
        void xsetSchemaLocation(org.apache.xmlbeans.XmlAnyURI schemaLocation);

        /**
         * Unsets the "schemaLocation" attribute
         */
        void unsetSchemaLocation();
    }
}
