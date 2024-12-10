/*
 * XML Type:  annotated
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Annotated
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML annotated(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface Annotated extends org.apache.xmlbeans.impl.xb.xsdschema.OpenAttrs {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.Annotated> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "annotateda52dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "annotation" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation getAnnotation();

    /**
     * True if has "annotation" element
     */
    boolean isSetAnnotation();

    /**
     * Sets the "annotation" element
     */
    void setAnnotation(org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation annotation);

    /**
     * Appends and returns a new empty "annotation" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation addNewAnnotation();

    /**
     * Unsets the "annotation" element
     */
    void unsetAnnotation();

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
