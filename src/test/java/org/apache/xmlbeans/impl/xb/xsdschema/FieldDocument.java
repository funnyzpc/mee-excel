/*
 * An XML document type.
 * Localname: field
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one field(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface FieldDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "field3f9bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "field" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field getField();

    /**
     * Sets the "field" element
     */
    void setField(org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field field);

    /**
     * Appends and returns a new empty "field" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field addNewField();

    /**
     * An XML field(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Field extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "field12f5elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "xpath" attribute
         */
        java.lang.String getXpath();

        /**
         * Gets (as xml) the "xpath" attribute
         */
        org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath xgetXpath();

        /**
         * Sets the "xpath" attribute
         */
        void setXpath(java.lang.String xpath);

        /**
         * Sets (as xml) the "xpath" attribute
         */
        void xsetXpath(org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath xpath);

        /**
         * An XML xpath(@).
         *
         * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument$Field$Xpath.
         */
        public interface Xpath extends org.apache.xmlbeans.XmlToken {
            ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "xpath7f90attrtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();

        }
    }
}
