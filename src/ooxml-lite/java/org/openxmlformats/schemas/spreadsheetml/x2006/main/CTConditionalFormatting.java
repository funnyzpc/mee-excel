/*
 * XML Type:  CT_ConditionalFormatting
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_ConditionalFormatting(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTConditionalFormatting extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTConditionalFormatting> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctconditionalformatting0deatype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets ith "cfRule" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule getCfRuleArray(int i);

    /**
     * Returns number of "cfRule" element
     */
    int sizeOfCfRuleArray();

    /**
     * Sets array of all "cfRule" element
     */
    void setCfRuleArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule[] cfRuleArray);

    /**
     * Sets ith "cfRule" element
     */
    void setCfRuleArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule cfRule);

    /**
     * Appends and returns a new empty value (as xml) as the last "cfRule" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule addNewCfRule();

    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

//    /**
//     * Sets the "extLst" element
//     */
//    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);
//
//    /**
//     * Appends and returns a new empty "extLst" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();

    /**
     * Gets the "pivot" attribute
     */
    boolean getPivot();
    /**
     * Sets the "pivot" attribute
     */
    void setPivot(boolean pivot);


    /**
     * Gets the "sqref" attribute
     */
    java.util.List getSqref();


    /**
     * Sets the "sqref" attribute
     */
    void setSqref(java.util.List sqref);


}
