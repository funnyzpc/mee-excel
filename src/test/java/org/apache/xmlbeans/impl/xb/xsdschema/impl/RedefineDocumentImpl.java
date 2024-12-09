/*
 * An XML document type.
 * Localname: redefine
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one redefine(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class RedefineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument {
    private static final long serialVersionUID = 1L;

    public RedefineDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "redefine"),
    };


    /**
     * Gets the "redefine" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine getRedefine() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "redefine" element
     */
    public void setRedefine(org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine redefine) {
        generatedSetterHelperImpl(redefine, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "redefine" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine addNewRedefine() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML redefine(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class RedefineImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.OpenAttrsImpl implements org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine {
        private static final long serialVersionUID = 1L;

        public RedefineImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://www.w3.org/2001/XMLSchema", "annotation"),
            new QName("http://www.w3.org/2001/XMLSchema", "simpleType"),
            new QName("http://www.w3.org/2001/XMLSchema", "complexType"),
            new QName("http://www.w3.org/2001/XMLSchema", "group"),
            new QName("http://www.w3.org/2001/XMLSchema", "attributeGroup"),
            new QName("", "schemaLocation"),
            new QName("", "id"),
        };


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
            return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation[0]);
        }

        /**
         * Gets ith "annotation" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation getAnnotationArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "annotation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAnnotationArray(org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation[] annotationArray) {
            check_orphaned();
            arraySetterHelper(annotationArray, PROPERTY_QNAME[0]);
        }

        /**
         * Sets ith "annotation" element
         */
        public void setAnnotationArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation annotation) {
            generatedSetterHelperImpl(annotation, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "annotation" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation insertNewAnnotation(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation)get_store().insert_element_user(PROPERTY_QNAME[0], i);
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
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "annotation" element
         */
        public void removeAnnotation(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
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
            return getXmlObjectArray(PROPERTY_QNAME[1], new org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType[0]);
        }

        /**
         * Gets ith "simpleType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType getSimpleTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType)get_store().find_element_user(PROPERTY_QNAME[1], i);
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
                return get_store().count_elements(PROPERTY_QNAME[1]);
            }
        }

        /**
         * Sets array of all "simpleType" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSimpleTypeArray(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType[] simpleTypeArray) {
            check_orphaned();
            arraySetterHelper(simpleTypeArray, PROPERTY_QNAME[1]);
        }

        /**
         * Sets ith "simpleType" element
         */
        public void setSimpleTypeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType simpleType) {
            generatedSetterHelperImpl(simpleType, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "simpleType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType insertNewSimpleType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
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
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType)get_store().add_element_user(PROPERTY_QNAME[1]);
                return target;
            }
        }

        /**
         * Removes the ith "simpleType" element
         */
        public void removeSimpleType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[1], i);
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
            return getXmlObjectArray(PROPERTY_QNAME[2], new org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType[0]);
        }

        /**
         * Gets ith "complexType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType getComplexTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType)get_store().find_element_user(PROPERTY_QNAME[2], i);
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
                return get_store().count_elements(PROPERTY_QNAME[2]);
            }
        }

        /**
         * Sets array of all "complexType" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setComplexTypeArray(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType[] complexTypeArray) {
            check_orphaned();
            arraySetterHelper(complexTypeArray, PROPERTY_QNAME[2]);
        }

        /**
         * Sets ith "complexType" element
         */
        public void setComplexTypeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType complexType) {
            generatedSetterHelperImpl(complexType, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "complexType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType insertNewComplexType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
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
                target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType)get_store().add_element_user(PROPERTY_QNAME[2]);
                return target;
            }
        }

        /**
         * Removes the ith "complexType" element
         */
        public void removeComplexType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[2], i);
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
            return getXmlObjectArray(PROPERTY_QNAME[3], new org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup[0]);
        }

        /**
         * Gets ith "group" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup getGroupArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup)get_store().find_element_user(PROPERTY_QNAME[3], i);
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
                return get_store().count_elements(PROPERTY_QNAME[3]);
            }
        }

        /**
         * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup[] groupArray) {
            check_orphaned();
            arraySetterHelper(groupArray, PROPERTY_QNAME[3]);
        }

        /**
         * Sets ith "group" element
         */
        public void setGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup group) {
            generatedSetterHelperImpl(group, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "group" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup insertNewGroup(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup)get_store().insert_element_user(PROPERTY_QNAME[3], i);
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
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup)get_store().add_element_user(PROPERTY_QNAME[3]);
                return target;
            }
        }

        /**
         * Removes the ith "group" element
         */
        public void removeGroup(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[3], i);
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
            return getXmlObjectArray(PROPERTY_QNAME[4], new org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup[0]);
        }

        /**
         * Gets ith "attributeGroup" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup getAttributeGroupArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup)get_store().find_element_user(PROPERTY_QNAME[4], i);
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
                return get_store().count_elements(PROPERTY_QNAME[4]);
            }
        }

        /**
         * Sets array of all "attributeGroup" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAttributeGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup[] attributeGroupArray) {
            check_orphaned();
            arraySetterHelper(attributeGroupArray, PROPERTY_QNAME[4]);
        }

        /**
         * Sets ith "attributeGroup" element
         */
        public void setAttributeGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup attributeGroup) {
            generatedSetterHelperImpl(attributeGroup, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup insertNewAttributeGroup(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup)get_store().insert_element_user(PROPERTY_QNAME[4], i);
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
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup)get_store().add_element_user(PROPERTY_QNAME[4]);
                return target;
            }
        }

        /**
         * Removes the ith "attributeGroup" element
         */
        public void removeAttributeGroup(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[4], i);
            }
        }

        /**
         * Gets the "schemaLocation" attribute
         */
        public java.lang.String getSchemaLocation() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "schemaLocation" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetSchemaLocation() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[5]);
                return target;
            }
        }

        /**
         * Sets the "schemaLocation" attribute
         */
        public void setSchemaLocation(java.lang.String schemaLocation) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
                }
                target.setStringValue(schemaLocation);
            }
        }

        /**
         * Sets (as xml) the "schemaLocation" attribute
         */
        public void xsetSchemaLocation(org.apache.xmlbeans.XmlAnyURI schemaLocation) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[5]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[5]);
                }
                target.set(schemaLocation);
            }
        }

        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(PROPERTY_QNAME[6]);
                return target;
            }
        }

        /**
         * True if has "id" attribute
         */
        public boolean isSetId() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
            }
        }

        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(PROPERTY_QNAME[6]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(PROPERTY_QNAME[6]);
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
                get_store().remove_attribute(PROPERTY_QNAME[6]);
            }
        }
    }
}
