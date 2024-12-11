/*
 * XML Type:  CT_Sst
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.values.JavaListXmlObject;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * An XML CT_Sst(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSstImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst {
    private static final long serialVersionUID = 1L;

    public CTSstImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "si"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
        new QName("", "count"),
        new QName("", "uniqueCount"),
    };


    /**
     * Gets a List of "si" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst> getSiList() {
        synchronized (monitor()) {
            check_orphaned();
            return new JavaListXmlObject<>(
                this::getSiArray,
                this::setSiArray,
                this::insertNewSi,
                this::removeSi,
                this::sizeOfSiArray
            );
        }
    }

    /**
     * Gets array of all "si" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst[] getSiArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst[0]);
    }

    /**
     * Gets ith "si" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst getSiArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "si" element
     */
    @Override
    public int sizeOfSiArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "si" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSiArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst[] siArray) {
        check_orphaned();
        arraySetterHelper(siArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "si" element
     */
    @Override
    public void setSiArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst si) {
        generatedSetterHelperImpl(si, PROPERTY_QNAME[0], i, XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "si" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst insertNewSi(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "si" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst addNewSi() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "si" element
     */
    @Override
    public void removeSi(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "count" attribute
     */
    @Override
    public long getCount() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "count" attribute
     */
    @Override
    public XmlUnsignedInt xgetCount() {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "count" attribute
     */
    @Override
    public boolean isSetCount() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "count" attribute
     */
    @Override
    public void setCount(long count) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setLongValue(count);
        }
    }

    /**
     * Sets (as xml) the "count" attribute
     */
    @Override
    public void xsetCount(XmlUnsignedInt count) {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(count);
        }
    }

    /**
     * Unsets the "count" attribute
     */
    @Override
    public void unsetCount() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "uniqueCount" attribute
     */
    @Override
    public long getUniqueCount() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "uniqueCount" attribute
     */
    @Override
    public XmlUnsignedInt xgetUniqueCount() {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "uniqueCount" attribute
     */
    @Override
    public boolean isSetUniqueCount() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "uniqueCount" attribute
     */
    @Override
    public void setUniqueCount(long uniqueCount) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setLongValue(uniqueCount);
        }
    }



}
