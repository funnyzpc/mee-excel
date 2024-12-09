/*
 * An XML document type.
 * Localname: simpleContent
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one simpleContent(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class SimpleContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument {
    private static final long serialVersionUID = 1L;

    public SimpleContentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "simpleContent"),
    };


    /**
     * Gets the "simpleContent" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent getSimpleContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "simpleContent" element
     */
    public void setSimpleContent(org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent simpleContent) {
        generatedSetterHelperImpl(simpleContent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "simpleContent" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent addNewSimpleContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML simpleContent(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class SimpleContentImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent {
        private static final long serialVersionUID = 1L;

        public SimpleContentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://www.w3.org/2001/XMLSchema", "restriction"),
            new QName("http://www.w3.org/2001/XMLSchema", "extension"),
        };


        /**
         * Gets the "restriction" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.SimpleRestrictionType getRestriction() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.SimpleRestrictionType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.SimpleRestrictionType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                return (target == null) ? null : target;
            }
        }

        /**
         * True if has "restriction" element
         */
        public boolean isSetRestriction() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
            }
        }

        /**
         * Sets the "restriction" element
         */
        public void setRestriction(org.apache.xmlbeans.impl.xb.xsdschema.SimpleRestrictionType restriction) {
            generatedSetterHelperImpl(restriction, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }

        /**
         * Appends and returns a new empty "restriction" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.SimpleRestrictionType addNewRestriction() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.SimpleRestrictionType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.SimpleRestrictionType)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Unsets the "restriction" element
         */
        public void unsetRestriction() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], 0);
            }
        }

        /**
         * Gets the "extension" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.SimpleExtensionType getExtension() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.SimpleExtensionType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.SimpleExtensionType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
                return (target == null) ? null : target;
            }
        }

        /**
         * True if has "extension" element
         */
        public boolean isSetExtension() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
            }
        }

        /**
         * Sets the "extension" element
         */
        public void setExtension(org.apache.xmlbeans.impl.xb.xsdschema.SimpleExtensionType extension) {
            generatedSetterHelperImpl(extension, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }

        /**
         * Appends and returns a new empty "extension" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.SimpleExtensionType addNewExtension() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.SimpleExtensionType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.SimpleExtensionType)get_store().add_element_user(PROPERTY_QNAME[1]);
                return target;
            }
        }

        /**
         * Unsets the "extension" element
         */
        public void unsetExtension() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[1], 0);
            }
        }
    }
}
