/*
 * XML Type:  CT_SheetView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;

/**
 * An XML CT_SheetView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetViewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetView {
    private static final long serialVersionUID = 1L;

    public CTSheetViewImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pane"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "selection"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotSelection"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
        new QName("", "windowProtection"),
        new QName("", "showFormulas"),
        new QName("", "showGridLines"),
        new QName("", "showRowColHeaders"),
        new QName("", "showZeros"),
        new QName("", "rightToLeft"),
        new QName("", "tabSelected"),
        new QName("", "showRuler"),
        new QName("", "showOutlineSymbols"),
        new QName("", "defaultGridColor"),
        new QName("", "showWhiteSpace"),
        new QName("", "view"),
        new QName("", "topLeftCell"),
        new QName("", "colorId"),
        new QName("", "zoomScale"),
        new QName("", "zoomScaleNormal"),
        new QName("", "zoomScaleSheetLayoutView"),
        new QName("", "zoomScalePageLayoutView"),
        new QName("", "workbookViewId"),
    };



    /**
     * Gets ith "selection" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection getSelectionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "selection" element
     */
    @Override
    public int sizeOfSelectionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }


    /**
     * Sets ith "selection" element
     */
    @Override
    public void setSelectionArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection selection) {
        generatedSetterHelperImpl(selection, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "selection" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection insertNewSelection(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "selection" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection addNewSelection() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "selection" element
     */
    @Override
    public void removeSelection(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "showFormulas" attribute
     */
    @Override
    public boolean getShowFormulas() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[5]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }


    /**
     * Sets the "showFormulas" attribute
     */
    @Override
    public void setShowFormulas(boolean showFormulas) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setBooleanValue(showFormulas);
        }
    }

    /**
     * Gets the "showRowColHeaders" attribute
     */
    @Override
    public boolean getShowRowColHeaders() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[7]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets the "showZeros" attribute
     */
    @Override
    public boolean getShowZeros() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[8]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }


    /**
     * Sets the "showZeros" attribute
     */
    @Override
    public void setShowZeros(boolean showZeros) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setBooleanValue(showZeros);
        }
    }


    /**
     * Gets the "rightToLeft" attribute
     */
    @Override
    public boolean getRightToLeft() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[9]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Sets the "rightToLeft" attribute
     */
    @Override
    public void setRightToLeft(boolean rightToLeft) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setBooleanValue(rightToLeft);
        }
    }

    /**
     * Gets the "tabSelected" attribute
     */
    @Override
    public boolean getTabSelected() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[10]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Sets the "tabSelected" attribute
     */
    @Override
    public void setTabSelected(boolean tabSelected) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setBooleanValue(tabSelected);
        }
    }

    /**
     * Gets the "topLeftCell" attribute
     */
    @Override
    public String getTopLeftCell() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Sets the "zoomScale" attribute
     */
    @Override
    public void setZoomScale(long zoomScale) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[18]);
            }
            target.setLongValue(zoomScale);
        }
    }

    /**
     * Sets the "workbookViewId" attribute
     */
    @Override
    public void setWorkbookViewId(long workbookViewId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[22]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[22]);
            }
            target.setLongValue(workbookViewId);
        }
    }


}
