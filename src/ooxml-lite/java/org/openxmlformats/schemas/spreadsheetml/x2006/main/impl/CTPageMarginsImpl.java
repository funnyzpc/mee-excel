/*
 * XML Type:  CT_PageMargins
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlDouble;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_PageMargins(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPageMarginsImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins {
    private static final long serialVersionUID = 1L;

    public CTPageMarginsImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "left"),
        new QName("", "right"),
        new QName("", "top"),
        new QName("", "bottom"),
        new QName("", "header"),
        new QName("", "footer"),
    };


    /**
     * Gets the "left" attribute
     */
    @Override
    public double getLeft() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "left" attribute
     */
    @Override
    public XmlDouble xgetLeft() {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "left" attribute
     */
    @Override
    public void setLeft(double left) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setDoubleValue(left);
        }
    }

    /**
     * Sets (as xml) the "left" attribute
     */
    @Override
    public void xsetLeft(XmlDouble left) {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(left);
        }
    }

    /**
     * Gets the "right" attribute
     */
    @Override
    public double getRight() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "right" attribute
     */
    @Override
    public XmlDouble xgetRight() {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "right" attribute
     */
    @Override
    public void setRight(double right) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setDoubleValue(right);
        }
    }

    /**
     * Sets (as xml) the "right" attribute
     */
    @Override
    public void xsetRight(XmlDouble right) {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(right);
        }
    }

    /**
     * Gets the "top" attribute
     */
    @Override
    public double getTop() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "top" attribute
     */
    @Override
    public XmlDouble xgetTop() {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Sets the "top" attribute
     */
    @Override
    public void setTop(double top) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setDoubleValue(top);
        }
    }

    /**
     * Sets (as xml) the "top" attribute
     */
    @Override
    public void xsetTop(XmlDouble top) {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(top);
        }
    }

    /**
     * Gets the "bottom" attribute
     */
    @Override
    public double getBottom() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "bottom" attribute
     */
    @Override
    public XmlDouble xgetBottom() {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Sets the "bottom" attribute
     */
    @Override
    public void setBottom(double bottom) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setDoubleValue(bottom);
        }
    }

    /**
     * Sets (as xml) the "bottom" attribute
     */
    @Override
    public void xsetBottom(XmlDouble bottom) {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(bottom);
        }
    }

    /**
     * Gets the "header" attribute
     */
    @Override
    public double getHeader() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "header" attribute
     */
    @Override
    public XmlDouble xgetHeader() {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Sets the "header" attribute
     */
    @Override
    public void setHeader(double header) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setDoubleValue(header);
        }
    }

    /**
     * Sets (as xml) the "header" attribute
     */
    @Override
    public void xsetHeader(XmlDouble header) {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(header);
        }
    }

    /**
     * Gets the "footer" attribute
     */
    @Override
    public double getFooter() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "footer" attribute
     */
    @Override
    public XmlDouble xgetFooter() {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Sets the "footer" attribute
     */
    @Override
    public void setFooter(double footer) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setDoubleValue(footer);
        }
    }

    /**
     * Sets (as xml) the "footer" attribute
     */
    @Override
    public void xsetFooter(XmlDouble footer) {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(footer);
        }
    }
}
