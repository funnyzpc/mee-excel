/*
 * An XML document type.
 * Localname: schema
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument
 *
 * Automatically generated - do not modify.
 */
package poi.org.apache.xmlbeans.impl.xb.xsdschema;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.ElementFactory;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;
import poi.org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder;


/**
 * A document containing one schema(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface SchemaDocument extends XmlObject {
    DocumentFactory<SchemaDocument> Factory = new DocumentFactory<>(TypeSystemHolder.typeSystem, "schema0782doctype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "schema" element
     */
    SchemaDocument.Schema getSchema();

    /**
     * Sets the "schema" element
     */
    void setSchema(SchemaDocument.Schema schema);

    /**
     * An XML schema(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Schema extends OpenAttrs {
        ElementFactory<SchemaDocument.Schema> Factory = new ElementFactory<>(TypeSystemHolder.typeSystem, "schemad77felemtype");
        SchemaType type = Factory.getType();


    }
}
