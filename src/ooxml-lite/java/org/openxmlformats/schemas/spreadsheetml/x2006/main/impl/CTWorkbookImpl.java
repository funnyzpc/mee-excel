/*
 * XML Type:  CT_Workbook
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * An XML CT_Workbook(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTWorkbookImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook {
    private static final long serialVersionUID = 1L;

    public CTWorkbookImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fileVersion"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fileSharing"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "workbookPr"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "workbookProtection"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "bookViews"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheets"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "functionGroups"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "externalReferences"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "definedNames"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calcPr"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleSize"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customWorkbookViews"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotCaches"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "smartTagPr"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "smartTagTypes"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishing"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fileRecoveryPr"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishObjects"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
        new QName("", "conformance"),
    };


    /**
     * Gets the "fileVersion" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion getFileVersion() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "fileVersion" element
     */
    @Override
    public boolean isSetFileVersion() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "fileVersion" element
     */
    @Override
    public void setFileVersion(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion fileVersion) {
        generatedSetterHelperImpl(fileVersion, PROPERTY_QNAME[0], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "fileVersion" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion addNewFileVersion() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "fileVersion" element
     */
    @Override
    public void unsetFileVersion() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Unsets the "fileSharing" element
     */
    @Override
    public void unsetFileSharing() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "workbookPr" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr getWorkbookPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Appends and returns a new empty "workbookPr" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr addNewWorkbookPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Gets the "workbookProtection" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection getWorkbookProtection() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "workbookProtection" element
     */
    @Override
    public boolean isSetWorkbookProtection() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "workbookProtection" element
     */
    @Override
    public void setWorkbookProtection(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection workbookProtection) {
        generatedSetterHelperImpl(workbookProtection, PROPERTY_QNAME[3], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "workbookProtection" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection addNewWorkbookProtection() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "workbookProtection" element
     */
    @Override
    public void unsetWorkbookProtection() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "bookViews" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews getBookViews() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "bookViews" element
     */
    @Override
    public boolean isSetBookViews() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "bookViews" element
     */
    @Override
    public void setBookViews(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews bookViews) {
        generatedSetterHelperImpl(bookViews, PROPERTY_QNAME[4], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "bookViews" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews addNewBookViews() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "bookViews" element
     */
    @Override
    public void unsetBookViews() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "sheets" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets getSheets() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "sheets" element
     */
    @Override
    public void setSheets(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets sheets) {
        generatedSetterHelperImpl(sheets, PROPERTY_QNAME[5], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "sheets" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets addNewSheets() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "functionGroups" element
     */
    @Override
    public void unsetFunctionGroups() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "externalReferences" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences getExternalReferences() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "externalReferences" element
     */
    @Override
    public boolean isSetExternalReferences() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "externalReferences" element
     */
    @Override
    public void setExternalReferences(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences externalReferences) {
        generatedSetterHelperImpl(externalReferences, PROPERTY_QNAME[7], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "externalReferences" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences addNewExternalReferences() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "externalReferences" element
     */
    @Override
    public void unsetExternalReferences() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "definedNames" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames getDefinedNames() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "definedNames" element
     */
    @Override
    public boolean isSetDefinedNames() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "definedNames" element
     */
    @Override
    public void setDefinedNames(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames definedNames) {
        generatedSetterHelperImpl(definedNames, PROPERTY_QNAME[8], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "definedNames" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames addNewDefinedNames() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Unsets the "definedNames" element
     */
    @Override
    public void unsetDefinedNames() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "calcPr" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr getCalcPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "calcPr" element
     */
    @Override
    public boolean isSetCalcPr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "calcPr" element
     */
    @Override
    public void setCalcPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr calcPr) {
        generatedSetterHelperImpl(calcPr, PROPERTY_QNAME[9], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "calcPr" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr addNewCalcPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }




    /**
     * Unsets the "oleSize" element
     */
    @Override
    public void unsetOleSize() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], 0);
        }
    }

    /**
     * Unsets the "webPublishing" element
     */
    @Override
    public void unsetWebPublishing() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[15], 0);
        }
    }

    /**
     * Removes the ith "fileRecoveryPr" element
     */
    @Override
    public void removeFileRecoveryPr(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[16], i);
        }
    }



    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[18]) != 0;
        }
    }


    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[18], 0);
        }
    }


    /**
     * Unsets the "conformance" attribute
     */
    @Override
    public void unsetConformance() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[19]);
        }
    }
}
