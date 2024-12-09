/*
 * XML Type:  keybase
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Keybase
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML keybase(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface Keybase extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.Keybase> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "keybase3955type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "selector" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector getSelector();

    /**
     * Sets the "selector" element
     */
    void setSelector(org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector selector);

    /**
     * Appends and returns a new empty "selector" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector addNewSelector();

    /**
     * Gets a List of "field" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field> getFieldList();

    /**
     * Gets array of all "field" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field[] getFieldArray();

    /**
     * Gets ith "field" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field getFieldArray(int i);

    /**
     * Returns number of "field" element
     */
    int sizeOfFieldArray();

    /**
     * Sets array of all "field" element
     */
    void setFieldArray(org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field[] fieldArray);

    /**
     * Sets ith "field" element
     */
    void setFieldArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field field);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "field" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field insertNewField(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "field" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field addNewField();

    /**
     * Removes the ith "field" element
     */
    void removeField(int i);

    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetName();

    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlNCName name);
}
