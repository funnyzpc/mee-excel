/*
 * XML Type:  CT_Rst
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_Rst(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRstImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst {
    private static final long serialVersionUID = 1L;

    public CTRstImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "t"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "r"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rPh"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "phoneticPr"),
    };


    /**
     * Gets the "t" element
     */
    @Override
    public String getT() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "t" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetT() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "t" element
     */
    @Override
    public boolean isSetT() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "t" element
     */
    @Override
    public void setT(String t) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(t);
        }
    }

    /**
     * Sets (as xml) the "t" element
     */
    @Override
    public void xsetT(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring t) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(t);
        }
    }

    /**
     * Unsets the "t" element
     */
    @Override
    public void unsetT() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets array of all "r" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt[] getRArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt[0]);
    }

    /**
     * Gets ith "r" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt getRArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "r" element
     */
    @Override
    public int sizeOfRArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "r" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt[] rArray) {
        check_orphaned();
        arraySetterHelper(rArray, PROPERTY_QNAME[1]);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "r" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt insertNewR(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "r" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt addNewR() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "r" element
     */
    @Override
    public void removeR(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Returns number of "rPh" element
     */
    @Override
    public int sizeOfRPhArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }


    /**
     * Removes the ith "rPh" element
     */
    @Override
    public void removeRPh(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * True if has "phoneticPr" element
     */
    @Override
    public boolean isSetPhoneticPr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Unsets the "phoneticPr" element
     */
    @Override
    public void unsetPhoneticPr() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }
}
