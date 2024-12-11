/*
 * XML Type:  CT_Table
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTable
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Table(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTable extends XmlObject {
    DocumentFactory<CTTable> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cttable5f3ftype");
    SchemaType type = Factory.getType();

    /**
     * Gets the "id" attribute
     */
    long getId();

    /**
     * Gets the "tableColumns" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns getTableColumns();
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();

    /**
     * Gets the "totalsRowCount" attribute
     */
    long getTotalsRowCount();
    /**
     * Gets the "headerRowCount" attribute
     */
    long getHeaderRowCount();
    /**
     * True if has "tableStyleInfo" element
     */
    boolean isSetTableStyleInfo();
    /**
     * Gets the "tableStyleInfo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo getTableStyleInfo();
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    /**
     * Sets the "ref" attribute
     */
    void setRef(java.lang.String ref);
    /**
     * True if has "autoFilter" element
     */
    boolean isSetAutoFilter();
    /**
     * Gets the "autoFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter getAutoFilter();
    /**
     * Gets the "ref" attribute
     */
    java.lang.String getRef();
    /**
     * Sets the "displayName" attribute
     */
    void setDisplayName(java.lang.String displayName);
    /**
     * Appends and returns a new empty "tableStyleInfo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo addNewTableStyleInfo();
    /**
     * Gets the "displayName" attribute
     */
    java.lang.String getDisplayName();
    /**
     * Gets the "totalsRowShown" attribute
     */
    boolean getTotalsRowShown();

    /**
     * Appends and returns a new empty "tableColumns" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns addNewTableColumns();

}
