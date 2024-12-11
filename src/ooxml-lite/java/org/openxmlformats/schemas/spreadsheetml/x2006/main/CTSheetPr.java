/*
 * XML Type:  CT_SheetPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_SheetPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheetPr extends XmlObject {
    DocumentFactory<CTSheetPr> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsheetpr3ae0type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "tabColor" element
     */
    CTColor getTabColor();

    /**
     * True if has "tabColor" element
     */
    boolean isSetTabColor();

    /**
     * Sets the "tabColor" element
     */
    void setTabColor(CTColor tabColor);

    /**
     * Appends and returns a new empty "tabColor" element
     */
    CTColor addNewTabColor();

    /**
     * Unsets the "tabColor" element
     */
    void unsetTabColor();

    /**
     * True if has "outlinePr" element
     */
    boolean isSetOutlinePr();

//    /**
//     * Sets the "outlinePr" element
//     */
//    void setOutlinePr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr outlinePr);

//    /**
//     * Appends and returns a new empty "outlinePr" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr addNewOutlinePr();

    /**
     * Unsets the "outlinePr" element
     */
    void unsetOutlinePr();

//    /**
//     * Gets the "pageSetUpPr" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr getPageSetUpPr();

    /**
     * True if has "pageSetUpPr" element
     */
    boolean isSetPageSetUpPr();

//    /**
//     * Sets the "pageSetUpPr" element
//     */
//    void setPageSetUpPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr pageSetUpPr);
//
//    /**
//     * Appends and returns a new empty "pageSetUpPr" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr addNewPageSetUpPr();

    /**
     * Unsets the "pageSetUpPr" element
     */
    void unsetPageSetUpPr();

    /**
     * Gets the "syncHorizontal" attribute
     */
    boolean getSyncHorizontal();

    /**
     * Gets (as xml) the "syncHorizontal" attribute
     */
    XmlBoolean xgetSyncHorizontal();

    /**
     * True if has "syncHorizontal" attribute
     */
    boolean isSetSyncHorizontal();

    /**
     * Sets the "syncHorizontal" attribute
     */
    void setSyncHorizontal(boolean syncHorizontal);

    /**
     * Sets (as xml) the "syncHorizontal" attribute
     */
    void xsetSyncHorizontal(XmlBoolean syncHorizontal);

    /**
     * Unsets the "syncHorizontal" attribute
     */
    void unsetSyncHorizontal();

    /**
     * Gets the "syncVertical" attribute
     */
    boolean getSyncVertical();

    /**
     * Gets (as xml) the "syncVertical" attribute
     */
    XmlBoolean xgetSyncVertical();

    /**
     * True if has "syncVertical" attribute
     */
    boolean isSetSyncVertical();

    /**
     * Sets the "syncVertical" attribute
     */
    void setSyncVertical(boolean syncVertical);

    /**
     * Sets (as xml) the "syncVertical" attribute
     */
    void xsetSyncVertical(XmlBoolean syncVertical);

    /**
     * Unsets the "syncVertical" attribute
     */
    void unsetSyncVertical();

    /**
     * Gets the "syncRef" attribute
     */
    String getSyncRef();

    /**
     * Gets (as xml) the "syncRef" attribute
     */
    STRef xgetSyncRef();

    /**
     * True if has "syncRef" attribute
     */
    boolean isSetSyncRef();

    /**
     * Sets the "syncRef" attribute
     */
    void setSyncRef(String syncRef);

    /**
     * Sets (as xml) the "syncRef" attribute
     */
    void xsetSyncRef(STRef syncRef);

    /**
     * Unsets the "syncRef" attribute
     */
    void unsetSyncRef();

    /**
     * Gets the "transitionEvaluation" attribute
     */
    boolean getTransitionEvaluation();

    /**
     * Gets (as xml) the "transitionEvaluation" attribute
     */
    XmlBoolean xgetTransitionEvaluation();

    /**
     * True if has "transitionEvaluation" attribute
     */
    boolean isSetTransitionEvaluation();

    /**
     * Sets the "transitionEvaluation" attribute
     */
    void setTransitionEvaluation(boolean transitionEvaluation);

    /**
     * Sets (as xml) the "transitionEvaluation" attribute
     */
    void xsetTransitionEvaluation(XmlBoolean transitionEvaluation);

    /**
     * Unsets the "transitionEvaluation" attribute
     */
    void unsetTransitionEvaluation();

    /**
     * Gets the "transitionEntry" attribute
     */
    boolean getTransitionEntry();

    /**
     * Gets (as xml) the "transitionEntry" attribute
     */
    XmlBoolean xgetTransitionEntry();

    /**
     * True if has "transitionEntry" attribute
     */
    boolean isSetTransitionEntry();

    /**
     * Sets the "transitionEntry" attribute
     */
    void setTransitionEntry(boolean transitionEntry);

    /**
     * Sets (as xml) the "transitionEntry" attribute
     */
    void xsetTransitionEntry(XmlBoolean transitionEntry);

    /**
     * Unsets the "transitionEntry" attribute
     */
    void unsetTransitionEntry();

    /**
     * Gets the "published" attribute
     */
    boolean getPublished();

    /**
     * Gets (as xml) the "published" attribute
     */
    XmlBoolean xgetPublished();

    /**
     * True if has "published" attribute
     */
    boolean isSetPublished();

    /**
     * Sets the "published" attribute
     */
    void setPublished(boolean published);

    /**
     * Sets (as xml) the "published" attribute
     */
    void xsetPublished(XmlBoolean published);

    /**
     * Unsets the "published" attribute
     */
    void unsetPublished();

    /**
     * Gets the "codeName" attribute
     */
    String getCodeName();

    /**
     * Gets (as xml) the "codeName" attribute
     */
    XmlString xgetCodeName();

    /**
     * True if has "codeName" attribute
     */
    boolean isSetCodeName();

    /**
     * Sets the "codeName" attribute
     */
    void setCodeName(String codeName);

    /**
     * Sets (as xml) the "codeName" attribute
     */
    void xsetCodeName(XmlString codeName);

    /**
     * Unsets the "codeName" attribute
     */
    void unsetCodeName();

    /**
     * Gets the "filterMode" attribute
     */
    boolean getFilterMode();

    /**
     * Gets (as xml) the "filterMode" attribute
     */
    XmlBoolean xgetFilterMode();

    /**
     * True if has "filterMode" attribute
     */
    boolean isSetFilterMode();

    /**
     * Sets the "filterMode" attribute
     */
    void setFilterMode(boolean filterMode);

    /**
     * Sets (as xml) the "filterMode" attribute
     */
    void xsetFilterMode(XmlBoolean filterMode);

    /**
     * Unsets the "filterMode" attribute
     */
    void unsetFilterMode();

    /**
     * Gets the "enableFormatConditionsCalculation" attribute
     */
    boolean getEnableFormatConditionsCalculation();

    /**
     * Gets (as xml) the "enableFormatConditionsCalculation" attribute
     */
    XmlBoolean xgetEnableFormatConditionsCalculation();

    /**
     * True if has "enableFormatConditionsCalculation" attribute
     */
    boolean isSetEnableFormatConditionsCalculation();

    /**
     * Sets the "enableFormatConditionsCalculation" attribute
     */
    void setEnableFormatConditionsCalculation(boolean enableFormatConditionsCalculation);

    /**
     * Sets (as xml) the "enableFormatConditionsCalculation" attribute
     */
    void xsetEnableFormatConditionsCalculation(XmlBoolean enableFormatConditionsCalculation);

    /**
     * Unsets the "enableFormatConditionsCalculation" attribute
     */
    void unsetEnableFormatConditionsCalculation();
}
