/*
 * XML Type:  CT_CellProtection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_CellProtection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCellProtectionImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection {
    private static final long serialVersionUID = 1L;

    public CTCellProtectionImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "locked"),
        new QName("", "hidden"),
    };


    /**
     * Gets the "locked" attribute
     */
    @Override
    public boolean getLocked() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "locked" attribute
     */
    @Override
    public XmlBoolean xgetLocked() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "locked" attribute
     */
    @Override
    public boolean isSetLocked() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "locked" attribute
     */
    @Override
    public void setLocked(boolean locked) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setBooleanValue(locked);
        }
    }

    /**
     * Sets (as xml) the "locked" attribute
     */
    @Override
    public void xsetLocked(XmlBoolean locked) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(locked);
        }
    }

    /**
     * Unsets the "locked" attribute
     */
    @Override
    public void unsetLocked() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "hidden" attribute
     */
    @Override
    public boolean getHidden() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "hidden" attribute
     */
    @Override
    public XmlBoolean xgetHidden() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "hidden" attribute
     */
    @Override
    public boolean isSetHidden() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "hidden" attribute
     */
    @Override
    public void setHidden(boolean hidden) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setBooleanValue(hidden);
        }
    }

    /**
     * Sets (as xml) the "hidden" attribute
     */
    @Override
    public void xsetHidden(XmlBoolean hidden) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(hidden);
        }
    }

    /**
     * Unsets the "hidden" attribute
     */
    @Override
    public void unsetHidden() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}
