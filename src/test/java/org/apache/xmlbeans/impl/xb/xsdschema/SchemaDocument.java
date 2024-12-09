/*
 * An XML document type.
 * Localname: schema
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one schema(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface SchemaDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "schema0782doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "schema" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema getSchema();

    /**
     * Sets the "schema" element
     */
    void setSchema(org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema schema);

    /**
     * Appends and returns a new empty "schema" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema addNewSchema();

    /**
     * An XML schema(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Schema extends org.apache.xmlbeans.impl.xb.xsdschema.OpenAttrs {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "schemad77felemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "include" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include> getIncludeList();

        /**
         * Gets array of all "include" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include[] getIncludeArray();

        /**
         * Gets ith "include" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include getIncludeArray(int i);

        /**
         * Returns number of "include" element
         */
        int sizeOfIncludeArray();

        /**
         * Sets array of all "include" element
         */
        void setIncludeArray(org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include[] includeArray);

        /**
         * Sets ith "include" element
         */
        void setIncludeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include include);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "include" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include insertNewInclude(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "include" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include addNewInclude();

        /**
         * Removes the ith "include" element
         */
        void removeInclude(int i);

        /**
         * Gets a List of "import" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import> getImportList();

        /**
         * Gets array of all "import" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import[] getImportArray();

        /**
         * Gets ith "import" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import getImportArray(int i);

        /**
         * Returns number of "import" element
         */
        int sizeOfImportArray();

        /**
         * Sets array of all "import" element
         */
        void setImportArray(org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import[] ximportArray);

        /**
         * Sets ith "import" element
         */
        void setImportArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import ximport);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "import" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import insertNewImport(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "import" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import addNewImport();

        /**
         * Removes the ith "import" element
         */
        void removeImport(int i);

        /**
         * Gets a List of "redefine" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine> getRedefineList();

        /**
         * Gets array of all "redefine" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine[] getRedefineArray();

        /**
         * Gets ith "redefine" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine getRedefineArray(int i);

        /**
         * Returns number of "redefine" element
         */
        int sizeOfRedefineArray();

        /**
         * Sets array of all "redefine" element
         */
        void setRedefineArray(org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine[] redefineArray);

        /**
         * Sets ith "redefine" element
         */
        void setRedefineArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine redefine);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "redefine" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine insertNewRedefine(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "redefine" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine addNewRedefine();

        /**
         * Removes the ith "redefine" element
         */
        void removeRedefine(int i);

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
         * Gets a List of "element" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement> getElementList();

        /**
         * Gets array of all "element" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement[] getElementArray();

        /**
         * Gets ith "element" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement getElementArray(int i);

        /**
         * Returns number of "element" element
         */
        int sizeOfElementArray();

        /**
         * Sets array of all "element" element
         */
        void setElementArray(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement[] elementArray);

        /**
         * Sets ith "element" element
         */
        void setElementArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement element);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "element" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement insertNewElement(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "element" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement addNewElement();

        /**
         * Removes the ith "element" element
         */
        void removeElement(int i);

        /**
         * Gets a List of "attribute" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute> getAttributeList();

        /**
         * Gets array of all "attribute" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute[] getAttributeArray();

        /**
         * Gets ith "attribute" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute getAttributeArray(int i);

        /**
         * Returns number of "attribute" element
         */
        int sizeOfAttributeArray();

        /**
         * Sets array of all "attribute" element
         */
        void setAttributeArray(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute[] attributeArray);

        /**
         * Sets ith "attribute" element
         */
        void setAttributeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute attribute);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "attribute" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute insertNewAttribute(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "attribute" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute addNewAttribute();

        /**
         * Removes the ith "attribute" element
         */
        void removeAttribute(int i);

        /**
         * Gets a List of "notation" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation> getNotationList();

        /**
         * Gets array of all "notation" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation[] getNotationArray();

        /**
         * Gets ith "notation" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation getNotationArray(int i);

        /**
         * Returns number of "notation" element
         */
        int sizeOfNotationArray();

        /**
         * Sets array of all "notation" element
         */
        void setNotationArray(org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation[] notationArray);

        /**
         * Sets ith "notation" element
         */
        void setNotationArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation notation);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "notation" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation insertNewNotation(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "notation" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation addNewNotation();

        /**
         * Removes the ith "notation" element
         */
        void removeNotation(int i);

        /**
         * Gets the "targetNamespace" attribute
         */
        java.lang.String getTargetNamespace();

        /**
         * Gets (as xml) the "targetNamespace" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace();

        /**
         * True if has "targetNamespace" attribute
         */
        boolean isSetTargetNamespace();

        /**
         * Sets the "targetNamespace" attribute
         */
        void setTargetNamespace(java.lang.String targetNamespace);

        /**
         * Sets (as xml) the "targetNamespace" attribute
         */
        void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace);

        /**
         * Unsets the "targetNamespace" attribute
         */
        void unsetTargetNamespace();

        /**
         * Gets the "version" attribute
         */
        java.lang.String getVersion();

        /**
         * Gets (as xml) the "version" attribute
         */
        org.apache.xmlbeans.XmlToken xgetVersion();

        /**
         * True if has "version" attribute
         */
        boolean isSetVersion();

        /**
         * Sets the "version" attribute
         */
        void setVersion(java.lang.String version);

        /**
         * Sets (as xml) the "version" attribute
         */
        void xsetVersion(org.apache.xmlbeans.XmlToken version);

        /**
         * Unsets the "version" attribute
         */
        void unsetVersion();

        /**
         * Gets the "finalDefault" attribute
         */
        java.lang.Object getFinalDefault();

        /**
         * Gets (as xml) the "finalDefault" attribute
         */
        org.apache.xmlbeans.impl.xb.xsdschema.FullDerivationSet xgetFinalDefault();

        /**
         * True if has "finalDefault" attribute
         */
        boolean isSetFinalDefault();

        /**
         * Sets the "finalDefault" attribute
         */
        void setFinalDefault(java.lang.Object finalDefault);

        /**
         * Sets (as xml) the "finalDefault" attribute
         */
        void xsetFinalDefault(org.apache.xmlbeans.impl.xb.xsdschema.FullDerivationSet finalDefault);

        /**
         * Unsets the "finalDefault" attribute
         */
        void unsetFinalDefault();

        /**
         * Gets the "blockDefault" attribute
         */
        java.lang.Object getBlockDefault();

        /**
         * Gets (as xml) the "blockDefault" attribute
         */
        org.apache.xmlbeans.impl.xb.xsdschema.BlockSet xgetBlockDefault();

        /**
         * True if has "blockDefault" attribute
         */
        boolean isSetBlockDefault();

        /**
         * Sets the "blockDefault" attribute
         */
        void setBlockDefault(java.lang.Object blockDefault);

        /**
         * Sets (as xml) the "blockDefault" attribute
         */
        void xsetBlockDefault(org.apache.xmlbeans.impl.xb.xsdschema.BlockSet blockDefault);

        /**
         * Unsets the "blockDefault" attribute
         */
        void unsetBlockDefault();

        /**
         * Gets the "attributeFormDefault" attribute
         */
        org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum getAttributeFormDefault();

        /**
         * Gets (as xml) the "attributeFormDefault" attribute
         */
        org.apache.xmlbeans.impl.xb.xsdschema.FormChoice xgetAttributeFormDefault();

        /**
         * True if has "attributeFormDefault" attribute
         */
        boolean isSetAttributeFormDefault();

        /**
         * Sets the "attributeFormDefault" attribute
         */
        void setAttributeFormDefault(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum attributeFormDefault);

        /**
         * Sets (as xml) the "attributeFormDefault" attribute
         */
        void xsetAttributeFormDefault(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice attributeFormDefault);

        /**
         * Unsets the "attributeFormDefault" attribute
         */
        void unsetAttributeFormDefault();

        /**
         * Gets the "elementFormDefault" attribute
         */
        org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum getElementFormDefault();

        /**
         * Gets (as xml) the "elementFormDefault" attribute
         */
        org.apache.xmlbeans.impl.xb.xsdschema.FormChoice xgetElementFormDefault();

        /**
         * True if has "elementFormDefault" attribute
         */
        boolean isSetElementFormDefault();

        /**
         * Sets the "elementFormDefault" attribute
         */
        void setElementFormDefault(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum elementFormDefault);

        /**
         * Sets (as xml) the "elementFormDefault" attribute
         */
        void xsetElementFormDefault(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice elementFormDefault);

        /**
         * Unsets the "elementFormDefault" attribute
         */
        void unsetElementFormDefault();

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

        /**
         * Gets the "lang" attribute
         */
        java.lang.String getLang();

        /**
         * Gets (as xml) the "lang" attribute
         */
        org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang xgetLang();

        /**
         * True if has "lang" attribute
         */
        boolean isSetLang();

        /**
         * Sets the "lang" attribute
         */
        void setLang(java.lang.String lang);

        /**
         * Sets (as xml) the "lang" attribute
         */
        void xsetLang(org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang lang);

        /**
         * Unsets the "lang" attribute
         */
        void unsetLang();
    }
}
