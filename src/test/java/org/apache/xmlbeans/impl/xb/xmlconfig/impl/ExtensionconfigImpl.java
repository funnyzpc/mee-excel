/*
 * XML Type:  extensionconfig
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlconfig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML extensionconfig(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a complex type.
 */
public class ExtensionconfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig {
    private static final long serialVersionUID = 1L;

    public ExtensionconfigImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "interface"),
        new QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "prePostSet"),
        new QName("", "for"),
    };


    /**
     * Gets a List of "interface" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface> getInterfaceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getInterfaceArray,
                this::setInterfaceArray,
                this::insertNewInterface,
                this::removeInterface,
                this::sizeOfInterfaceArray
            );
        }
    }

    /**
     * Gets array of all "interface" elements
     */
    public org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface[] getInterfaceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface[0]);
    }

    /**
     * Gets ith "interface" element
     */
    public org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface getInterfaceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "interface" element
     */
    public int sizeOfInterfaceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "interface" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInterfaceArray(org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface[] xinterfaceArray) {
        check_orphaned();
        arraySetterHelper(xinterfaceArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "interface" element
     */
    public void setInterfaceArray(int i, org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface xinterface) {
        generatedSetterHelperImpl(xinterface, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "interface" element
     */
    public org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface insertNewInterface(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "interface" element
     */
    public org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface addNewInterface() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "interface" element
     */
    public void removeInterface(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "prePostSet" element
     */
    public org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet getPrePostSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "prePostSet" element
     */
    public boolean isSetPrePostSet() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "prePostSet" element
     */
    public void setPrePostSet(org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet prePostSet) {
        generatedSetterHelperImpl(prePostSet, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "prePostSet" element
     */
    public org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet addNewPrePostSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "prePostSet" element
     */
    public void unsetPrePostSet() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "for" attribute
     */
    public java.lang.Object getFor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "for" attribute
     */
    public org.apache.xmlbeans.impl.xb.xmlconfig.JavaNameList xgetFor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlconfig.JavaNameList target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlconfig.JavaNameList)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "for" attribute
     */
    public boolean isSetFor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "for" attribute
     */
    public void setFor(java.lang.Object xfor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setObjectValue(xfor);
        }
    }

    /**
     * Sets (as xml) the "for" attribute
     */
    public void xsetFor(org.apache.xmlbeans.impl.xb.xmlconfig.JavaNameList xfor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlconfig.JavaNameList target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlconfig.JavaNameList)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.JavaNameList)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(xfor);
        }
    }

    /**
     * Unsets the "for" attribute
     */
    public void unsetFor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
    /**
     * An XML interface(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
     *
     * This is a complex type.
     */
    public static class InterfaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface {
        private static final long serialVersionUID = 1L;

        public InterfaceImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "staticHandler"),
            new QName("", "name"),
        };


        /**
         * Gets the "staticHandler" element
         */
        public java.lang.String getStaticHandler() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "staticHandler" element
         */
        public org.apache.xmlbeans.XmlString xgetStaticHandler() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                return target;
            }
        }

        /**
         * Sets the "staticHandler" element
         */
        public void setStaticHandler(java.lang.String staticHandler) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
                }
                target.setStringValue(staticHandler);
            }
        }

        /**
         * Sets (as xml) the "staticHandler" element
         */
        public void xsetStaticHandler(org.apache.xmlbeans.XmlString staticHandler) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
                }
                target.set(staticHandler);
            }
        }

        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                return target;
            }
        }

        /**
         * True if has "name" attribute
         */
        public boolean isSetName() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
            }
        }

        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.setStringValue(name);
            }
        }

        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.set(name);
            }
        }

        /**
         * Unsets the "name" attribute
         */
        public void unsetName() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[1]);
            }
        }
    }
    /**
     * An XML prePostSet(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
     *
     * This is a complex type.
     */
    public static class PrePostSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet {
        private static final long serialVersionUID = 1L;

        public PrePostSetImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "staticHandler"),
        };


        /**
         * Gets the "staticHandler" element
         */
        public java.lang.String getStaticHandler() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "staticHandler" element
         */
        public org.apache.xmlbeans.XmlString xgetStaticHandler() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                return target;
            }
        }

        /**
         * Sets the "staticHandler" element
         */
        public void setStaticHandler(java.lang.String staticHandler) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
                }
                target.setStringValue(staticHandler);
            }
        }

        /**
         * Sets (as xml) the "staticHandler" element
         */
        public void xsetStaticHandler(org.apache.xmlbeans.XmlString staticHandler) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
                }
                target.set(staticHandler);
            }
        }
    }
}
