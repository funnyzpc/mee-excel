/*
 * XML Type:  CT_Stylesheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * An XML CT_Stylesheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTStylesheetImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet {
    private static final long serialVersionUID = 1L;

    public CTStylesheetImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "numFmts"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fonts"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fills"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "borders"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellStyleXfs"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellXfs"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellStyles"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dxfs"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableStyles"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colors"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
    };


    /**
     * Gets the "numFmts" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts getNumFmts() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "numFmts" element
     */
    @Override
    public boolean isSetNumFmts() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "numFmts" element
     */
    @Override
    public void setNumFmts(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts numFmts) {
        generatedSetterHelperImpl(numFmts, PROPERTY_QNAME[0], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "numFmts" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts addNewNumFmts() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "numFmts" element
     */
    @Override
    public void unsetNumFmts() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "fonts" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts getFonts() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "fonts" element
     */
    @Override
    public boolean isSetFonts() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "fonts" element
     */
    @Override
    public void setFonts(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts fonts) {
        generatedSetterHelperImpl(fonts, PROPERTY_QNAME[1], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "fonts" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts addNewFonts() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "fonts" element
     */
    @Override
    public void unsetFonts() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "fills" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills getFills() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "fills" element
     */
    @Override
    public boolean isSetFills() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "fills" element
     */
    @Override
    public void setFills(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills fills) {
        generatedSetterHelperImpl(fills, PROPERTY_QNAME[2], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Gets the "borders" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders getBorders() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "borders" element
     */
    @Override
    public boolean isSetBorders() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "borders" element
     */
    @Override
    public void setBorders(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders borders) {
        generatedSetterHelperImpl(borders, PROPERTY_QNAME[3], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }


    /**
     * Gets the "cellStyleXfs" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs getCellStyleXfs() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "cellStyleXfs" element
     */
    @Override
    public boolean isSetCellStyleXfs() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "cellStyleXfs" element
     */
    @Override
    public void setCellStyleXfs(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs cellStyleXfs) {
        generatedSetterHelperImpl(cellStyleXfs, PROPERTY_QNAME[4], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Gets the "cellXfs" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs getCellXfs() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "cellXfs" element
     */
    @Override
    public void setCellXfs(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs cellXfs) {
        generatedSetterHelperImpl(cellXfs, PROPERTY_QNAME[5], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    /**
     * Gets the "dxfs" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs getDxfs() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }
    /**
     * Sets the "dxfs" element
     */
    @Override
    public void setDxfs(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs dxfs) {
        generatedSetterHelperImpl(dxfs, PROPERTY_QNAME[7], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    /**
     * Gets the "colors" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors getColors() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors)get_store().find_element_user(PROPERTY_QNAME[9], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[10]) != 0;
        }
    }



    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], 0);
        }
    }
}
