/*
 * XML Type:  CT_Row
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow
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
 * An XML CT_Row(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRow extends XmlObject {
    DocumentFactory<CTRow> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctrowdd39type");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "c" elements
     */
    java.util.List<CTCell> getCList();

    /**
     * Gets array of all "c" elements
     */
    CTCell[] getCArray();

    /**
     * Gets ith "c" element
     */
    CTCell getCArray(int i);

    /**
     * Returns number of "c" element
     */
    int sizeOfCArray();

    /**
     * Sets array of all "c" element
     */
    void setCArray(CTCell[] cArray);

    /**
     * Sets ith "c" element
     */
    void setCArray(int i, CTCell c);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "c" element
     */
    CTCell insertNewC(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "c" element
     */
    CTCell addNewC();

    /**
     * Removes the ith "c" element
     */
    void removeC(int i);
//
//    /**
//     * Gets the "extLst" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();

    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

//    /**
//     * Sets the "extLst" element
//     */
//    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);

//    /**
//     * Appends and returns a new empty "extLst" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();

    /**
     * Gets the "r" attribute
     */
    long getR();

    /**
     * Gets (as xml) the "r" attribute
     */
    XmlUnsignedInt xgetR();

    /**
     * True if has "r" attribute
     */
    boolean isSetR();

    /**
     * Sets the "r" attribute
     */
    void setR(long r);

    /**
     * Sets (as xml) the "r" attribute
     */
    void xsetR(XmlUnsignedInt r);

    /**
     * Unsets the "r" attribute
     */
    void unsetR();

    /**
     * Gets the "spans" attribute
     */
    java.util.List getSpans();

//    /**
//     * Gets (as xml) the "spans" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans xgetSpans();

    /**
     * True if has "spans" attribute
     */
    boolean isSetSpans();

    /**
     * Sets the "spans" attribute
     */
    void setSpans(java.util.List spans);

//    /**
//     * Sets (as xml) the "spans" attribute
//     */
//    void xsetSpans(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans spans);

    /**
     * Unsets the "spans" attribute
     */
    void unsetSpans();

    /**
     * Gets the "s" attribute
     */
    long getS();

    /**
     * Gets (as xml) the "s" attribute
     */
    XmlUnsignedInt xgetS();

    /**
     * True if has "s" attribute
     */
    boolean isSetS();

    /**
     * Sets the "s" attribute
     */
    void setS(long s);

    /**
     * Sets (as xml) the "s" attribute
     */
    void xsetS(XmlUnsignedInt s);

    /**
     * Unsets the "s" attribute
     */
    void unsetS();

    /**
     * Gets the "customFormat" attribute
     */
    boolean getCustomFormat();

    /**
     * Gets (as xml) the "customFormat" attribute
     */
    XmlBoolean xgetCustomFormat();

    /**
     * True if has "customFormat" attribute
     */
    boolean isSetCustomFormat();

    /**
     * Sets the "customFormat" attribute
     */
    void setCustomFormat(boolean customFormat);

    /**
     * Sets (as xml) the "customFormat" attribute
     */
    void xsetCustomFormat(XmlBoolean customFormat);

    /**
     * Unsets the "customFormat" attribute
     */
    void unsetCustomFormat();

    /**
     * Gets the "ht" attribute
     */
    double getHt();

    /**
     * Gets (as xml) the "ht" attribute
     */
    XmlDouble xgetHt();

    /**
     * True if has "ht" attribute
     */
    boolean isSetHt();

    /**
     * Sets the "ht" attribute
     */
    void setHt(double ht);

    /**
     * Sets (as xml) the "ht" attribute
     */
    void xsetHt(XmlDouble ht);

    /**
     * Unsets the "ht" attribute
     */
    void unsetHt();

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
     * Gets the "customHeight" attribute
     */
    boolean getCustomHeight();

    /**
     * Gets (as xml) the "customHeight" attribute
     */
    XmlBoolean xgetCustomHeight();

    /**
     * True if has "customHeight" attribute
     */
    boolean isSetCustomHeight();

    /**
     * Sets the "customHeight" attribute
     */
    void setCustomHeight(boolean customHeight);

    /**
     * Sets (as xml) the "customHeight" attribute
     */
    void xsetCustomHeight(XmlBoolean customHeight);

    /**
     * Unsets the "customHeight" attribute
     */
    void unsetCustomHeight();

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

    /**
     * Gets the "thickTop" attribute
     */
    boolean getThickTop();

    /**
     * Gets (as xml) the "thickTop" attribute
     */
    XmlBoolean xgetThickTop();

    /**
     * True if has "thickTop" attribute
     */
    boolean isSetThickTop();

    /**
     * Sets the "thickTop" attribute
     */
    void setThickTop(boolean thickTop);

    /**
     * Sets (as xml) the "thickTop" attribute
     */
    void xsetThickTop(XmlBoolean thickTop);

    /**
     * Unsets the "thickTop" attribute
     */
    void unsetThickTop();

    /**
     * Gets the "thickBot" attribute
     */
    boolean getThickBot();

    /**
     * Gets (as xml) the "thickBot" attribute
     */
    XmlBoolean xgetThickBot();

    /**
     * True if has "thickBot" attribute
     */
    boolean isSetThickBot();

    /**
     * Sets the "thickBot" attribute
     */
    void setThickBot(boolean thickBot);

    /**
     * Sets (as xml) the "thickBot" attribute
     */
    void xsetThickBot(XmlBoolean thickBot);

    /**
     * Unsets the "thickBot" attribute
     */
    void unsetThickBot();

    /**
     * Gets the "ph" attribute
     */
    boolean getPh();

    /**
     * Gets (as xml) the "ph" attribute
     */
    XmlBoolean xgetPh();

    /**
     * True if has "ph" attribute
     */
    boolean isSetPh();

    /**
     * Sets the "ph" attribute
     */
    void setPh(boolean ph);

    /**
     * Sets (as xml) the "ph" attribute
     */
    void xsetPh(XmlBoolean ph);

    /**
     * Unsets the "ph" attribute
     */
    void unsetPh();
}
