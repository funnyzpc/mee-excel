/*
 * XML Type:  CT_ExternalCell
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_ExternalCell(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTExternalCellImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell {
    private static final long serialVersionUID = 1L;

    public CTExternalCellImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "v"),
        new QName("", "r"),
        new QName("", "t"),
        new QName("", "vm"),
    };


    /**
     * Gets the "v" element
     */
    @Override
    public String getV() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "v" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetV() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "v" element
     */
    @Override
    public boolean isSetV() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "v" element
     */
    @Override
    public void setV(String v) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(v);
        }
    }

    /**
     * Sets (as xml) the "v" element
     */
    @Override
    public void xsetV(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring v) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(v);
        }
    }

    /**
     * Unsets the "v" element
     */
    @Override
    public void unsetV() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "r" attribute
     */
    @Override
    public String getR() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * True if has "r" attribute
     */
    @Override
    public boolean isSetR() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "r" attribute
     */
    @Override
    public void setR(String r) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(r);
        }
    }


    /**
     * Gets the "t" attribute
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.Enum getT() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[2]);
            }
            return (target == null) ? null : (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "t" attribute
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType xgetT() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_default_attribute_value(PROPERTY_QNAME[2]);
            }
            return target;
        }
    }

    /**
     * True if has "t" attribute
     */
    @Override
    public boolean isSetT() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "t" attribute
     */
    @Override
    public void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.Enum t) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setEnumValue(t);
        }
    }

    /**
     * Sets (as xml) the "t" attribute
     */
    @Override
    public void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType t) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(t);
        }
    }

    /**
     * Unsets the "t" attribute
     */
    @Override
    public void unsetT() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }


}
