/*
 * XML Type:  CT_NumFmts
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts
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
 * An XML CT_NumFmts(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTNumFmtsImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts {
    private static final long serialVersionUID = 1L;

    public CTNumFmtsImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "numFmt"),
        new QName("", "count"),
    };


    /**
     * Gets a List of "numFmt" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt> getNumFmtList() {
        synchronized (monitor()) {
            check_orphaned();
            return new JavaListXmlObject<>(
                this::getNumFmtArray,
                this::setNumFmtArray,
                this::insertNewNumFmt,
                this::removeNumFmt,
                this::sizeOfNumFmtArray
            );
        }
    }

    /**
     * Gets array of all "numFmt" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt[] getNumFmtArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt[0]);
    }

    /**
     * Gets ith "numFmt" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt getNumFmtArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "numFmt" element
     */
    @Override
    public int sizeOfNumFmtArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "numFmt" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNumFmtArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt[] numFmtArray) {
        check_orphaned();
        arraySetterHelper(numFmtArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "numFmt" element
     */
    @Override
    public void setNumFmtArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt numFmt) {
        generatedSetterHelperImpl(numFmt, PROPERTY_QNAME[0], i, XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "numFmt" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt insertNewNumFmt(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "numFmt" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt addNewNumFmt() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "numFmt" element
     */
    @Override
    public void removeNumFmt(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
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
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
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
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
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
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
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
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
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
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[1]);
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
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}
