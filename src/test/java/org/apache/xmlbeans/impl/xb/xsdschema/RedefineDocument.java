/*
 * An XML document type.
 * Localname: redefine
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one redefine(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface RedefineDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "redefine3f55doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "redefine" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine getRedefine();

    /**
     * Sets the "redefine" element
     */
    void setRedefine(org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine redefine);

    /**
     * Appends and returns a new empty "redefine" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine addNewRedefine();

    /**
     * An XML redefine(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Redefine extends org.apache.xmlbeans.impl.xb.xsdschema.OpenAttrs {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "redefine9e9felemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "annotation" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation> getAnnotationList();

        /**
         * Gets array of all "annotation" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation[] getAnnotationArray();

        /**
         * Gets ith "annotation" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation getAnnotationArray(int i);

        /**
         * Returns number of "annotation" element
         */
        int sizeOfAnnotationArray();

        /**
         * Sets array of all "annotation" element
         */
        void setAnnotationArray(org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation[] annotationArray);

        /**
         * Sets ith "annotation" element
         */
        void setAnnotationArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation annotation);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "annotation" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation insertNewAnnotation(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "annotation" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation addNewAnnotation();

        /**
         * Removes the ith "annotation" element
         */
        void removeAnnotation(int i);

        /**
         * Gets a List of "simpleType" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType> getSimpleTypeList();

        /**
         * Gets array of all "simpleType" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType[] getSimpleTypeArray();

        /**
         * Gets ith "simpleType" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType getSimpleTypeArray(int i);

        /**
         * Returns number of "simpleType" element
         */
        int sizeOfSimpleTypeArray();

        /**
         * Sets array of all "simpleType" element
         */
        void setSimpleTypeArray(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType[] simpleTypeArray);

        /**
         * Sets ith "simpleType" element
         */
        void setSimpleTypeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType simpleType);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "simpleType" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType insertNewSimpleType(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "simpleType" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType addNewSimpleType();

        /**
         * Removes the ith "simpleType" element
         */
        void removeSimpleType(int i);

        /**
         * Gets a List of "complexType" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType> getComplexTypeList();

        /**
         * Gets array of all "complexType" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType[] getComplexTypeArray();

        /**
         * Gets ith "complexType" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType getComplexTypeArray(int i);

        /**
         * Returns number of "complexType" element
         */
        int sizeOfComplexTypeArray();

        /**
         * Sets array of all "complexType" element
         */
        void setComplexTypeArray(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType[] complexTypeArray);

        /**
         * Sets ith "complexType" element
         */
        void setComplexTypeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType complexType);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "complexType" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType insertNewComplexType(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "complexType" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType addNewComplexType();

        /**
         * Removes the ith "complexType" element
         */
        void removeComplexType(int i);

        /**
         * Gets a List of "group" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup> getGroupList();

        /**
         * Gets array of all "group" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup[] getGroupArray();

        /**
         * Gets ith "group" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup getGroupArray(int i);

        /**
         * Returns number of "group" element
         */
        int sizeOfGroupArray();

        /**
         * Sets array of all "group" element
         */
        void setGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup[] groupArray);

        /**
         * Sets ith "group" element
         */
        void setGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup group);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "group" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup insertNewGroup(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "group" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup addNewGroup();

        /**
         * Removes the ith "group" element
         */
        void removeGroup(int i);

        /**
         * Gets a List of "attributeGroup" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup> getAttributeGroupList();

        /**
         * Gets array of all "attributeGroup" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup[] getAttributeGroupArray();

        /**
         * Gets ith "attributeGroup" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup getAttributeGroupArray(int i);

        /**
         * Returns number of "attributeGroup" element
         */
        int sizeOfAttributeGroupArray();

        /**
         * Sets array of all "attributeGroup" element
         */
        void setAttributeGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup[] attributeGroupArray);

        /**
         * Sets ith "attributeGroup" element
         */
        void setAttributeGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup attributeGroup);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup insertNewAttributeGroup(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "attributeGroup" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup addNewAttributeGroup();

        /**
         * Removes the ith "attributeGroup" element
         */
        void removeAttributeGroup(int i);

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
