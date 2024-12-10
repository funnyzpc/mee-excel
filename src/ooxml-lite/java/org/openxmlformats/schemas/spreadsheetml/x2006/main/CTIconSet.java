/*
 * XML Type:  CT_IconSet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_IconSet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTIconSet extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTIconSet> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cticonset2648type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets array of all "cfvo" elements
     */
    CTCfvo[] getCfvoArray();

    /**
     * Sets array of all "cfvo" element
     */
    void setCfvoArray(CTCfvo[] cfvoArray);


    /**
     * Appends and returns a new empty value (as xml) as the last "cfvo" element
     */
    CTCfvo addNewCfvo();


    /**
     * Gets the "iconSet" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum getIconSet();

    /**
     * Sets the "iconSet" attribute
     */
    void setIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum iconSet);


    /**
     * Gets the "showValue" attribute
     */
    boolean getShowValue();

    /**
     * Gets (as xml) the "showValue" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowValue();

    /**
     * True if has "showValue" attribute
     */
    boolean isSetShowValue();

    /**
     * Sets the "showValue" attribute
     */
    void setShowValue(boolean showValue);

    /**
     * Gets the "percent" attribute
     */
    boolean getPercent();

    /**
     * Gets (as xml) the "percent" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPercent();

    /**
     * True if has "percent" attribute
     */
    boolean isSetPercent();

    /**
     * Sets the "percent" attribute
     */
    void setPercent(boolean percent);

    /**
     * Gets the "reverse" attribute
     */
    boolean getReverse();
    /**
     * True if has "reverse" attribute
     */
    boolean isSetReverse();

    /**
     * Sets the "reverse" attribute
     */
    void setReverse(boolean reverse);

}
