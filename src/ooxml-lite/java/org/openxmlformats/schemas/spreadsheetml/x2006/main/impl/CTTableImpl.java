/*
 * XML Type:  CT_Table
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;

/**
 * An XML CT_Table(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable {
    private static final long serialVersionUID = 1L;

    public CTTableImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "autoFilter"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortState"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableColumns"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableStyleInfo"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
        new QName("", "id"),
        new QName("", "name"),
        new QName("", "displayName"),
        new QName("", "comment"),
        new QName("", "ref"),
        new QName("", "tableType"),
        new QName("", "headerRowCount"),
        new QName("", "insertRow"),
        new QName("", "insertRowShift"),
        new QName("", "totalsRowCount"),
        new QName("", "totalsRowShown"),
        new QName("", "published"),
        new QName("", "headerRowDxfId"),
        new QName("", "dataDxfId"),
        new QName("", "totalsRowDxfId"),
        new QName("", "headerRowBorderDxfId"),
        new QName("", "tableBorderDxfId"),
        new QName("", "totalsRowBorderDxfId"),
        new QName("", "headerRowCellStyle"),
        new QName("", "dataCellStyle"),
        new QName("", "totalsRowCellStyle"),
        new QName("", "connectionId"),
    };

    /**
     * Gets the "autoFilter" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter getAutoFilter() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "autoFilter" element
     */
    @Override
    public boolean isSetAutoFilter() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }



    /**
     * Gets the "tableColumns" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns getTableColumns() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Gets the "tableStyleInfo" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo getTableStyleInfo() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "tableStyleInfo" element
     */
    @Override
    public boolean isSetTableStyleInfo() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }



    /**
     * Appends and returns a new empty "tableStyleInfo" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo addNewTableStyleInfo() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }


    /**
     * Gets the "id" attribute
     */
    @Override
    public long getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }



    /**
     * Gets the "name" attribute
     */
    @Override
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : target.getStringValue();
        }
    }



    /**
     * Sets the "name" attribute
     */
    @Override
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setStringValue(name);
        }
    }


    /**
     * Unsets the "name" attribute
     */
    @Override
    public void unsetName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "displayName" attribute
     */
    @Override
    public java.lang.String getDisplayName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Sets the "displayName" attribute
     */
    @Override
    public void setDisplayName(java.lang.String displayName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setStringValue(displayName);
        }
    }


    /**
     * Gets the "ref" attribute
     */
    @Override
    public java.lang.String getRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Sets the "ref" attribute
     */
    @Override
    public void setRef(java.lang.String ref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setStringValue(ref);
        }
    }

    /**
     * Gets the "headerRowCount" attribute
     */
    @Override
    public long getHeaderRowCount() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[11]);
            }
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets the "totalsRowCount" attribute
     */
    @Override
    public long getTotalsRowCount() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[14]);
            }
            return (target == null) ? 0L : target.getLongValue();
        }
    }


    /**
     * Gets the "totalsRowShown" attribute
     */
    @Override
    public boolean getTotalsRowShown() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[15]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }
    /**
     * Appends and returns a new empty "tableColumns" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns addNewTableColumns() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }




}
