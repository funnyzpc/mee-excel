/*
 * An XML document type.
 * Localname: annotation
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one annotation(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class AnnotationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument {
    private static final long serialVersionUID = 1L;

    public AnnotationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "annotation"),
    };


    /**
     * Gets the "annotation" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation getAnnotation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "annotation" element
     */
    public void setAnnotation(org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation annotation) {
        generatedSetterHelperImpl(annotation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "annotation" element
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
     * An XML annotation(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class AnnotationImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.OpenAttrsImpl implements org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation {
        private static final long serialVersionUID = 1L;

        public AnnotationImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://www.w3.org/2001/XMLSchema", "appinfo"),
            new QName("http://www.w3.org/2001/XMLSchema", "documentation"),
            new QName("", "id"),
        };


        /**
         * Gets a List of "appinfo" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo> getAppinfoList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getAppinfoArray,
                    this::setAppinfoArray,
                    this::insertNewAppinfo,
                    this::removeAppinfo,
                    this::sizeOfAppinfoArray
                );
            }
        }

        /**
         * Gets array of all "appinfo" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo[] getAppinfoArray() {
            return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo[0]);
        }

        /**
         * Gets ith "appinfo" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo getAppinfoArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "appinfo" element
         */
        public int sizeOfAppinfoArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "appinfo" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAppinfoArray(org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo[] appinfoArray) {
            check_orphaned();
            arraySetterHelper(appinfoArray, PROPERTY_QNAME[0]);
        }

        /**
         * Sets ith "appinfo" element
         */
        public void setAppinfoArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo appinfo) {
            generatedSetterHelperImpl(appinfo, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "appinfo" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo insertNewAppinfo(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "appinfo" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo addNewAppinfo() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "appinfo" element
         */
        public void removeAppinfo(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }

        /**
         * Gets a List of "documentation" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation> getDocumentationList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getDocumentationArray,
                    this::setDocumentationArray,
                    this::insertNewDocumentation,
                    this::removeDocumentation,
                    this::sizeOfDocumentationArray
                );
            }
        }

        /**
         * Gets array of all "documentation" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation[] getDocumentationArray() {
            return getXmlObjectArray(PROPERTY_QNAME[1], new org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation[0]);
        }

        /**
         * Gets ith "documentation" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation getDocumentationArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation)get_store().find_element_user(PROPERTY_QNAME[1], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "documentation" element
         */
        public int sizeOfDocumentationArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[1]);
            }
        }

        /**
         * Sets array of all "documentation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDocumentationArray(org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation[] documentationArray) {
            check_orphaned();
            arraySetterHelper(documentationArray, PROPERTY_QNAME[1]);
        }

        /**
         * Sets ith "documentation" element
         */
        public void setDocumentationArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation documentation) {
            generatedSetterHelperImpl(documentation, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "documentation" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation insertNewDocumentation(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation)get_store().insert_element_user(PROPERTY_QNAME[1], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "documentation" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation addNewDocumentation() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.DocumentationDocument.Documentation)get_store().add_element_user(PROPERTY_QNAME[1]);
                return target;
            }
        }

        /**
         * Removes the ith "documentation" element
         */
        public void removeDocumentation(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[1], i);
            }
        }

        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                return target;
            }
        }

        /**
         * True if has "id" attribute
         */
        public boolean isSetId() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
            }
        }

        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(PROPERTY_QNAME[2]);
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
                get_store().remove_attribute(PROPERTY_QNAME[2]);
            }
        }
    }
}
