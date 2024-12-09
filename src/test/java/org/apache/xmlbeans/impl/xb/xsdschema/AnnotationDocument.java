/*
 * An XML document type.
 * Localname: annotation
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one annotation(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface AnnotationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "annotationb034doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "annotation" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation getAnnotation();

    /**
     * Sets the "annotation" element
     */
    void setAnnotation(org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation annotation);

    /**
     * Appends and returns a new empty "annotation" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation addNewAnnotation();

    /**
     * An XML annotation(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Annotation extends org.apache.xmlbeans.impl.xb.xsdschema.OpenAttrs {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "annotation5abfelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "appinfo" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo> getAppinfoList();

        /**
         * Gets array of all "appinfo" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo[] getAppinfoArray();

        /**
         * Gets ith "appinfo" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo getAppinfoArray(int i);

        /**
         * Returns number of "appinfo" element
         */
        int sizeOfAppinfoArray();

        /**
         * Sets array of all "appinfo" element
         */
        void setAppinfoArray(org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo[] appinfoArray);

        /**
         * Sets ith "appinfo" element
         */
        void setAppinfoArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo appinfo);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "appinfo" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo insertNewAppinfo(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "appinfo" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo addNewAppinfo();

        /**
         * Removes the ith "appinfo" element
         */
        void removeAppinfo(int i);

        /**
         * Gets a List of "documentation" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation> getDocumentationList();

        /**
         * Gets array of all "documentation" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation[] getDocumentationArray();

        /**
         * Gets ith "documentation" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation getDocumentationArray(int i);

        /**
         * Returns number of "documentation" element
         */
        int sizeOfDocumentationArray();

        /**
         * Sets array of all "documentation" element
         */
        void setDocumentationArray(org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation[] documentationArray);

        /**
         * Sets ith "documentation" element
         */
        void setDocumentationArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation documentation);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "documentation" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation insertNewDocumentation(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "documentation" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation addNewDocumentation();

        /**
         * Removes the ith "documentation" element
         */
        void removeDocumentation(int i);

        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();

        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlID xgetId();

        /**
         * True if has "id" attribute
         */
        boolean isSetId();

        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);

        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlID id);

        /**
         * Unsets the "id" attribute
         */
        void unsetId();
    }
}
