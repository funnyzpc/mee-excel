/*
 * XML Type:  CT_Color
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_Color(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor {
    private static final long serialVersionUID = 1L;

    public CTColorImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "auto"),
        new QName("", "indexed"),
        new QName("", "rgb"),
        new QName("", "theme"),
        new QName("", "tint"),
    };


    /**
     * Gets the "auto" attribute
     */
    @Override
    public boolean getAuto() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Sets the "auto" attribute
     */
    @Override
    public void setAuto(boolean auto) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setBooleanValue(auto);
        }
    }

    /**
     * Gets the "indexed" attribute
     */
    @Override
    public long getIndexed() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }



    /**
     * True if has "indexed" attribute
     */
    @Override
    public boolean isSetIndexed() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "indexed" attribute
     */
    @Override
    public void setIndexed(long indexed) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setLongValue(indexed);
        }
    }

    /**
     * Gets the "rgb" attribute
     */
    @Override
    public byte[] getRgb() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getByteArrayValue();
        }
    }


    /**
     * True if has "rgb" attribute
     */
    @Override
    public boolean isSetRgb() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "rgb" attribute
     */
    @Override
    public void setRgb(byte[] rgb) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setByteArrayValue(rgb);
        }
    }

    /**
     * Gets the "theme" attribute
     */
    @Override
    public long getTheme() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * True if has "theme" attribute
     */
    @Override
    public boolean isSetTheme() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "theme" attribute
     */
    @Override
    public void setTheme(long theme) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setLongValue(theme);
        }
    }


    /**
     * Gets the "tint" attribute
     */
    @Override
    public double getTint() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[4]);
            }
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }


    /**
     * True if has "tint" attribute
     */
    @Override
    public boolean isSetTint() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "tint" attribute
     */
    @Override
    public void setTint(double tint) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setDoubleValue(tint);
        }
    }

    /**
     * Unsets the "indexed" attribute
     */
    @Override
    public void unsetIndexed() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
    /**
     * True if has "auto" attribute
     */
    @Override
    public boolean isSetAuto() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }


}
