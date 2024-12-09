/*
 * An XML document type.
 * Localname: list
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ListDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one list(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class ListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.ListDocument {
    private static final long serialVersionUID = 1L;

    public ListDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "list"),
    };


    /**
     * Gets the "list" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List getList() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "list" element
     */
    public void setList(org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List list) {
        generatedSetterHelperImpl(list, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "list" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List addNewList() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML list(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class ListImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List {
        private static final long serialVersionUID = 1L;

        public ListImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://www.w3.org/2001/XMLSchema", "simpleType"),
            new QName("", "itemType"),
        };


        /**
         * Gets the "simpleType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType getSimpleType() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                return (target == null) ? null : target;
            }
        }

        /**
         * True if has "simpleType" element
         */
        public boolean isSetSimpleType() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
            }
        }

        /**
         * Sets the "simpleType" element
         */
        public void setSimpleType(org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType simpleType) {
            generatedSetterHelperImpl(simpleType, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }

        /**
         * Appends and returns a new empty "simpleType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType addNewSimpleType() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Unsets the "simpleType" element
         */
        public void unsetSimpleType() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], 0);
            }
        }

        /**
         * Gets the "itemType" attribute
         */
        public javax.xml.namespace.QName getItemType() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                return (target == null) ? null : target.getQNameValue();
            }
        }

        /**
         * Gets (as xml) the "itemType" attribute
         */
        public org.apache.xmlbeans.XmlQName xgetItemType() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                return target;
            }
        }

        /**
         * True if has "itemType" attribute
         */
        public boolean isSetItemType() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
            }
        }

        /**
         * Sets the "itemType" attribute
         */
        public void setItemType(javax.xml.namespace.QName itemType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.setQNameValue(itemType);
            }
        }

        /**
         * Sets (as xml) the "itemType" attribute
         */
        public void xsetItemType(org.apache.xmlbeans.XmlQName itemType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.set(itemType);
            }
        }

        /**
         * Unsets the "itemType" attribute
         */
        public void unsetItemType() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[1]);
            }
        }
    }
}
