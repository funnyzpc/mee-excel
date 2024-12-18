/*
 * XML Type:  CT_CalcChain
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.JavaListXmlObject;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * An XML CT_CalcChain(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCalcChainImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain {
    private static final long serialVersionUID = 1L;

    public CTCalcChainImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "c"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
    };


    /**
     * Gets a List of "c" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell> getCList() {
        synchronized (monitor()) {
            check_orphaned();
            return new JavaListXmlObject<>(
                this::getCArray,
                this::setCArray,
                this::insertNewC,
                this::removeC,
                this::sizeOfCArray
            );
        }
    }

    /**
     * Gets array of all "c" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell[] getCArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell[0]);
    }

    /**
     * Gets ith "c" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell getCArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "c" element
     */
    @Override
    public int sizeOfCArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "c" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell[] cArray) {
        check_orphaned();
        arraySetterHelper(cArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "c" element
     */
    @Override
    public void setCArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell c) {
        generatedSetterHelperImpl(c, PROPERTY_QNAME[0], i, XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "c" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell insertNewC(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "c" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell addNewC() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "c" element
     */
    @Override
    public void removeC(int i) {
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
}
