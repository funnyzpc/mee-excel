/*
 * XML Type:  CT_BookView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView
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
 * An XML CT_BookView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTBookViewImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView {
    private static final long serialVersionUID = 1L;

    public CTBookViewImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
        new QName("", "visibility"),
        new QName("", "minimized"),
        new QName("", "showHorizontalScroll"),
        new QName("", "showVerticalScroll"),
        new QName("", "showSheetTabs"),
        new QName("", "xWindow"),
        new QName("", "yWindow"),
        new QName("", "windowWidth"),
        new QName("", "windowHeight"),
        new QName("", "tabRatio"),
        new QName("", "firstSheet"),
        new QName("", "activeTab"),
        new QName("", "autoFilterDateGrouping"),
    };



    /**
     * Gets the "firstSheet" attribute
     */
    @Override
    public long getFirstSheet() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[11]);
            }
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "firstSheet" attribute
     */
    @Override
    public XmlUnsignedInt xgetFirstSheet() {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (XmlUnsignedInt)get_default_attribute_value(PROPERTY_QNAME[11]);
            }
            return target;
        }
    }

    /**
     * True if has "firstSheet" attribute
     */
    @Override
    public boolean isSetFirstSheet() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "firstSheet" attribute
     */
    @Override
    public void setFirstSheet(long firstSheet) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setLongValue(firstSheet);
        }
    }

    /**
     * Gets the "activeTab" attribute
     */
    @Override
    public long getActiveTab() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[12]);
            }
            return (target == null) ? 0L : target.getLongValue();
        }
    }
    /**
     * Sets the "activeTab" attribute
     */
    @Override
    public void setActiveTab(long activeTab) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setLongValue(activeTab);
        }
    }


}
