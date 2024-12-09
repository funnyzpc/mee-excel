/*
 * XML Type:  CT_TableStyles
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_TableStyles(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTableStyles extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTTableStyles> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cttablestyles872ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "tableStyle" elements
     */
    java.util.List<CTTableStyle> getTableStyleList();

    /**
     * Gets array of all "tableStyle" elements
     */
    CTTableStyle[] getTableStyleArray();

    /**
     * Gets ith "tableStyle" element
     */
    CTTableStyle getTableStyleArray(int i);

    /**
     * Returns number of "tableStyle" element
     */
    int sizeOfTableStyleArray();

    /**
     * Sets array of all "tableStyle" element
     */
    void setTableStyleArray(CTTableStyle[] tableStyleArray);

    /**
     * Sets ith "tableStyle" element
     */
    void setTableStyleArray(int i, CTTableStyle tableStyle);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "tableStyle" element
     */
    CTTableStyle insertNewTableStyle(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "tableStyle" element
     */
    CTTableStyle addNewTableStyle();

    /**
     * Removes the ith "tableStyle" element
     */
    void removeTableStyle(int i);

    /**
     * Gets the "count" attribute
     */
    long getCount();

    /**
     * Gets (as xml) the "count" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCount();

    /**
     * True if has "count" attribute
     */
    boolean isSetCount();

    /**
     * Sets the "count" attribute
     */
    void setCount(long count);

    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count);

    /**
     * Unsets the "count" attribute
     */
    void unsetCount();

    /**
     * Gets the "defaultTableStyle" attribute
     */
    String getDefaultTableStyle();

    /**
     * Gets (as xml) the "defaultTableStyle" attribute
     */
    org.apache.xmlbeans.XmlString xgetDefaultTableStyle();

    /**
     * True if has "defaultTableStyle" attribute
     */
    boolean isSetDefaultTableStyle();

    /**
     * Sets the "defaultTableStyle" attribute
     */
    void setDefaultTableStyle(String defaultTableStyle);

    /**
     * Sets (as xml) the "defaultTableStyle" attribute
     */
    void xsetDefaultTableStyle(org.apache.xmlbeans.XmlString defaultTableStyle);

    /**
     * Unsets the "defaultTableStyle" attribute
     */
    void unsetDefaultTableStyle();

    /**
     * Gets the "defaultPivotStyle" attribute
     */
    String getDefaultPivotStyle();

    /**
     * Gets (as xml) the "defaultPivotStyle" attribute
     */
    org.apache.xmlbeans.XmlString xgetDefaultPivotStyle();

    /**
     * True if has "defaultPivotStyle" attribute
     */
    boolean isSetDefaultPivotStyle();

    /**
     * Sets the "defaultPivotStyle" attribute
     */
    void setDefaultPivotStyle(String defaultPivotStyle);

    /**
     * Sets (as xml) the "defaultPivotStyle" attribute
     */
    void xsetDefaultPivotStyle(org.apache.xmlbeans.XmlString defaultPivotStyle);

    /**
     * Unsets the "defaultPivotStyle" attribute
     */
    void unsetDefaultPivotStyle();
}
