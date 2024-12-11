/*
 * XML Type:  annotated
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Annotated
 *
 * Automatically generated - do not modify.
 */
package poi.org.apache.xmlbeans.impl.xb.xsdschema;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;
import poi.org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder;


/**
 * An XML annotated(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface Annotated extends OpenAttrs {
    DocumentFactory<Annotated> Factory = new DocumentFactory<>(TypeSystemHolder.typeSystem, "annotateda52dtype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "annotation" element
     */
    AnnotationDocument.Annotation getAnnotation();


}
