/*
 * XML Type:  CT_Workbook
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Workbook(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTWorkbook extends XmlObject {
    DocumentFactory<CTWorkbook> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctworkbook83c3type");
    SchemaType type = Factory.getType();


//    /**
//     * Gets the "fileVersion" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion getFileVersion();

//    /**
//     * True if has "fileVersion" element
//     */
//    boolean isSetFileVersion();
//
//    /**
//     * Sets the "fileVersion" element
//     */
//    void setFileVersion(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion fileVersion);

//    /**
//     * Appends and returns a new empty "fileVersion" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion addNewFileVersion();
//
//    /**
//     * Unsets the "fileVersion" element
//     */
//    void unsetFileVersion();



    /**
     * Unsets the "fileSharing" element
     */
    void unsetFileSharing();

    /**
     * Gets the "workbookPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr getWorkbookPr();

    /**
     * Appends and returns a new empty "workbookPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr addNewWorkbookPr();

    /**
     * Gets the "workbookProtection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection getWorkbookProtection();

    /**
     * True if has "workbookProtection" element
     */
    boolean isSetWorkbookProtection();

    /**
     * Sets the "workbookProtection" element
     */
    void setWorkbookProtection(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection workbookProtection);

    /**
     * Appends and returns a new empty "workbookProtection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection addNewWorkbookProtection();

    /**
     * Unsets the "workbookProtection" element
     */
    void unsetWorkbookProtection();

    /**
     * Gets the "bookViews" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews getBookViews();

    /**
     * True if has "bookViews" element
     */
    boolean isSetBookViews();

    /**
     * Sets the "bookViews" element
     */
    void setBookViews(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews bookViews);

    /**
     * Appends and returns a new empty "bookViews" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews addNewBookViews();

    /**
     * Unsets the "bookViews" element
     */
    void unsetBookViews();

    /**
     * Gets the "sheets" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets getSheets();

    /**
     * Sets the "sheets" element
     */
    void setSheets(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets sheets);

    /**
     * Appends and returns a new empty "sheets" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets addNewSheets();

    /**
     * Unsets the "functionGroups" element
     */
    void unsetFunctionGroups();

    /**
     * Gets the "externalReferences" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences getExternalReferences();

    /**
     * True if has "externalReferences" element
     */
    boolean isSetExternalReferences();

    /**
     * Sets the "externalReferences" element
     */
    void setExternalReferences(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences externalReferences);

    /**
     * Appends and returns a new empty "externalReferences" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences addNewExternalReferences();

    /**
     * Unsets the "externalReferences" element
     */
    void unsetExternalReferences();

    /**
     * Gets the "definedNames" element
     */
    CTDefinedNames getDefinedNames();

    /**
     * True if has "definedNames" element
     */
    boolean isSetDefinedNames();

    /**
     * Sets the "definedNames" element
     */
    void setDefinedNames(CTDefinedNames definedNames);

    /**
     * Appends and returns a new empty "definedNames" element
     */
    CTDefinedNames addNewDefinedNames();

    /**
     * Unsets the "definedNames" element
     */
    void unsetDefinedNames();

    /**
     * Gets the "calcPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr getCalcPr();

    /**
     * True if has "calcPr" element
     */
    boolean isSetCalcPr();

    /**
     * Sets the "calcPr" element
     */
    void setCalcPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr calcPr);

    /**
     * Appends and returns a new empty "calcPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr addNewCalcPr();

    /**
     * Unsets the "oleSize" element
     */
    void unsetOleSize();


    /**
     * Unsets the "webPublishing" element
     */
    void unsetWebPublishing();


    /**
     * Removes the ith "fileRecoveryPr" element
     */
    void removeFileRecoveryPr(int i);

    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();


    /**
     * Unsets the "conformance" attribute
     */
    void unsetConformance();
}
