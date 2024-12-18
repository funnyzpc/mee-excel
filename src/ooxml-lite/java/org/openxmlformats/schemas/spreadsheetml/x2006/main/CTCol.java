/*
 * XML Type:  CT_Col
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlDouble;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedByte;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Col(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCol extends XmlObject {
    DocumentFactory<CTCol> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcola95ftype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "min" attribute
     */
    long getMin();

    /**
     * Gets (as xml) the "min" attribute
     */
    XmlUnsignedInt xgetMin();

    /**
     * Sets the "min" attribute
     */
    void setMin(long min);

    /**
     * Sets (as xml) the "min" attribute
     */
    void xsetMin(XmlUnsignedInt min);

    /**
     * Gets the "max" attribute
     */
    long getMax();

    /**
     * Gets (as xml) the "max" attribute
     */
    XmlUnsignedInt xgetMax();

    /**
     * Sets the "max" attribute
     */
    void setMax(long max);

    /**
     * Sets (as xml) the "max" attribute
     */
    void xsetMax(XmlUnsignedInt max);

    /**
     * Gets the "width" attribute
     */
    double getWidth();

    /**
     * Gets (as xml) the "width" attribute
     */
    XmlDouble xgetWidth();

    /**
     * True if has "width" attribute
     */
    boolean isSetWidth();

    /**
     * Sets the "width" attribute
     */
    void setWidth(double width);

    /**
     * Sets (as xml) the "width" attribute
     */
    void xsetWidth(XmlDouble width);

    /**
     * Unsets the "width" attribute
     */
    void unsetWidth();

    /**
     * Gets the "style" attribute
     */
    long getStyle();

    /**
     * Gets (as xml) the "style" attribute
     */
    XmlUnsignedInt xgetStyle();

    /**
     * True if has "style" attribute
     */
    boolean isSetStyle();

    /**
     * Sets the "style" attribute
     */
    void setStyle(long style);

    /**
     * Sets (as xml) the "style" attribute
     */
    void xsetStyle(XmlUnsignedInt style);

    /**
     * Unsets the "style" attribute
     */
    void unsetStyle();

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
     * Gets the "bestFit" attribute
     */
    boolean getBestFit();

    /**
     * Gets (as xml) the "bestFit" attribute
     */
    XmlBoolean xgetBestFit();

    /**
     * True if has "bestFit" attribute
     */
    boolean isSetBestFit();

    /**
     * Sets the "bestFit" attribute
     */
    void setBestFit(boolean bestFit);

    /**
     * Sets (as xml) the "bestFit" attribute
     */
    void xsetBestFit(XmlBoolean bestFit);

    /**
     * Unsets the "bestFit" attribute
     */
    void unsetBestFit();

    /**
     * Gets the "customWidth" attribute
     */
    boolean getCustomWidth();

    /**
     * Gets (as xml) the "customWidth" attribute
     */
    XmlBoolean xgetCustomWidth();

    /**
     * True if has "customWidth" attribute
     */
    boolean isSetCustomWidth();

    /**
     * Sets the "customWidth" attribute
     */
    void setCustomWidth(boolean customWidth);

    /**
     * Sets (as xml) the "customWidth" attribute
     */
    void xsetCustomWidth(XmlBoolean customWidth);

    /**
     * Unsets the "customWidth" attribute
     */
    void unsetCustomWidth();

    /**
     * Gets the "phonetic" attribute
     */
    boolean getPhonetic();

    /**
     * Gets (as xml) the "phonetic" attribute
     */
    XmlBoolean xgetPhonetic();

    /**
     * True if has "phonetic" attribute
     */
    boolean isSetPhonetic();

    /**
     * Sets the "phonetic" attribute
     */
    void setPhonetic(boolean phonetic);

    /**
     * Sets (as xml) the "phonetic" attribute
     */
    void xsetPhonetic(XmlBoolean phonetic);

    /**
     * Unsets the "phonetic" attribute
     */
    void unsetPhonetic();

    /**
     * Gets the "outlineLevel" attribute
     */
    short getOutlineLevel();

    /**
     * Gets (as xml) the "outlineLevel" attribute
     */
    XmlUnsignedByte xgetOutlineLevel();

    /**
     * True if has "outlineLevel" attribute
     */
    boolean isSetOutlineLevel();

    /**
     * Sets the "outlineLevel" attribute
     */
    void setOutlineLevel(short outlineLevel);

    /**
     * Sets (as xml) the "outlineLevel" attribute
     */
    void xsetOutlineLevel(XmlUnsignedByte outlineLevel);

    /**
     * Unsets the "outlineLevel" attribute
     */
    void unsetOutlineLevel();

    /**
     * Gets the "collapsed" attribute
     */
    boolean getCollapsed();

    /**
     * Gets (as xml) the "collapsed" attribute
     */
    XmlBoolean xgetCollapsed();

    /**
     * True if has "collapsed" attribute
     */
    boolean isSetCollapsed();

    /**
     * Sets the "collapsed" attribute
     */
    void setCollapsed(boolean collapsed);

    /**
     * Sets (as xml) the "collapsed" attribute
     */
    void xsetCollapsed(XmlBoolean collapsed);

    /**
     * Unsets the "collapsed" attribute
     */
    void unsetCollapsed();
}
