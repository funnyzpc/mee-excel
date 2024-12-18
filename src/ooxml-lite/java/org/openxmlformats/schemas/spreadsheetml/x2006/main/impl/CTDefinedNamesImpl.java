/*
 * XML Type:  CT_DefinedNames
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames
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
 * An XML CT_DefinedNames(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDefinedNamesImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames {
    private static final long serialVersionUID = 1L;

    public CTDefinedNamesImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "definedName"),
    };


    /**
     * Gets a List of "definedName" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName> getDefinedNameList() {
        synchronized (monitor()) {
            check_orphaned();
            return new JavaListXmlObject<>(
                this::getDefinedNameArray,
                this::setDefinedNameArray,
                this::insertNewDefinedName,
                this::removeDefinedName,
                this::sizeOfDefinedNameArray
            );
        }
    }

    /**
     * Gets array of all "definedName" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName[] getDefinedNameArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName[0]);
    }

    /**
     * Gets ith "definedName" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName getDefinedNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "definedName" element
     */
    @Override
    public int sizeOfDefinedNameArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "definedName" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDefinedNameArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName[] definedNameArray) {
        check_orphaned();
        arraySetterHelper(definedNameArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "definedName" element
     */
    @Override
    public void setDefinedNameArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName definedName) {
        generatedSetterHelperImpl(definedName, PROPERTY_QNAME[0], i, XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "definedName" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName insertNewDefinedName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "definedName" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName addNewDefinedName() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "definedName" element
     */
    @Override
    public void removeDefinedName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
