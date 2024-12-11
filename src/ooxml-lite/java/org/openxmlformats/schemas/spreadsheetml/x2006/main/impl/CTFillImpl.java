/*
 * XML Type:  CT_Fill
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * An XML CT_Fill(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFillImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill {
    private static final long serialVersionUID = 1L;

    public CTFillImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "patternFill"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "gradientFill"),
    };


    /**
     * Gets the "patternFill" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill getPatternFill() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "patternFill" element
     */
    @Override
    public boolean isSetPatternFill() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "patternFill" element
     */
    @Override
    public void setPatternFill(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill patternFill) {
        generatedSetterHelperImpl(patternFill, PROPERTY_QNAME[0], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "patternFill" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill addNewPatternFill() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }


}
