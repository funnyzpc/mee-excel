/*
 * XML Type:  CT_DataBar
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_DataBar(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDataBar extends XmlObject {
    DocumentFactory<CTDataBar> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdatabar4128type");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "cfvo" elements
     */
    java.util.List<CTCfvo> getCfvoList();

    /**
     * Gets array of all "cfvo" elements
     */
    CTCfvo[] getCfvoArray();

    /**
     * Gets ith "cfvo" element
     */
    CTCfvo getCfvoArray(int i);

    /**
     * Returns number of "cfvo" element
     */
    int sizeOfCfvoArray();

    /**
     * Sets array of all "cfvo" element
     */
    void setCfvoArray(CTCfvo[] cfvoArray);

    /**
     * Sets ith "cfvo" element
     */
    void setCfvoArray(int i, CTCfvo cfvo);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "cfvo" element
     */
    CTCfvo insertNewCfvo(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "cfvo" element
     */
    CTCfvo addNewCfvo();

    /**
     * Removes the ith "cfvo" element
     */
    void removeCfvo(int i);

    /**
     * Gets the "color" element
     */
    CTColor getColor();

    /**
     * Sets the "color" element
     */
    void setColor(CTColor color);

    /**
     * Appends and returns a new empty "color" element
     */
    CTColor addNewColor();

    /**
     * Gets the "minLength" attribute
     */
    long getMinLength();

    /**
     * Gets (as xml) the "minLength" attribute
     */
    XmlUnsignedInt xgetMinLength();

    /**
     * True if has "minLength" attribute
     */
    boolean isSetMinLength();

    /**
     * Sets the "minLength" attribute
     */
    void setMinLength(long minLength);

    /**
     * Sets (as xml) the "minLength" attribute
     */
    void xsetMinLength(XmlUnsignedInt minLength);

    /**
     * Unsets the "minLength" attribute
     */
    void unsetMinLength();

    /**
     * Gets the "maxLength" attribute
     */
    long getMaxLength();

    /**
     * Gets (as xml) the "maxLength" attribute
     */
    XmlUnsignedInt xgetMaxLength();

    /**
     * True if has "maxLength" attribute
     */
    boolean isSetMaxLength();

    /**
     * Sets the "maxLength" attribute
     */
    void setMaxLength(long maxLength);

    /**
     * Sets (as xml) the "maxLength" attribute
     */
    void xsetMaxLength(XmlUnsignedInt maxLength);

    /**
     * Unsets the "maxLength" attribute
     */
    void unsetMaxLength();

    /**
     * Gets the "showValue" attribute
     */
    boolean getShowValue();

    /**
     * Gets (as xml) the "showValue" attribute
     */
    XmlBoolean xgetShowValue();

    /**
     * True if has "showValue" attribute
     */
    boolean isSetShowValue();

    /**
     * Sets the "showValue" attribute
     */
    void setShowValue(boolean showValue);

    /**
     * Sets (as xml) the "showValue" attribute
     */
    void xsetShowValue(XmlBoolean showValue);

    /**
     * Unsets the "showValue" attribute
     */
    void unsetShowValue();
}
