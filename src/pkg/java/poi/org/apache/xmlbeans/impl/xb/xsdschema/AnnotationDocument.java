/*
 * An XML document type.
 * Localname: annotation
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument
 *
 * Automatically generated - do not modify.
 */
package poi.org.apache.xmlbeans.impl.xb.xsdschema;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;
import poi.org.apache.xmlbeans.impl.schema.ElementFactory;
import poi.org.apache.xmlbeans.XmlID;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder;


/**
 * A document containing one annotation(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface AnnotationDocument extends XmlObject {
    DocumentFactory<AnnotationDocument> Factory = new DocumentFactory<>(TypeSystemHolder.typeSystem, "annotationb034doctype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "annotation" element
     */
    Annotation getAnnotation();

    /**
     * Sets the "annotation" element
     */
    void setAnnotation(Annotation annotation);

    /**
     * Appends and returns a new empty "annotation" element
     */
    Annotation addNewAnnotation();

    /**
     * An XML annotation(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Annotation extends OpenAttrs {
        ElementFactory<Annotation> Factory = new ElementFactory<>(TypeSystemHolder.typeSystem, "annotation5abfelemtype");
        SchemaType type = Factory.getType();


        /**
         * Gets a List of "appinfo" elements
         */
        java.util.List<AppinfoDocument.Appinfo> getAppinfoList();

        /**
         * Gets array of all "appinfo" elements
         */
        AppinfoDocument.Appinfo[] getAppinfoArray();


        /**
         * Inserts and returns a new empty value (as xml) as the ith "appinfo" element
         */
        AppinfoDocument.Appinfo insertNewAppinfo(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "appinfo" element
         */
        AppinfoDocument.Appinfo addNewAppinfo();

        /**
         * Removes the ith "appinfo" element
         */
        void removeAppinfo(int i);

        /**
         * Gets a List of "documentation" elements
         */
        java.util.List<DocumentationDocument.Documentation> getDocumentationList();

        /**
         * Gets array of all "documentation" elements
         */
        DocumentationDocument.Documentation[] getDocumentationArray();

        /**
         * Gets ith "documentation" element
         */
        DocumentationDocument.Documentation getDocumentationArray(int i);

        /**
         * Returns number of "documentation" element
         */
        int sizeOfDocumentationArray();

        /**
         * Sets array of all "documentation" element
         */
        void setDocumentationArray(DocumentationDocument.Documentation[] documentationArray);

        /**
         * Sets ith "documentation" element
         */
        void setDocumentationArray(int i, DocumentationDocument.Documentation documentation);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "documentation" element
         */
        DocumentationDocument.Documentation insertNewDocumentation(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "documentation" element
         */
        DocumentationDocument.Documentation addNewDocumentation();

        /**
         * Removes the ith "documentation" element
         */
        void removeDocumentation(int i);

        /**
         * Gets the "id" attribute
         */
        String getId();

        /**
         * Gets (as xml) the "id" attribute
         */
        XmlID xgetId();

        /**
         * True if has "id" attribute
         */
        boolean isSetId();

        /**
         * Sets the "id" attribute
         */
        void setId(String id);

        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(XmlID id);

        /**
         * Unsets the "id" attribute
         */
        void unsetId();
    }
}
