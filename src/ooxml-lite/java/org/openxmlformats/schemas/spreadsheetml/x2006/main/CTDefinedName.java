/*
 * XML Type:  CT_DefinedName
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_DefinedName(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName.
 */
public interface CTDefinedName extends org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula {
    DocumentFactory<CTDefinedName> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdefinedname9413type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "name" attribute
     */
    String getName();

    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetName();

    /**
     * Sets the "name" attribute
     */
    void setName(String name);

    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring name);

    /**
     * Gets the "comment" attribute
     */
    String getComment();

    /**
     * Gets (as xml) the "comment" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetComment();

    /**
     * True if has "comment" attribute
     */
    boolean isSetComment();

    /**
     * Sets the "comment" attribute
     */
    void setComment(String comment);

//    /**
//     * Sets (as xml) the "comment" attribute
//     */
//    void xsetComment(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring comment);
//
//    /**
//     * Unsets the "comment" attribute
//     */
//    void unsetComment();
//
//    /**
//     * Gets the "customMenu" attribute
//     */
//    String getCustomMenu();
//
//    /**
//     * Gets (as xml) the "customMenu" attribute
//     */
//    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetCustomMenu();
//
//    /**
//     * True if has "customMenu" attribute
//     */
//    boolean isSetCustomMenu();
//
//    /**
//     * Sets the "customMenu" attribute
//     */
//    void setCustomMenu(String customMenu);
//
//    /**
//     * Sets (as xml) the "customMenu" attribute
//     */
//    void xsetCustomMenu(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring customMenu);
//
//    /**
//     * Unsets the "customMenu" attribute
//     */
//    void unsetCustomMenu();

    /**
     * Gets the "description" attribute
     */
    String getDescription();

    /**
     * Gets (as xml) the "description" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetDescription();

    /**
     * True if has "description" attribute
     */
    boolean isSetDescription();

    /**
     * Sets the "description" attribute
     */
    void setDescription(String description);

    /**
     * Sets (as xml) the "description" attribute
     */
    void xsetDescription(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring description);

    /**
     * Unsets the "description" attribute
     */
    void unsetDescription();

    /**
     * Gets the "help" attribute
     */
    String getHelp();

    /**
     * Gets (as xml) the "help" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetHelp();

    /**
     * True if has "help" attribute
     */
    boolean isSetHelp();

    /**
     * Sets the "help" attribute
     */
    void setHelp(String help);

//    /**
//     * Sets (as xml) the "help" attribute
//     */
//    void xsetHelp(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring help);
//
//    /**
//     * Unsets the "help" attribute
//     */
//    void unsetHelp();
//
//    /**
//     * Gets the "statusBar" attribute
//     */
//    String getStatusBar();
//
//    /**
//     * Gets (as xml) the "statusBar" attribute
//     */
//    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetStatusBar();
//
//    /**
//     * True if has "statusBar" attribute
//     */
//    boolean isSetStatusBar();
//
//    /**
//     * Sets the "statusBar" attribute
//     */
//    void setStatusBar(String statusBar);
//
//    /**
//     * Sets (as xml) the "statusBar" attribute
//     */
//    void xsetStatusBar(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring statusBar);
//
//    /**
//     * Unsets the "statusBar" attribute
//     */
//    void unsetStatusBar();

    /**
     * Gets the "localSheetId" attribute
     */
    long getLocalSheetId();

    /**
     * Gets (as xml) the "localSheetId" attribute
     */
    XmlUnsignedInt xgetLocalSheetId();

    /**
     * True if has "localSheetId" attribute
     */
    boolean isSetLocalSheetId();

    /**
     * Sets the "localSheetId" attribute
     */
    void setLocalSheetId(long localSheetId);

    /**
     * Sets (as xml) the "localSheetId" attribute
     */
    void xsetLocalSheetId(XmlUnsignedInt localSheetId);

    /**
     * Unsets the "localSheetId" attribute
     */
    void unsetLocalSheetId();

    /**
     * Gets the "hidden" attribute
     */
    boolean getHidden();

    /**
     * Gets (as xml) the "hidden" attribute
     */
    XmlBoolean xgetHidden();

    /**
     * True if has "hidden" attribute
     */
    boolean isSetHidden();

    /**
     * Sets the "hidden" attribute
     */
    void setHidden(boolean hidden);

    /**
     * Sets (as xml) the "hidden" attribute
     */
    void xsetHidden(XmlBoolean hidden);

    /**
     * Unsets the "hidden" attribute
     */
    void unsetHidden();

    /**
     * Gets the "function" attribute
     */
    boolean getFunction();

    /**
     * Gets (as xml) the "function" attribute
     */
    XmlBoolean xgetFunction();

    /**
     * True if has "function" attribute
     */
    boolean isSetFunction();

    /**
     * Sets the "function" attribute
     */
    void setFunction(boolean function);

//    /**
//     * Sets (as xml) the "function" attribute
//     */
//    void xsetFunction(org.apache.xmlbeans.XmlBoolean function);
//
//    /**
//     * Unsets the "function" attribute
//     */
//    void unsetFunction();
//
//    /**
//     * Gets the "vbProcedure" attribute
//     */
//    boolean getVbProcedure();
//
//    /**
//     * Gets (as xml) the "vbProcedure" attribute
//     */
//    org.apache.xmlbeans.XmlBoolean xgetVbProcedure();
//
//    /**
//     * True if has "vbProcedure" attribute
//     */
//    boolean isSetVbProcedure();
//
//    /**
//     * Sets the "vbProcedure" attribute
//     */
//    void setVbProcedure(boolean vbProcedure);
//
//    /**
//     * Sets (as xml) the "vbProcedure" attribute
//     */
//    void xsetVbProcedure(org.apache.xmlbeans.XmlBoolean vbProcedure);
//
//    /**
//     * Unsets the "vbProcedure" attribute
//     */
//    void unsetVbProcedure();
//
//    /**
//     * Gets the "xlm" attribute
//     */
//    boolean getXlm();
//
//    /**
//     * Gets (as xml) the "xlm" attribute
//     */
//    org.apache.xmlbeans.XmlBoolean xgetXlm();
//
//    /**
//     * True if has "xlm" attribute
//     */
//    boolean isSetXlm();

    /**
     * Sets the "xlm" attribute
     */
    void setXlm(boolean xlm);

    /**
     * Sets (as xml) the "xlm" attribute
     */
    void xsetXlm(XmlBoolean xlm);

    /**
     * Unsets the "xlm" attribute
     */
    void unsetXlm();

    /**
     * Gets the "functionGroupId" attribute
     */
    long getFunctionGroupId();

    /**
     * Gets (as xml) the "functionGroupId" attribute
     */
    XmlUnsignedInt xgetFunctionGroupId();

    /**
     * True if has "functionGroupId" attribute
     */
    boolean isSetFunctionGroupId();

    /**
     * Sets the "functionGroupId" attribute
     */
    void setFunctionGroupId(long functionGroupId);

//    /**
//     * Sets (as xml) the "functionGroupId" attribute
//     */
//    void xsetFunctionGroupId(org.apache.xmlbeans.XmlUnsignedInt functionGroupId);
//
//    /**
//     * Unsets the "functionGroupId" attribute
//     */
//    void unsetFunctionGroupId();
//
//    /**
//     * Gets the "shortcutKey" attribute
//     */
//    String getShortcutKey();
//
//    /**
//     * Gets (as xml) the "shortcutKey" attribute
//     */
//    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetShortcutKey();
//
//    /**
//     * True if has "shortcutKey" attribute
//     */
//    boolean isSetShortcutKey();
//
//    /**
//     * Sets the "shortcutKey" attribute
//     */
//    void setShortcutKey(String shortcutKey);
//
//    /**
//     * Sets (as xml) the "shortcutKey" attribute
//     */
//    void xsetShortcutKey(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring shortcutKey);
//
//    /**
//     * Unsets the "shortcutKey" attribute
//     */
//    void unsetShortcutKey();
//
//    /**
//     * Gets the "publishToServer" attribute
//     */
//    boolean getPublishToServer();
//
//    /**
//     * Gets (as xml) the "publishToServer" attribute
//     */
//    org.apache.xmlbeans.XmlBoolean xgetPublishToServer();
//
//    /**
//     * True if has "publishToServer" attribute
//     */
//    boolean isSetPublishToServer();
//
//    /**
//     * Sets the "publishToServer" attribute
//     */
//    void setPublishToServer(boolean publishToServer);
//
//    /**
//     * Sets (as xml) the "publishToServer" attribute
//     */
//    void xsetPublishToServer(org.apache.xmlbeans.XmlBoolean publishToServer);
//
//    /**
//     * Unsets the "publishToServer" attribute
//     */
//    void unsetPublishToServer();
//
//    /**
//     * Gets the "workbookParameter" attribute
//     */
//    boolean getWorkbookParameter();
//
//    /**
//     * Gets (as xml) the "workbookParameter" attribute
//     */
//    org.apache.xmlbeans.XmlBoolean xgetWorkbookParameter();
//
//    /**
//     * True if has "workbookParameter" attribute
//     */
//    boolean isSetWorkbookParameter();
//
//    /**
//     * Sets the "workbookParameter" attribute
//     */
//    void setWorkbookParameter(boolean workbookParameter);
//
//    /**
//     * Sets (as xml) the "workbookParameter" attribute
//     */
//    void xsetWorkbookParameter(org.apache.xmlbeans.XmlBoolean workbookParameter);
//
//    /**
//     * Unsets the "workbookParameter" attribute
//     */
//    void unsetWorkbookParameter();
}
