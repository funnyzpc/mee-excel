/*
 * An XML document type.
 * Localname: any
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one any(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class AnyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument {
    private static final long serialVersionUID = 1L;

    public AnyDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "any"),
    };


    /**
     * Gets the "any" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any getAny() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "any" element
     */
    public void setAny(org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any any) {
        generatedSetterHelperImpl(any, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "any" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any addNewAny() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML any(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class AnyImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.WildcardImpl implements org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any {
        private static final long serialVersionUID = 1L;

        public AnyImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "minOccurs"),
            new QName("", "maxOccurs"),
        };


        /**
         * Gets the "minOccurs" attribute
         */
        public java.math.BigInteger getMinOccurs() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? null : target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "minOccurs" attribute
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetMinOccurs() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "minOccurs" attribute
         */
        public boolean isSetMinOccurs() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "minOccurs" attribute
         */
        public void setMinOccurs(java.math.BigInteger minOccurs) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBigIntegerValue(minOccurs);
            }
        }

        /**
         * Sets (as xml) the "minOccurs" attribute
         */
        public void xsetMinOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minOccurs) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(minOccurs);
            }
        }

        /**
         * Unsets the "minOccurs" attribute
         */
        public void unsetMinOccurs() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Gets the "maxOccurs" attribute
         */
        public java.lang.Object getMaxOccurs() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
                }
                return (target == null) ? null : target.getObjectValue();
            }
        }

        /**
         * Gets (as xml) the "maxOccurs" attribute
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.AllNNI xgetMaxOccurs() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.AllNNI target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AllNNI)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.AllNNI)get_default_attribute_value(PROPERTY_QNAME[1]);
                }
                return target;
            }
        }

        /**
         * True if has "maxOccurs" attribute
         */
        public boolean isSetMaxOccurs() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
            }
        }

        /**
         * Sets the "maxOccurs" attribute
         */
        public void setMaxOccurs(java.lang.Object maxOccurs) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.setObjectValue(maxOccurs);
            }
        }

        /**
         * Sets (as xml) the "maxOccurs" attribute
         */
        public void xsetMaxOccurs(org.apache.xmlbeans.impl.xb.xsdschema.AllNNI maxOccurs) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.AllNNI target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AllNNI)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.AllNNI)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.set(maxOccurs);
            }
        }

        /**
         * Unsets the "maxOccurs" attribute
         */
        public void unsetMaxOccurs() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[1]);
            }
        }
    }
}
