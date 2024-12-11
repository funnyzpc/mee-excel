/*
 * XML Type:  CT_Worksheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * An XML CT_Worksheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTWorksheetImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet {
    private static final long serialVersionUID = 1L;

    public CTWorksheetImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetPr"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dimension"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetViews"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetFormatPr"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cols"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetData"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetCalcPr"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetProtection"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "protectedRanges"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "scenarios"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "autoFilter"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortState"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataConsolidate"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customSheetViews"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mergeCells"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "phoneticPr"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "conditionalFormatting"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataValidations"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "hyperlinks"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "printOptions"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageMargins"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageSetup"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "headerFooter"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rowBreaks"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colBreaks"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customProperties"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellWatches"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ignoredErrors"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "smartTags"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "drawing"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawing"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawingHF"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "drawingHF"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "picture"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleObjects"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "controls"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishItems"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableParts"),
            new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
    };

    /**
     * Gets the "sheetPr" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr getSheetPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "sheetPr" element
     */
    @Override
    public void setSheetPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr sheetPr) {
        generatedSetterHelperImpl(sheetPr, PROPERTY_QNAME[0], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "sheetPr" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr addNewSheetPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "dimension" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension getDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "dimension" element
     */
    @Override
    public boolean isSetDimension() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Appends and returns a new empty "dimension" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension addNewDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Gets the "sheetViews" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews getSheetViews() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "sheetViews" element
     */
    @Override
    public boolean isSetSheetViews() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Appends and returns a new empty "sheetViews" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews addNewSheetViews() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Gets the "sheetFormatPr" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr getSheetFormatPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "sheetFormatPr" element
     */
    @Override
    public boolean isSetSheetFormatPr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }



    /**
     * Appends and returns a new empty "sheetFormatPr" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr addNewSheetFormatPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }
    /**
     * Gets array of all "cols" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols[] getColsArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols[0]);
    }
    /**
     * Gets ith "cols" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols getColsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "cols" element
     */
    @Override
    public int sizeOfColsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "cols" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setColsArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols[] colsArray) {
        check_orphaned();
        arraySetterHelper(colsArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "cols" element
     */
    @Override
    public void setColsArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols cols) {
        generatedSetterHelperImpl(cols, PROPERTY_QNAME[4], i, XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "cols" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols addNewCols() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Gets the "sheetData" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData getSheetData() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Appends and returns a new empty "sheetData" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData addNewSheetData() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Gets the "sheetCalcPr" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr getSheetCalcPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "sheetCalcPr" element
     */
    @Override
    public boolean isSetSheetCalcPr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Appends and returns a new empty "sheetCalcPr" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr addNewSheetCalcPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }


    /**
     * Gets the "sheetProtection" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection getSheetProtection() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "sheetProtection" element
     */
    @Override
    public boolean isSetSheetProtection() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }


    /**
     * Appends and returns a new empty "sheetProtection" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection addNewSheetProtection() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }
    /**
     * Appends and returns a new empty value (as xml) as the last "conditionalFormatting" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting addNewConditionalFormatting() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting)get_store().add_element_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * Gets array of all "conditionalFormatting" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting[] getConditionalFormattingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[16], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting[0]);
    }
    /**
     * Returns number of "conditionalFormatting" element
     */
    @Override
    public int sizeOfConditionalFormattingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[16]);
        }
    }
    /**
     * Gets ith "conditionalFormatting" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting getConditionalFormattingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    /**
     * Removes the ith "conditionalFormatting" element
     */
    @Override
    public void removeConditionalFormatting(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[16], i);
        }
    }
    /**
     * Removes the ith "cols" element
     */
    @Override
    public void removeCols(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }
    /**
     * Unsets the "sheetProtection" element
     */
    @Override
    public void unsetSheetProtection() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }



    /**
     * Gets the "mergeCells" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells getMergeCells() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells)get_store().find_element_user(PROPERTY_QNAME[14], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "mergeCells" element
     */
    @Override
    public boolean isSetMergeCells() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]) != 0;
        }
    }



    /**
     * Appends and returns a new empty "mergeCells" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells addNewMergeCells() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells)get_store().add_element_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * Unsets the "mergeCells" element
     */
    @Override
    public void unsetMergeCells() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[14], 0);
        }
    }

    /**
     * Gets the "hyperlinks" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks getHyperlinks() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks)get_store().find_element_user(PROPERTY_QNAME[18], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "hyperlinks" element
     */
    @Override
    public boolean isSetHyperlinks() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[18]) != 0;
        }
    }


    /**
     * Appends and returns a new empty "hyperlinks" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks addNewHyperlinks() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks)get_store().add_element_user(PROPERTY_QNAME[18]);
            return target;
        }
    }

    /**
     * Unsets the "hyperlinks" element
     */
    @Override
    public void unsetHyperlinks() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[18], 0);
        }
    }

    /**
     * Gets the "printOptions" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions getPrintOptions() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().find_element_user(PROPERTY_QNAME[19], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "printOptions" element
     */
    @Override
    public boolean isSetPrintOptions() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[19]) != 0;
        }
    }

    /**
     * Appends and returns a new empty "printOptions" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions addNewPrintOptions() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().add_element_user(PROPERTY_QNAME[19]);
            return target;
        }
    }


    /**
     * Gets the "pageMargins" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins getPageMargins() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().find_element_user(PROPERTY_QNAME[20], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "pageMargins" element
     */
    @Override
    public boolean isSetPageMargins() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[20]) != 0;
        }
    }


    /**
     * Appends and returns a new empty "pageMargins" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins addNewPageMargins() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().add_element_user(PROPERTY_QNAME[20]);
            return target;
        }
    }

    /**
     * Gets the "tableParts" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts getTableParts() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts)get_store().find_element_user(PROPERTY_QNAME[37], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Gets the "headerFooter" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter getHeaderFooter() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(PROPERTY_QNAME[22], 0);
            return (target == null) ? null : target;
        }
    }
    /**
     * Sets the "headerFooter" element
     */
    @Override
    public void setHeaderFooter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter headerFooter) {
        generatedSetterHelperImpl(headerFooter, PROPERTY_QNAME[22], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }







}
