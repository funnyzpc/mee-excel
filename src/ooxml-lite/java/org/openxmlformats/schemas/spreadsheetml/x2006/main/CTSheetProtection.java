/*
 * XML Type:  CT_SheetProtection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBase64Binary;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_SheetProtection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheetProtection extends XmlObject {
    DocumentFactory<CTSheetProtection> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsheetprotection22f7type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "password" attribute
     */
    byte[] getPassword();

//    /**
//     * Gets (as xml) the "password" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex xgetPassword();

    /**
     * True if has "password" attribute
     */
    boolean isSetPassword();

    /**
     * Sets the "password" attribute
     */
    void setPassword(byte[] password);

//    /**
//     * Sets (as xml) the "password" attribute
//     */
//    void xsetPassword(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex password);

    /**
     * Unsets the "password" attribute
     */
    void unsetPassword();

    /**
     * Gets the "algorithmName" attribute
     */
    String getAlgorithmName();

    /**
     * Gets (as xml) the "algorithmName" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetAlgorithmName();

    /**
     * True if has "algorithmName" attribute
     */
    boolean isSetAlgorithmName();

    /**
     * Sets the "algorithmName" attribute
     */
    void setAlgorithmName(String algorithmName);

    /**
     * Sets (as xml) the "algorithmName" attribute
     */
    void xsetAlgorithmName(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring algorithmName);

    /**
     * Unsets the "algorithmName" attribute
     */
    void unsetAlgorithmName();

    /**
     * Gets the "hashValue" attribute
     */
    byte[] getHashValue();

    /**
     * Gets (as xml) the "hashValue" attribute
     */
    XmlBase64Binary xgetHashValue();

    /**
     * True if has "hashValue" attribute
     */
    boolean isSetHashValue();

    /**
     * Sets the "hashValue" attribute
     */
    void setHashValue(byte[] hashValue);

    /**
     * Sets (as xml) the "hashValue" attribute
     */
    void xsetHashValue(XmlBase64Binary hashValue);

    /**
     * Unsets the "hashValue" attribute
     */
    void unsetHashValue();

    /**
     * Gets the "saltValue" attribute
     */
    byte[] getSaltValue();

    /**
     * Gets (as xml) the "saltValue" attribute
     */
    XmlBase64Binary xgetSaltValue();

    /**
     * True if has "saltValue" attribute
     */
    boolean isSetSaltValue();

    /**
     * Sets the "saltValue" attribute
     */
    void setSaltValue(byte[] saltValue);

    /**
     * Sets (as xml) the "saltValue" attribute
     */
    void xsetSaltValue(XmlBase64Binary saltValue);

    /**
     * Unsets the "saltValue" attribute
     */
    void unsetSaltValue();

    /**
     * Gets the "spinCount" attribute
     */
    long getSpinCount();

    /**
     * Gets (as xml) the "spinCount" attribute
     */
    XmlUnsignedInt xgetSpinCount();

    /**
     * True if has "spinCount" attribute
     */
    boolean isSetSpinCount();

    /**
     * Sets the "spinCount" attribute
     */
    void setSpinCount(long spinCount);

    /**
     * Sets (as xml) the "spinCount" attribute
     */
    void xsetSpinCount(XmlUnsignedInt spinCount);

    /**
     * Unsets the "spinCount" attribute
     */
    void unsetSpinCount();

    /**
     * Gets the "sheet" attribute
     */
    boolean getSheet();

    /**
     * Gets (as xml) the "sheet" attribute
     */
    XmlBoolean xgetSheet();

    /**
     * True if has "sheet" attribute
     */
    boolean isSetSheet();

    /**
     * Sets the "sheet" attribute
     */
    void setSheet(boolean sheet);

    /**
     * Sets (as xml) the "sheet" attribute
     */
    void xsetSheet(XmlBoolean sheet);

    /**
     * Unsets the "sheet" attribute
     */
    void unsetSheet();

    /**
     * Gets the "objects" attribute
     */
    boolean getObjects();

    /**
     * Gets (as xml) the "objects" attribute
     */
    XmlBoolean xgetObjects();

    /**
     * True if has "objects" attribute
     */
    boolean isSetObjects();

    /**
     * Sets the "objects" attribute
     */
    void setObjects(boolean objects);

    /**
     * Sets (as xml) the "objects" attribute
     */
    void xsetObjects(XmlBoolean objects);

    /**
     * Unsets the "objects" attribute
     */
    void unsetObjects();

    /**
     * Gets the "scenarios" attribute
     */
    boolean getScenarios();

    /**
     * Gets (as xml) the "scenarios" attribute
     */
    XmlBoolean xgetScenarios();

    /**
     * True if has "scenarios" attribute
     */
    boolean isSetScenarios();

    /**
     * Sets the "scenarios" attribute
     */
    void setScenarios(boolean scenarios);

    /**
     * Sets (as xml) the "scenarios" attribute
     */
    void xsetScenarios(XmlBoolean scenarios);

    /**
     * Unsets the "scenarios" attribute
     */
    void unsetScenarios();

    /**
     * Gets the "formatCells" attribute
     */
    boolean getFormatCells();

    /**
     * Gets (as xml) the "formatCells" attribute
     */
    XmlBoolean xgetFormatCells();

    /**
     * True if has "formatCells" attribute
     */
    boolean isSetFormatCells();

    /**
     * Sets the "formatCells" attribute
     */
    void setFormatCells(boolean formatCells);

    /**
     * Sets (as xml) the "formatCells" attribute
     */
    void xsetFormatCells(XmlBoolean formatCells);

    /**
     * Unsets the "formatCells" attribute
     */
    void unsetFormatCells();

    /**
     * Gets the "formatColumns" attribute
     */
    boolean getFormatColumns();

    /**
     * Gets (as xml) the "formatColumns" attribute
     */
    XmlBoolean xgetFormatColumns();

    /**
     * True if has "formatColumns" attribute
     */
    boolean isSetFormatColumns();

    /**
     * Sets the "formatColumns" attribute
     */
    void setFormatColumns(boolean formatColumns);

    /**
     * Sets (as xml) the "formatColumns" attribute
     */
    void xsetFormatColumns(XmlBoolean formatColumns);

    /**
     * Unsets the "formatColumns" attribute
     */
    void unsetFormatColumns();

    /**
     * Gets the "formatRows" attribute
     */
    boolean getFormatRows();

    /**
     * Gets (as xml) the "formatRows" attribute
     */
    XmlBoolean xgetFormatRows();

    /**
     * True if has "formatRows" attribute
     */
    boolean isSetFormatRows();

    /**
     * Sets the "formatRows" attribute
     */
    void setFormatRows(boolean formatRows);

    /**
     * Sets (as xml) the "formatRows" attribute
     */
    void xsetFormatRows(XmlBoolean formatRows);

    /**
     * Unsets the "formatRows" attribute
     */
    void unsetFormatRows();

    /**
     * Gets the "insertColumns" attribute
     */
    boolean getInsertColumns();

    /**
     * Gets (as xml) the "insertColumns" attribute
     */
    XmlBoolean xgetInsertColumns();

    /**
     * True if has "insertColumns" attribute
     */
    boolean isSetInsertColumns();

    /**
     * Sets the "insertColumns" attribute
     */
    void setInsertColumns(boolean insertColumns);

    /**
     * Sets (as xml) the "insertColumns" attribute
     */
    void xsetInsertColumns(XmlBoolean insertColumns);

    /**
     * Unsets the "insertColumns" attribute
     */
    void unsetInsertColumns();

    /**
     * Gets the "insertRows" attribute
     */
    boolean getInsertRows();

    /**
     * Gets (as xml) the "insertRows" attribute
     */
    XmlBoolean xgetInsertRows();

    /**
     * True if has "insertRows" attribute
     */
    boolean isSetInsertRows();

    /**
     * Sets the "insertRows" attribute
     */
    void setInsertRows(boolean insertRows);

    /**
     * Sets (as xml) the "insertRows" attribute
     */
    void xsetInsertRows(XmlBoolean insertRows);

    /**
     * Unsets the "insertRows" attribute
     */
    void unsetInsertRows();

    /**
     * Gets the "insertHyperlinks" attribute
     */
    boolean getInsertHyperlinks();

    /**
     * Gets (as xml) the "insertHyperlinks" attribute
     */
    XmlBoolean xgetInsertHyperlinks();

    /**
     * True if has "insertHyperlinks" attribute
     */
    boolean isSetInsertHyperlinks();

    /**
     * Sets the "insertHyperlinks" attribute
     */
    void setInsertHyperlinks(boolean insertHyperlinks);

    /**
     * Sets (as xml) the "insertHyperlinks" attribute
     */
    void xsetInsertHyperlinks(XmlBoolean insertHyperlinks);

    /**
     * Unsets the "insertHyperlinks" attribute
     */
    void unsetInsertHyperlinks();

    /**
     * Gets the "deleteColumns" attribute
     */
    boolean getDeleteColumns();

    /**
     * Gets (as xml) the "deleteColumns" attribute
     */
    XmlBoolean xgetDeleteColumns();

    /**
     * True if has "deleteColumns" attribute
     */
    boolean isSetDeleteColumns();

    /**
     * Sets the "deleteColumns" attribute
     */
    void setDeleteColumns(boolean deleteColumns);

    /**
     * Sets (as xml) the "deleteColumns" attribute
     */
    void xsetDeleteColumns(XmlBoolean deleteColumns);

    /**
     * Unsets the "deleteColumns" attribute
     */
    void unsetDeleteColumns();

    /**
     * Gets the "deleteRows" attribute
     */
    boolean getDeleteRows();

    /**
     * Gets (as xml) the "deleteRows" attribute
     */
    XmlBoolean xgetDeleteRows();

    /**
     * True if has "deleteRows" attribute
     */
    boolean isSetDeleteRows();

    /**
     * Sets the "deleteRows" attribute
     */
    void setDeleteRows(boolean deleteRows);

    /**
     * Sets (as xml) the "deleteRows" attribute
     */
    void xsetDeleteRows(XmlBoolean deleteRows);

    /**
     * Unsets the "deleteRows" attribute
     */
    void unsetDeleteRows();

    /**
     * Gets the "selectLockedCells" attribute
     */
    boolean getSelectLockedCells();

    /**
     * Gets (as xml) the "selectLockedCells" attribute
     */
    XmlBoolean xgetSelectLockedCells();

    /**
     * True if has "selectLockedCells" attribute
     */
    boolean isSetSelectLockedCells();

    /**
     * Sets the "selectLockedCells" attribute
     */
    void setSelectLockedCells(boolean selectLockedCells);

    /**
     * Sets (as xml) the "selectLockedCells" attribute
     */
    void xsetSelectLockedCells(XmlBoolean selectLockedCells);

    /**
     * Unsets the "selectLockedCells" attribute
     */
    void unsetSelectLockedCells();

    /**
     * Gets the "sort" attribute
     */
    boolean getSort();

    /**
     * Gets (as xml) the "sort" attribute
     */
    XmlBoolean xgetSort();

    /**
     * True if has "sort" attribute
     */
    boolean isSetSort();

    /**
     * Sets the "sort" attribute
     */
    void setSort(boolean sort);

    /**
     * Sets (as xml) the "sort" attribute
     */
    void xsetSort(XmlBoolean sort);

    /**
     * Unsets the "sort" attribute
     */
    void unsetSort();

    /**
     * Gets the "autoFilter" attribute
     */
    boolean getAutoFilter();

    /**
     * Gets (as xml) the "autoFilter" attribute
     */
    XmlBoolean xgetAutoFilter();

    /**
     * True if has "autoFilter" attribute
     */
    boolean isSetAutoFilter();

    /**
     * Sets the "autoFilter" attribute
     */
    void setAutoFilter(boolean autoFilter);

    /**
     * Sets (as xml) the "autoFilter" attribute
     */
    void xsetAutoFilter(XmlBoolean autoFilter);

    /**
     * Unsets the "autoFilter" attribute
     */
    void unsetAutoFilter();

    /**
     * Gets the "pivotTables" attribute
     */
    boolean getPivotTables();

    /**
     * Gets (as xml) the "pivotTables" attribute
     */
    XmlBoolean xgetPivotTables();

    /**
     * True if has "pivotTables" attribute
     */
    boolean isSetPivotTables();

    /**
     * Sets the "pivotTables" attribute
     */
    void setPivotTables(boolean pivotTables);

    /**
     * Sets (as xml) the "pivotTables" attribute
     */
    void xsetPivotTables(XmlBoolean pivotTables);

    /**
     * Unsets the "pivotTables" attribute
     */
    void unsetPivotTables();

    /**
     * Gets the "selectUnlockedCells" attribute
     */
    boolean getSelectUnlockedCells();

    /**
     * Gets (as xml) the "selectUnlockedCells" attribute
     */
    XmlBoolean xgetSelectUnlockedCells();

    /**
     * True if has "selectUnlockedCells" attribute
     */
    boolean isSetSelectUnlockedCells();

    /**
     * Sets the "selectUnlockedCells" attribute
     */
    void setSelectUnlockedCells(boolean selectUnlockedCells);

    /**
     * Sets (as xml) the "selectUnlockedCells" attribute
     */
    void xsetSelectUnlockedCells(XmlBoolean selectUnlockedCells);

    /**
     * Unsets the "selectUnlockedCells" attribute
     */
    void unsetSelectUnlockedCells();
}
