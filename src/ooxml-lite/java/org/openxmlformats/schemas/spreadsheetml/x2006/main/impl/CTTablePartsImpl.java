/*
 * XML Type:  CT_TableParts
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts
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
 * An XML CT_TableParts(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTablePartsImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts {
    private static final long serialVersionUID = 1L;

    public CTTablePartsImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tablePart"),
        new QName("", "count"),
    };

    /**
     * Gets ith "tablePart" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart getTablePartArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "tablePart" element
     */
    @Override
    public int sizeOfTablePartArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Removes the ith "tablePart" element
     */
    @Override
    public void removeTablePart(int i) {
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
