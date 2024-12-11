/*
 * XML Type:  annotated
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Annotated
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


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


}
