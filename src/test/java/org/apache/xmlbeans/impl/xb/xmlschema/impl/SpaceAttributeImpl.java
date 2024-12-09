/*
 * An XML attribute type.
 * Localname: space
 * Namespace: http://www.w3.org/XML/1998/namespace
 * Java type: org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one space(@http://www.w3.org/XML/1998/namespace) attribute.
 *
 * This is a complex type.
 */
public class SpaceAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute {
    private static final long serialVersionUID = 1L;

    public SpaceAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/XML/1998/namespace", "space"),
    };


    /**
     * Gets the "space" attribute
     */
    public org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space.Enum getSpace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "space" attribute
     */
    public org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space xgetSpace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "space" attribute
     */
    public boolean isSetSpace() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "space" attribute
     */
    public void setSpace(org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space.Enum space) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(space);
        }
    }

    /**
     * Sets (as xml) the "space" attribute
     */
    public void xsetSpace(org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space space) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(space);
        }
    }

    /**
     * Unsets the "space" attribute
     */
    public void unsetSpace() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
    /**
     * An XML space(@http://www.w3.org/XML/1998/namespace).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute$Space.
     */
    public static class SpaceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space {
        private static final long serialVersionUID = 1L;

        public SpaceImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected SpaceImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
}
