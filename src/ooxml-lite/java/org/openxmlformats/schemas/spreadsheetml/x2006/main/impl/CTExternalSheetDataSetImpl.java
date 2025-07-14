/*
 * XML Type:  CT_ExternalSheetDataSet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet
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
 * An XML CT_ExternalSheetDataSet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
@Deprecated
public class CTExternalSheetDataSetImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet {
    private static final long serialVersionUID = 1L;

    public CTExternalSheetDataSetImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetData"),
    };


//    /**
//     * Gets a List of "sheetData" elements
//     */
//    @Override
//    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData> getSheetDataList() {
//        synchronized (monitor()) {
//            check_orphaned();
//            return new JavaListXmlObject<>(
//                this::getSheetDataArray,
//                this::setSheetDataArray,
//                this::insertNewSheetData,
//                this::removeSheetData,
//                this::sizeOfSheetDataArray
//            );
//        }
//    }

    /**
     * Gets array of all "sheetData" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData[] getSheetDataArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData[0]);
    }

    /**
     * Gets ith "sheetData" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData getSheetDataArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "sheetData" element
     */
    @Override
    public int sizeOfSheetDataArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "sheetData" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSheetDataArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData[] sheetDataArray) {
        check_orphaned();
        arraySetterHelper(sheetDataArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "sheetData" element
     */
    @Override
    public void setSheetDataArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData sheetData) {
        generatedSetterHelperImpl(sheetData, PROPERTY_QNAME[0], i, XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheetData" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData insertNewSheetData(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "sheetData" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData addNewSheetData() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "sheetData" element
     */
    @Override
    public void removeSheetData(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
