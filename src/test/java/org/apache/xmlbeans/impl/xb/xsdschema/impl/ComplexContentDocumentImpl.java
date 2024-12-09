/*
 * An XML document type.
 * Localname: complexContent
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one complexContent(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class ComplexContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument {
    private static final long serialVersionUID = 1L;

    public ComplexContentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "complexContent"),
    };


    /**
     * Gets the "complexContent" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent getComplexContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "complexContent" element
     */
    public void setComplexContent(org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent complexContent) {
        generatedSetterHelperImpl(complexContent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "complexContent" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent addNewComplexContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML complexContent(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class ComplexContentImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent {
        private static final long serialVersionUID = 1L;

        public ComplexContentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://www.w3.org/2001/XMLSchema", "restriction"),
            new QName("http://www.w3.org/2001/XMLSchema", "extension"),
            new QName("", "mixed"),
        };


        /**
         * Gets the "restriction" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.ComplexRestrictionType getRestriction() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.ComplexRestrictionType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.ComplexRestrictionType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
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
        public void setRestriction(org.apache.xmlbeans.impl.xb.xsdschema.ComplexRestrictionType restriction) {
            generatedSetterHelperImpl(restriction, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }

        /**
         * Appends and returns a new empty "restriction" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.ComplexRestrictionType addNewRestriction() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.ComplexRestrictionType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.ComplexRestrictionType)get_store().add_element_user(PROPERTY_QNAME[0]);
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
        public org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType getExtension() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
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
        public void setExtension(org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType extension) {
            generatedSetterHelperImpl(extension, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }

        /**
         * Appends and returns a new empty "extension" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType addNewExtension() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType)get_store().add_element_user(PROPERTY_QNAME[1]);
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

        /**
         * Gets the "mixed" attribute
         */
        public boolean getMixed() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "mixed" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetMixed() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                return target;
            }
        }

        /**
         * True if has "mixed" attribute
         */
        public boolean isSetMixed() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
            }
        }

        /**
         * Sets the "mixed" attribute
         */
        public void setMixed(boolean mixed) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
                }
                target.setBooleanValue(mixed);
            }
        }

        /**
         * Sets (as xml) the "mixed" attribute
         */
        public void xsetMixed(org.apache.xmlbeans.XmlBoolean mixed) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[2]);
                }
                target.set(mixed);
            }
        }

        /**
         * Unsets the "mixed" attribute
         */
        public void unsetMixed() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[2]);
            }
        }
    }
}
