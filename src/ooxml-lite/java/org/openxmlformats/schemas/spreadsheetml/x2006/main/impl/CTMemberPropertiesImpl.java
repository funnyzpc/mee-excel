/*
 * XML Type:  CT_MemberProperties
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_MemberProperties(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMemberPropertiesImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties {
    private static final long serialVersionUID = 1L;

    public CTMemberPropertiesImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mp"),
        new QName("", "count"),
    };


//    /**
//     * Gets a List of "mp" elements
//     */
//    @Override
//    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty> getMpList() {
//        synchronized (monitor()) {
//            check_orphaned();
//            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
//                this::getMpArray,
//                this::setMpArray,
//                this::insertNewMp,
//                this::removeMp,
//                this::sizeOfMpArray
//            );
//        }
//    }
//
//    /**
//     * Gets array of all "mp" elements
//     */
//    @Override
//    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty[] getMpArray() {
//        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty[0]);
//    }
//
//    /**
//     * Gets ith "mp" element
//     */
//    @Override
//    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty getMpArray(int i) {
//        synchronized (monitor()) {
//            check_orphaned();
//            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty target = null;
//            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty)get_store().find_element_user(PROPERTY_QNAME[0], i);
//            if (target == null) {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
//
//    /**
//     * Returns number of "mp" element
//     */
//    @Override
//    public int sizeOfMpArray() {
//        synchronized (monitor()) {
//            check_orphaned();
//            return get_store().count_elements(PROPERTY_QNAME[0]);
//        }
//    }
//
//    /**
//     * Sets array of all "mp" element  WARNING: This method is not atomicaly synchronized.
//     */
//    @Override
//    public void setMpArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty[] mpArray) {
//        check_orphaned();
//        arraySetterHelper(mpArray, PROPERTY_QNAME[0]);
//    }
//
//    /**
//     * Sets ith "mp" element
//     */
//    @Override
//    public void setMpArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty mp) {
//        generatedSetterHelperImpl(mp, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
//    }
//
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "mp" element
//     */
//    @Override
//    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty insertNewMp(int i) {
//        synchronized (monitor()) {
//            check_orphaned();
//            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty target = null;
//            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty)get_store().insert_element_user(PROPERTY_QNAME[0], i);
//            return target;
//        }
//    }
//
//    /**
//     * Appends and returns a new empty value (as xml) as the last "mp" element
//     */
//    @Override
//    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty addNewMp() {
//        synchronized (monitor()) {
//            check_orphaned();
//            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty target = null;
//            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty)get_store().add_element_user(PROPERTY_QNAME[0]);
//            return target;
//        }
//    }

    /**
     * Removes the ith "mp" element
     */
    @Override
    public void removeMp(int i) {
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
