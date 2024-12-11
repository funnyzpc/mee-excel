/*
 * An XML document type.
 * Localname: field
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument
 *
 * Automatically generated - do not modify.
 */
package poi.org.apache.xmlbeans.impl.xb.xsdschema;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.schema.ElementFactory;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlToken;
import poi.org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder;


/**
 * A document containing one field(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface FieldDocument extends XmlObject {
    DocumentFactory<FieldDocument> Factory = new DocumentFactory<>(TypeSystemHolder.typeSystem, "field3f9bdoctype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "field" element
     */
    FieldDocument.Field getField();

    /**
     * Sets the "field" element
     */
    void setField(FieldDocument.Field field);

    /**
     * Appends and returns a new empty "field" element
     */
    FieldDocument.Field addNewField();

    /**
     * An XML field(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Field extends Annotated {
        ElementFactory<FieldDocument.Field> Factory = new ElementFactory<>(TypeSystemHolder.typeSystem, "field12f5elemtype");
        SchemaType type = Factory.getType();


        /**
         * Gets the "xpath" attribute
         */
        java.lang.String getXpath();

        /**
         * Gets (as xml) the "xpath" attribute
         */
        FieldDocument.Field.Xpath xgetXpath();

        /**
         * Sets the "xpath" attribute
         */
        void setXpath(java.lang.String xpath);

        /**
         * Sets (as xml) the "xpath" attribute
         */
        void xsetXpath(FieldDocument.Field.Xpath xpath);

        /**
         * An XML xpath(@).
         *
         * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument$Field$Xpath.
         */
        public interface Xpath extends XmlToken {
            ElementFactory<FieldDocument.Field.Xpath> Factory = new ElementFactory<>(TypeSystemHolder.typeSystem, "xpath7f90attrtype");
            SchemaType type = Factory.getType();

        }
    }
}
