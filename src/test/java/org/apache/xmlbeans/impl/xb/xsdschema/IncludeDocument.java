/*
 * An XML document type.
 * Localname: include
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one include(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface IncludeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "includeaf6ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "include" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include getInclude();

    /**
     * Sets the "include" element
     */
    void setInclude(org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include include);

    /**
     * Appends and returns a new empty "include" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include addNewInclude();

    /**
     * An XML include(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Include extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "include59d9elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "schemaLocation" attribute
         */
        java.lang.String getSchemaLocation();

        /**
         * Gets (as xml) the "schemaLocation" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetSchemaLocation();

        /**
         * Sets the "schemaLocation" attribute
         */
        void setSchemaLocation(java.lang.String schemaLocation);

        /**
         * Sets (as xml) the "schemaLocation" attribute
         */
        void xsetSchemaLocation(org.apache.xmlbeans.XmlAnyURI schemaLocation);
    }
}
