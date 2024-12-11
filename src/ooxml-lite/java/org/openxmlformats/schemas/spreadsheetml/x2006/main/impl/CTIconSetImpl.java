/*
 * XML Type:  CT_IconSet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet
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
 * An XML CT_IconSet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTIconSetImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet {
    private static final long serialVersionUID = 1L;

    public CTIconSetImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cfvo"),
        new QName("", "iconSet"),
        new QName("", "showValue"),
        new QName("", "percent"),
        new QName("", "reverse"),
    };



    /**
     * Gets array of all "cfvo" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[] getCfvoArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[0]);
    }

    /**
     * Sets array of all "cfvo" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCfvoArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[] cfvoArray) {
        check_orphaned();
        arraySetterHelper(cfvoArray, PROPERTY_QNAME[0]);
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "cfvo" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo addNewCfvo() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "iconSet" attribute
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum getIconSet() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return (target == null) ? null : (org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum)target.getEnumValue();
        }
    }

    /**
     * Sets the "iconSet" attribute
     */
    @Override
    public void setIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum iconSet) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(iconSet);
        }
    }

    /**
     * Gets the "showValue" attribute
     */
    @Override
    public boolean getShowValue() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[2]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "showValue" attribute
     */
    @Override
    public XmlBoolean xgetShowValue() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[2]);
            }
            return target;
        }
    }

    /**
     * True if has "showValue" attribute
     */
    @Override
    public boolean isSetShowValue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "showValue" attribute
     */
    @Override
    public void setShowValue(boolean showValue) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(showValue);
        }
    }

    /**
     * Gets the "percent" attribute
     */
    @Override
    public boolean getPercent() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "percent" attribute
     */
    @Override
    public XmlBoolean xgetPercent() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return target;
        }
    }

    /**
     * True if has "percent" attribute
     */
    @Override
    public boolean isSetPercent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "percent" attribute
     */
    @Override
    public void setPercent(boolean percent) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setBooleanValue(percent);
        }
    }



    /**
     * Gets the "reverse" attribute
     */
    @Override
    public boolean getReverse() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[4]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * True if has "reverse" attribute
     */
    @Override
    public boolean isSetReverse() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "reverse" attribute
     */
    @Override
    public void setReverse(boolean reverse) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setBooleanValue(reverse);
        }
    }

}
