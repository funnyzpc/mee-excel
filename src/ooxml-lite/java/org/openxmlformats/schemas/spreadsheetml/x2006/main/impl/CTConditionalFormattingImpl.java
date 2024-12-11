/*
 * XML Type:  CT_ConditionalFormatting
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * An XML CT_ConditionalFormatting(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTConditionalFormattingImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting {
    private static final long serialVersionUID = 1L;

    public CTConditionalFormattingImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cfRule"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
        new QName("", "pivot"),
        new QName("", "sqref"),
    };


    /**
     * Gets ith "cfRule" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule getCfRuleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "cfRule" element
     */
    @Override
    public int sizeOfCfRuleArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "cfRule" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCfRuleArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule[] cfRuleArray) {
        check_orphaned();
        arraySetterHelper(cfRuleArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "cfRule" element
     */
    @Override
    public void setCfRuleArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule cfRule) {
        generatedSetterHelperImpl(cfRule, PROPERTY_QNAME[0], i, XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }


    /**
     * Appends and returns a new empty value (as xml) as the last "cfRule" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule addNewCfRule() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }


    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
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
     * Gets the "pivot" attribute
     */
    @Override
    public boolean getPivot() {
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
     * Sets the "pivot" attribute
     */
    @Override
    public void setPivot(boolean pivot) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(pivot);
        }
    }

    /**
     * Gets the "sqref" attribute
     */
    @Override
    public java.util.List getSqref() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getListValue();
        }
    }


    /**
     * Sets the "sqref" attribute
     */
    @Override
    public void setSqref(java.util.List sqref) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setListValue(sqref);
        }
    }

}
