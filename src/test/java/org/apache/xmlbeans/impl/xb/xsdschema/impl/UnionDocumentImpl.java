/*
 * An XML document type.
 * Localname: union
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one union(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class UnionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument {
    private static final long serialVersionUID = 1L;

    public UnionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "union"),
    };


    /**
     * Gets the "union" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union getUnion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "union" element
     */
    public void setUnion(org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union union) {
        generatedSetterHelperImpl(union, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "union" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union addNewUnion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML union(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class UnionImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union {
        private static final long serialVersionUID = 1L;

        public UnionImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://www.w3.org/2001/XMLSchema", "simpleType"),
            new QName("", "memberTypes"),
        };


        /**
         * Gets a List of "simpleType" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType> getSimpleTypeList() {
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
        public org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType[] getSimpleTypeArray() {
            return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType[0]);
        }

        /**
         * Gets ith "simpleType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType getSimpleTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "simpleType" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSimpleTypeArray(org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType[] simpleTypeArray) {
            check_orphaned();
            arraySetterHelper(simpleTypeArray, PROPERTY_QNAME[0]);
        }

        /**
         * Sets ith "simpleType" element
         */
        public void setSimpleTypeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType simpleType) {
            generatedSetterHelperImpl(simpleType, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "simpleType" element
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType insertNewSimpleType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "simpleType" element
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
         * Removes the ith "simpleType" element
         */
        public void removeSimpleType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }

        /**
         * Gets the "memberTypes" attribute
         */
        public java.util.List getMemberTypes() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                return (target == null) ? null : target.getListValue();
            }
        }

        /**
         * Gets (as xml) the "memberTypes" attribute
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union.MemberTypes xgetMemberTypes() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union.MemberTypes target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union.MemberTypes)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                return target;
            }
        }

        /**
         * True if has "memberTypes" attribute
         */
        public boolean isSetMemberTypes() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
            }
        }

        /**
         * Sets the "memberTypes" attribute
         */
        public void setMemberTypes(java.util.List memberTypes) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.setListValue(memberTypes);
            }
        }

        /**
         * Sets (as xml) the "memberTypes" attribute
         */
        public void xsetMemberTypes(org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union.MemberTypes memberTypes) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union.MemberTypes target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union.MemberTypes)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union.MemberTypes)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.set(memberTypes);
            }
        }

        /**
         * Unsets the "memberTypes" attribute
         */
        public void unsetMemberTypes() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[1]);
            }
        }
        /**
         * An XML memberTypes(@).
         *
         * This is a list type whose items are org.apache.xmlbeans.XmlQName.
         */
        public static class MemberTypesImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union.MemberTypes {
            private static final long serialVersionUID = 1L;

            public MemberTypesImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected MemberTypesImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
}
