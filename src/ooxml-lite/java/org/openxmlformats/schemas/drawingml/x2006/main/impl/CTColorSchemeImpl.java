/*
 * XML Type:  CT_ColorScheme
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * An XML CT_ColorScheme(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorSchemeImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme {
    private static final long serialVersionUID = 1L;

    public CTColorSchemeImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "dk1"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lt1"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "dk2"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lt2"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "accent1"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "accent2"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "accent3"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "accent4"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "accent5"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "accent6"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hlink"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "folHlink"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst"),
        new QName("", "name"),
    };


    /**
     * Gets the "dk1" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getDk1() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "dk1" element
     */
    @Override
    public void setDk1(org.openxmlformats.schemas.drawingml.x2006.main.CTColor dk1) {
        generatedSetterHelperImpl(dk1, PROPERTY_QNAME[0], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "dk1" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewDk1() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "lt1" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getLt1() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "lt1" element
     */
    @Override
    public void setLt1(org.openxmlformats.schemas.drawingml.x2006.main.CTColor lt1) {
        generatedSetterHelperImpl(lt1, PROPERTY_QNAME[1], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "lt1" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewLt1() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Gets the "dk2" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getDk2() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]) != 0;
        }
    }


    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], 0);
        }
    }

    /**
     * Gets the "name" attribute
     */
    @Override
    public String getName() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "name" attribute
     */
    @Override
    public XmlString xgetName() {
        synchronized (monitor()) {
            check_orphaned();
            XmlString target = null;
            target = (XmlString)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Sets the "name" attribute
     */
    @Override
    public void setName(String name) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setStringValue(name);
        }
    }

    /**
     * Sets (as xml) the "name" attribute
     */
    @Override
    public void xsetName(XmlString name) {
        synchronized (monitor()) {
            check_orphaned();
            XmlString target = null;
            target = (XmlString)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (XmlString)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(name);
        }
    }
}
