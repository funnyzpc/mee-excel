/*
 * An XML document type.
 * Localname: schema
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one schema(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class SchemaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument {
    private static final long serialVersionUID = 1L;

    public SchemaDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "schema"),
    };


    /**
     * Gets the "schema" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema getSchema() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "schema" element
     */
    public void setSchema(org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema schema) {
        generatedSetterHelperImpl(schema, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "schema" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema addNewSchema() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML schema(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class SchemaImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.OpenAttrsImpl implements org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema {
        private static final long serialVersionUID = 1L;

        public SchemaImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://www.w3.org/2001/XMLSchema", "include"),
            new QName("http://www.w3.org/2001/XMLSchema", "import"),
            new QName("http://www.w3.org/2001/XMLSchema", "redefine"),
            new QName("http://www.w3.org/2001/XMLSchema", "annotation"),
            new QName("http://www.w3.org/2001/XMLSchema", "simpleType"),
            new QName("http://www.w3.org/2001/XMLSchema", "complexType"),
            new QName("http://www.w3.org/2001/XMLSchema", "group"),
            new QName("http://www.w3.org/2001/XMLSchema", "attributeGroup"),
            new QName("http://www.w3.org/2001/XMLSchema", "element"),
            new QName("http://www.w3.org/2001/XMLSchema", "attribute"),
            new QName("http://www.w3.org/2001/XMLSchema", "notation"),
            new QName("", "targetNamespace"),
            new QName("", "version"),
            new QName("", "finalDefault"),
            new QName("", "blockDefault"),
            new QName("", "attributeFormDefault"),
            new QName("", "elementFormDefault"),
            new QName("", "id"),
            new QName("http://www.w3.org/XML/1998/namespace", "lang"),
        };


        /**
         * Gets a List of "include" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include> getIncludeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getIncludeArray,
                    this::setIncludeArray,
                    this::insertNewInclude,
                    this::removeInclude,
                    this::sizeOfIncludeArray
                );
            }
        }

        /**
         * Gets array of all "include" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include[] getIncludeArray() {
            return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include[0]);
        }

        /**
         * Gets ith "include" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include getIncludeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "include" element
         */
        public int sizeOfIncludeArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "include" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIncludeArray(org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include[] includeArray) {
            check_orphaned();
            arraySetterHelper(includeArray, PROPERTY_QNAME[0]);
        }

        /**
         * Sets ith "include" element
         */
        public void setIncludeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include include) {
            generatedSetterHelperImpl(include, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "include" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include insertNewInclude(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "include" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include addNewInclude() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "include" element
         */
        public void removeInclude(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }

        /**
         * Gets a List of "import" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import> getImportList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getImportArray,
                    this::setImportArray,
                    this::insertNewImport,
                    this::removeImport,
                    this::sizeOfImportArray
                );
            }
        }

        /**
         * Gets array of all "import" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import[] getImportArray() {
            return getXmlObjectArray(PROPERTY_QNAME[1], new org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import[0]);
        }

        /**
         * Gets ith "import" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import getImportArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import)get_store().find_element_user(PROPERTY_QNAME[1], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "import" element
         */
        public int sizeOfImportArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[1]);
            }
        }

        /**
         * Sets array of all "import" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setImportArray(org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import[] ximportArray) {
            check_orphaned();
            arraySetterHelper(ximportArray, PROPERTY_QNAME[1]);
        }

        /**
         * Sets ith "import" element
         */
        public void setImportArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import ximport) {
            generatedSetterHelperImpl(ximport, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "import" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import insertNewImport(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import)get_store().insert_element_user(PROPERTY_QNAME[1], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "import" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import addNewImport() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import)get_store().add_element_user(PROPERTY_QNAME[1]);
                return target;
            }
        }

        /**
         * Removes the ith "import" element
         */
        public void removeImport(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[1], i);
            }
        }

        /**
         * Gets a List of "redefine" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine> getRedefineList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getRedefineArray,
                    this::setRedefineArray,
                    this::insertNewRedefine,
                    this::removeRedefine,
                    this::sizeOfRedefineArray
                );
            }
        }

        /**
         * Gets array of all "redefine" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine[] getRedefineArray() {
            return getXmlObjectArray(PROPERTY_QNAME[2], new org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine[0]);
        }

        /**
         * Gets ith "redefine" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine getRedefineArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine)get_store().find_element_user(PROPERTY_QNAME[2], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "redefine" element
         */
        public int sizeOfRedefineArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[2]);
            }
        }

        /**
         * Sets array of all "redefine" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRedefineArray(org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine[] redefineArray) {
            check_orphaned();
            arraySetterHelper(redefineArray, PROPERTY_QNAME[2]);
        }

        /**
         * Sets ith "redefine" element
         */
        public void setRedefineArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine redefine) {
            generatedSetterHelperImpl(redefine, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "redefine" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine insertNewRedefine(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine)get_store().insert_element_user(PROPERTY_QNAME[2], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "redefine" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine addNewRedefine() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine)get_store().add_element_user(PROPERTY_QNAME[2]);
                return target;
            }
        }

        /**
         * Removes the ith "redefine" element
         */
        public void removeRedefine(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[2], i);
            }
        }

        /**
         * Gets a List of "annotation" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation> getAnnotationList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getAnnotationArray,
                    this::setAnnotationArray,
                    this::insertNewAnnotation,
                    this::removeAnnotation,
                    this::sizeOfAnnotationArray
                );
            }
        }

        /**
         * Gets array of all "annotation" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation[] getAnnotationArray() {
            return getXmlObjectArray(PROPERTY_QNAME[3], new org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation[0]);
        }

        /**
         * Gets ith "annotation" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation getAnnotationArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation)get_store().find_element_user(PROPERTY_QNAME[3], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "annotation" element
         */
        public int sizeOfAnnotationArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[3]);
            }
        }

        /**
         * Sets array of all "annotation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAnnotationArray(org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation[] annotationArray) {
            check_orphaned();
            arraySetterHelper(annotationArray, PROPERTY_QNAME[3]);
        }

        /**
         * Sets ith "annotation" element
         */
        public void setAnnotationArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation annotation) {
            generatedSetterHelperImpl(annotation, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "annotation" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation insertNewAnnotation(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation)get_store().insert_element_user(PROPERTY_QNAME[3], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "annotation" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation addNewAnnotation() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation)get_store().add_element_user(PROPERTY_QNAME[3]);
                return target;
            }
        }

        /**
         * Removes the ith "annotation" element
         */
        public void removeAnnotation(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[3], i);
            }
        }

        /**
         * Gets a List of "simpleType" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType> getSimpleTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getSimpleTypeArray,
                    this::setSimpleTypeArray,
                    this::insertNewSimpleType,
                    this::removeSimpleType,
                    this::sizeOfSimpleTypeArray
                );
            }
        }

        /**
         * Gets array of all "simpleType" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType[] getSimpleTypeArray() {
            return getXmlObjectArray(PROPERTY_QNAME[4], new org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType[0]);
        }

        /**
         * Gets ith "simpleType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType getSimpleTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType)get_store().find_element_user(PROPERTY_QNAME[4], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "simpleType" element
         */
        public int sizeOfSimpleTypeArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[4]);
            }
        }

        /**
         * Sets array of all "simpleType" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSimpleTypeArray(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType[] simpleTypeArray) {
            check_orphaned();
            arraySetterHelper(simpleTypeArray, PROPERTY_QNAME[4]);
        }

        /**
         * Sets ith "simpleType" element
         */
        public void setSimpleTypeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType simpleType) {
            generatedSetterHelperImpl(simpleType, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "simpleType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType insertNewSimpleType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType)get_store().insert_element_user(PROPERTY_QNAME[4], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "simpleType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType addNewSimpleType() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType)get_store().add_element_user(PROPERTY_QNAME[4]);
                return target;
            }
        }

        /**
         * Removes the ith "simpleType" element
         */
        public void removeSimpleType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[4], i);
            }
        }

        /**
         * Gets a List of "complexType" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType> getComplexTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getComplexTypeArray,
                    this::setComplexTypeArray,
                    this::insertNewComplexType,
                    this::removeComplexType,
                    this::sizeOfComplexTypeArray
                );
            }
        }

        /**
         * Gets array of all "complexType" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType[] getComplexTypeArray() {
            return getXmlObjectArray(PROPERTY_QNAME[5], new org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType[0]);
        }

        /**
         * Gets ith "complexType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType getComplexTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType)get_store().find_element_user(PROPERTY_QNAME[5], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "complexType" element
         */
        public int sizeOfComplexTypeArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[5]);
            }
        }

        /**
         * Sets array of all "complexType" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setComplexTypeArray(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType[] complexTypeArray) {
            check_orphaned();
            arraySetterHelper(complexTypeArray, PROPERTY_QNAME[5]);
        }

        /**
         * Sets ith "complexType" element
         */
        public void setComplexTypeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType complexType) {
            generatedSetterHelperImpl(complexType, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "complexType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType insertNewComplexType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType)get_store().insert_element_user(PROPERTY_QNAME[5], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "complexType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType addNewComplexType() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType)get_store().add_element_user(PROPERTY_QNAME[5]);
                return target;
            }
        }

        /**
         * Removes the ith "complexType" element
         */
        public void removeComplexType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[5], i);
            }
        }

        /**
         * Gets a List of "group" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup> getGroupList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getGroupArray,
                    this::setGroupArray,
                    this::insertNewGroup,
                    this::removeGroup,
                    this::sizeOfGroupArray
                );
            }
        }

        /**
         * Gets array of all "group" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup[] getGroupArray() {
            return getXmlObjectArray(PROPERTY_QNAME[6], new org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup[0]);
        }

        /**
         * Gets ith "group" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup getGroupArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup)get_store().find_element_user(PROPERTY_QNAME[6], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "group" element
         */
        public int sizeOfGroupArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[6]);
            }
        }

        /**
         * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup[] groupArray) {
            check_orphaned();
            arraySetterHelper(groupArray, PROPERTY_QNAME[6]);
        }

        /**
         * Sets ith "group" element
         */
        public void setGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup group) {
            generatedSetterHelperImpl(group, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "group" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup insertNewGroup(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup)get_store().insert_element_user(PROPERTY_QNAME[6], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "group" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup addNewGroup() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup)get_store().add_element_user(PROPERTY_QNAME[6]);
                return target;
            }
        }

        /**
         * Removes the ith "group" element
         */
        public void removeGroup(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[6], i);
            }
        }

        /**
         * Gets a List of "attributeGroup" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup> getAttributeGroupList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getAttributeGroupArray,
                    this::setAttributeGroupArray,
                    this::insertNewAttributeGroup,
                    this::removeAttributeGroup,
                    this::sizeOfAttributeGroupArray
                );
            }
        }

        /**
         * Gets array of all "attributeGroup" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup[] getAttributeGroupArray() {
            return getXmlObjectArray(PROPERTY_QNAME[7], new org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup[0]);
        }

        /**
         * Gets ith "attributeGroup" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup getAttributeGroupArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup)get_store().find_element_user(PROPERTY_QNAME[7], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "attributeGroup" element
         */
        public int sizeOfAttributeGroupArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[7]);
            }
        }

        /**
         * Sets array of all "attributeGroup" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAttributeGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup[] attributeGroupArray) {
            check_orphaned();
            arraySetterHelper(attributeGroupArray, PROPERTY_QNAME[7]);
        }

        /**
         * Sets ith "attributeGroup" element
         */
        public void setAttributeGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup attributeGroup) {
            generatedSetterHelperImpl(attributeGroup, PROPERTY_QNAME[7], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup insertNewAttributeGroup(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup)get_store().insert_element_user(PROPERTY_QNAME[7], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "attributeGroup" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup addNewAttributeGroup() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup)get_store().add_element_user(PROPERTY_QNAME[7]);
                return target;
            }
        }

        /**
         * Removes the ith "attributeGroup" element
         */
        public void removeAttributeGroup(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[7], i);
            }
        }

        /**
         * Gets a List of "element" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement> getElementList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getElementArray,
                    this::setElementArray,
                    this::insertNewElement,
                    this::removeElement,
                    this::sizeOfElementArray
                );
            }
        }

        /**
         * Gets array of all "element" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement[] getElementArray() {
            return getXmlObjectArray(PROPERTY_QNAME[8], new org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement[0]);
        }

        /**
         * Gets ith "element" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement getElementArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement)get_store().find_element_user(PROPERTY_QNAME[8], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "element" element
         */
        public int sizeOfElementArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[8]);
            }
        }

        /**
         * Sets array of all "element" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setElementArray(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement[] elementArray) {
            check_orphaned();
            arraySetterHelper(elementArray, PROPERTY_QNAME[8]);
        }

        /**
         * Sets ith "element" element
         */
        public void setElementArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement element) {
            generatedSetterHelperImpl(element, PROPERTY_QNAME[8], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "element" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement insertNewElement(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement)get_store().insert_element_user(PROPERTY_QNAME[8], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "element" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement addNewElement() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement)get_store().add_element_user(PROPERTY_QNAME[8]);
                return target;
            }
        }

        /**
         * Removes the ith "element" element
         */
        public void removeElement(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[8], i);
            }
        }

        /**
         * Gets a List of "attribute" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute> getAttributeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getAttributeArray,
                    this::setAttributeArray,
                    this::insertNewAttribute,
                    this::removeAttribute,
                    this::sizeOfAttributeArray
                );
            }
        }

        /**
         * Gets array of all "attribute" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute[] getAttributeArray() {
            return getXmlObjectArray(PROPERTY_QNAME[9], new org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute[0]);
        }

        /**
         * Gets ith "attribute" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute getAttributeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute)get_store().find_element_user(PROPERTY_QNAME[9], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "attribute" element
         */
        public int sizeOfAttributeArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[9]);
            }
        }

        /**
         * Sets array of all "attribute" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAttributeArray(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute[] attributeArray) {
            check_orphaned();
            arraySetterHelper(attributeArray, PROPERTY_QNAME[9]);
        }

        /**
         * Sets ith "attribute" element
         */
        public void setAttributeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute attribute) {
            generatedSetterHelperImpl(attribute, PROPERTY_QNAME[9], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "attribute" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute insertNewAttribute(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute)get_store().insert_element_user(PROPERTY_QNAME[9], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "attribute" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute addNewAttribute() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute)get_store().add_element_user(PROPERTY_QNAME[9]);
                return target;
            }
        }

        /**
         * Removes the ith "attribute" element
         */
        public void removeAttribute(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[9], i);
            }
        }

        /**
         * Gets a List of "notation" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation> getNotationList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getNotationArray,
                    this::setNotationArray,
                    this::insertNewNotation,
                    this::removeNotation,
                    this::sizeOfNotationArray
                );
            }
        }

        /**
         * Gets array of all "notation" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation[] getNotationArray() {
            return getXmlObjectArray(PROPERTY_QNAME[10], new org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation[0]);
        }

        /**
         * Gets ith "notation" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation getNotationArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation)get_store().find_element_user(PROPERTY_QNAME[10], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "notation" element
         */
        public int sizeOfNotationArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[10]);
            }
        }

        /**
         * Sets array of all "notation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNotationArray(org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation[] notationArray) {
            check_orphaned();
            arraySetterHelper(notationArray, PROPERTY_QNAME[10]);
        }

        /**
         * Sets ith "notation" element
         */
        public void setNotationArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation notation) {
            generatedSetterHelperImpl(notation, PROPERTY_QNAME[10], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "notation" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation insertNewNotation(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation)get_store().insert_element_user(PROPERTY_QNAME[10], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "notation" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation addNewNotation() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation)get_store().add_element_user(PROPERTY_QNAME[10]);
                return target;
            }
        }

        /**
         * Removes the ith "notation" element
         */
        public void removeNotation(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[10], i);
            }
        }

        /**
         * Gets the "targetNamespace" attribute
         */
        public java.lang.String getTargetNamespace() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "targetNamespace" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[11]);
                return target;
            }
        }

        /**
         * True if has "targetNamespace" attribute
         */
        public boolean isSetTargetNamespace() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
            }
        }

        /**
         * Sets the "targetNamespace" attribute
         */
        public void setTargetNamespace(java.lang.String targetNamespace) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
                }
                target.setStringValue(targetNamespace);
            }
        }

        /**
         * Sets (as xml) the "targetNamespace" attribute
         */
        public void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[11]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[11]);
                }
                target.set(targetNamespace);
            }
        }

        /**
         * Unsets the "targetNamespace" attribute
         */
        public void unsetTargetNamespace() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[11]);
            }
        }

        /**
         * Gets the "version" attribute
         */
        public java.lang.String getVersion() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "version" attribute
         */
        public org.apache.xmlbeans.XmlToken xgetVersion() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlToken target = null;
                target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[12]);
                return target;
            }
        }

        /**
         * True if has "version" attribute
         */
        public boolean isSetVersion() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
            }
        }

        /**
         * Sets the "version" attribute
         */
        public void setVersion(java.lang.String version) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
                }
                target.setStringValue(version);
            }
        }

        /**
         * Sets (as xml) the "version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlToken version) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlToken target = null;
                target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[12]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(PROPERTY_QNAME[12]);
                }
                target.set(version);
            }
        }

        /**
         * Unsets the "version" attribute
         */
        public void unsetVersion() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[12]);
            }
        }

        /**
         * Gets the "finalDefault" attribute
         */
        public java.lang.Object getFinalDefault() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[13]);
                }
                return (target == null) ? null : target.getObjectValue();
            }
        }

        /**
         * Gets (as xml) the "finalDefault" attribute
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.FullDerivationSet xgetFinalDefault() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.FullDerivationSet target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.FullDerivationSet)get_store().find_attribute_user(PROPERTY_QNAME[13]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.FullDerivationSet)get_default_attribute_value(PROPERTY_QNAME[13]);
                }
                return target;
            }
        }

        /**
         * True if has "finalDefault" attribute
         */
        public boolean isSetFinalDefault() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
            }
        }

        /**
         * Sets the "finalDefault" attribute
         */
        public void setFinalDefault(java.lang.Object finalDefault) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
                }
                target.setObjectValue(finalDefault);
            }
        }

        /**
         * Sets (as xml) the "finalDefault" attribute
         */
        public void xsetFinalDefault(org.apache.xmlbeans.impl.xb.xsdschema.FullDerivationSet finalDefault) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.FullDerivationSet target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.FullDerivationSet)get_store().find_attribute_user(PROPERTY_QNAME[13]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.FullDerivationSet)get_store().add_attribute_user(PROPERTY_QNAME[13]);
                }
                target.set(finalDefault);
            }
        }

        /**
         * Unsets the "finalDefault" attribute
         */
        public void unsetFinalDefault() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[13]);
            }
        }

        /**
         * Gets the "blockDefault" attribute
         */
        public java.lang.Object getBlockDefault() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[14]);
                }
                return (target == null) ? null : target.getObjectValue();
            }
        }

        /**
         * Gets (as xml) the "blockDefault" attribute
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.BlockSet xgetBlockDefault() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.BlockSet target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.BlockSet)get_store().find_attribute_user(PROPERTY_QNAME[14]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.BlockSet)get_default_attribute_value(PROPERTY_QNAME[14]);
                }
                return target;
            }
        }

        /**
         * True if has "blockDefault" attribute
         */
        public boolean isSetBlockDefault() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
            }
        }

        /**
         * Sets the "blockDefault" attribute
         */
        public void setBlockDefault(java.lang.Object blockDefault) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
                }
                target.setObjectValue(blockDefault);
            }
        }

        /**
         * Sets (as xml) the "blockDefault" attribute
         */
        public void xsetBlockDefault(org.apache.xmlbeans.impl.xb.xsdschema.BlockSet blockDefault) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.BlockSet target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.BlockSet)get_store().find_attribute_user(PROPERTY_QNAME[14]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.BlockSet)get_store().add_attribute_user(PROPERTY_QNAME[14]);
                }
                target.set(blockDefault);
            }
        }

        /**
         * Unsets the "blockDefault" attribute
         */
        public void unsetBlockDefault() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[14]);
            }
        }

        /**
         * Gets the "attributeFormDefault" attribute
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum getAttributeFormDefault() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[15]);
                }
                return (target == null) ? null : (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum)target.getEnumValue();
            }
        }

        /**
         * Gets (as xml) the "attributeFormDefault" attribute
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.FormChoice xgetAttributeFormDefault() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.FormChoice target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_store().find_attribute_user(PROPERTY_QNAME[15]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_default_attribute_value(PROPERTY_QNAME[15]);
                }
                return target;
            }
        }

        /**
         * True if has "attributeFormDefault" attribute
         */
        public boolean isSetAttributeFormDefault() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[15]) != null;
            }
        }

        /**
         * Sets the "attributeFormDefault" attribute
         */
        public void setAttributeFormDefault(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum attributeFormDefault) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[15]);
                }
                target.setEnumValue(attributeFormDefault);
            }
        }

        /**
         * Sets (as xml) the "attributeFormDefault" attribute
         */
        public void xsetAttributeFormDefault(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice attributeFormDefault) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.FormChoice target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_store().find_attribute_user(PROPERTY_QNAME[15]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_store().add_attribute_user(PROPERTY_QNAME[15]);
                }
                target.set(attributeFormDefault);
            }
        }

        /**
         * Unsets the "attributeFormDefault" attribute
         */
        public void unsetAttributeFormDefault() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[15]);
            }
        }

        /**
         * Gets the "elementFormDefault" attribute
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum getElementFormDefault() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[16]);
                }
                return (target == null) ? null : (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum)target.getEnumValue();
            }
        }

        /**
         * Gets (as xml) the "elementFormDefault" attribute
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.FormChoice xgetElementFormDefault() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.FormChoice target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_store().find_attribute_user(PROPERTY_QNAME[16]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_default_attribute_value(PROPERTY_QNAME[16]);
                }
                return target;
            }
        }

        /**
         * True if has "elementFormDefault" attribute
         */
        public boolean isSetElementFormDefault() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[16]) != null;
            }
        }

        /**
         * Sets the "elementFormDefault" attribute
         */
        public void setElementFormDefault(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum elementFormDefault) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[16]);
                }
                target.setEnumValue(elementFormDefault);
            }
        }

        /**
         * Sets (as xml) the "elementFormDefault" attribute
         */
        public void xsetElementFormDefault(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice elementFormDefault) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.FormChoice target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_store().find_attribute_user(PROPERTY_QNAME[16]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_store().add_attribute_user(PROPERTY_QNAME[16]);
                }
                target.set(elementFormDefault);
            }
        }

        /**
         * Unsets the "elementFormDefault" attribute
         */
        public void unsetElementFormDefault() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[16]);
            }
        }

        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlID xgetId() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(PROPERTY_QNAME[17]);
                return target;
            }
        }

        /**
         * True if has "id" attribute
         */
        public boolean isSetId() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[17]) != null;
            }
        }

        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[17]);
                }
                target.setStringValue(id);
            }
        }

        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlID id) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(PROPERTY_QNAME[17]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(PROPERTY_QNAME[17]);
                }
                target.set(id);
            }
        }

        /**
         * Unsets the "id" attribute
         */
        public void unsetId() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[17]);
            }
        }

        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[18]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang xgetLang() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang)get_store().find_attribute_user(PROPERTY_QNAME[18]);
                return target;
            }
        }

        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[18]) != null;
            }
        }

        /**
         * Sets the "lang" attribute
         */
        public void setLang(java.lang.String lang) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[18]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[18]);
                }
                target.setStringValue(lang);
            }
        }

        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang lang) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang)get_store().find_attribute_user(PROPERTY_QNAME[18]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang)get_store().add_attribute_user(PROPERTY_QNAME[18]);
                }
                target.set(lang);
            }
        }

        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[18]);
            }
        }
    }
}
