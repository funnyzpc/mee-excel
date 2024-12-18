/*
 * XML Type:  CT_HeaderFooter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_HeaderFooter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTHeaderFooter extends XmlObject {
    DocumentFactory<CTHeaderFooter> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctheaderfooter90d1type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "oddHeader" element
     */
    String getOddHeader();

    /**
     * Gets (as xml) the "oddHeader" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetOddHeader();

    /**
     * True if has "oddHeader" element
     */
    boolean isSetOddHeader();

    /**
     * Sets the "oddHeader" element
     */
    void setOddHeader(String oddHeader);

    /**
     * Sets (as xml) the "oddHeader" element
     */
    void xsetOddHeader(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring oddHeader);

    /**
     * Unsets the "oddHeader" element
     */
    void unsetOddHeader();

    /**
     * Gets the "oddFooter" element
     */
    String getOddFooter();

    /**
     * Gets (as xml) the "oddFooter" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetOddFooter();

    /**
     * True if has "oddFooter" element
     */
    boolean isSetOddFooter();

    /**
     * Sets the "oddFooter" element
     */
    void setOddFooter(String oddFooter);

    /**
     * Sets (as xml) the "oddFooter" element
     */
    void xsetOddFooter(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring oddFooter);

    /**
     * Unsets the "oddFooter" element
     */
    void unsetOddFooter();

    /**
     * Gets the "evenHeader" element
     */
    String getEvenHeader();

    /**
     * Gets (as xml) the "evenHeader" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetEvenHeader();

    /**
     * True if has "evenHeader" element
     */
    boolean isSetEvenHeader();

    /**
     * Sets the "evenHeader" element
     */
    void setEvenHeader(String evenHeader);

    /**
     * Sets (as xml) the "evenHeader" element
     */
    void xsetEvenHeader(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring evenHeader);

    /**
     * Unsets the "evenHeader" element
     */
    void unsetEvenHeader();

    /**
     * Gets the "evenFooter" element
     */
    String getEvenFooter();

    /**
     * Gets (as xml) the "evenFooter" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetEvenFooter();

    /**
     * True if has "evenFooter" element
     */
    boolean isSetEvenFooter();

    /**
     * Sets the "evenFooter" element
     */
    void setEvenFooter(String evenFooter);

    /**
     * Sets (as xml) the "evenFooter" element
     */
    void xsetEvenFooter(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring evenFooter);

    /**
     * Unsets the "evenFooter" element
     */
    void unsetEvenFooter();

    /**
     * Gets the "firstHeader" element
     */
    String getFirstHeader();

    /**
     * Gets (as xml) the "firstHeader" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetFirstHeader();

    /**
     * True if has "firstHeader" element
     */
    boolean isSetFirstHeader();

    /**
     * Sets the "firstHeader" element
     */
    void setFirstHeader(String firstHeader);

    /**
     * Sets (as xml) the "firstHeader" element
     */
    void xsetFirstHeader(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring firstHeader);

    /**
     * Unsets the "firstHeader" element
     */
    void unsetFirstHeader();

    /**
     * Gets the "firstFooter" element
     */
    String getFirstFooter();

    /**
     * Gets (as xml) the "firstFooter" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetFirstFooter();

    /**
     * True if has "firstFooter" element
     */
    boolean isSetFirstFooter();

    /**
     * Sets the "firstFooter" element
     */
    void setFirstFooter(String firstFooter);

    /**
     * Sets (as xml) the "firstFooter" element
     */
    void xsetFirstFooter(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring firstFooter);

    /**
     * Unsets the "firstFooter" element
     */
    void unsetFirstFooter();

    /**
     * Gets the "differentOddEven" attribute
     */
    boolean getDifferentOddEven();

    /**
     * Gets (as xml) the "differentOddEven" attribute
     */
    XmlBoolean xgetDifferentOddEven();

    /**
     * True if has "differentOddEven" attribute
     */
    boolean isSetDifferentOddEven();

    /**
     * Sets the "differentOddEven" attribute
     */
    void setDifferentOddEven(boolean differentOddEven);

    /**
     * Sets (as xml) the "differentOddEven" attribute
     */
    void xsetDifferentOddEven(XmlBoolean differentOddEven);

    /**
     * Unsets the "differentOddEven" attribute
     */
    void unsetDifferentOddEven();

    /**
     * Gets the "differentFirst" attribute
     */
    boolean getDifferentFirst();

    /**
     * Gets (as xml) the "differentFirst" attribute
     */
    XmlBoolean xgetDifferentFirst();

    /**
     * True if has "differentFirst" attribute
     */
    boolean isSetDifferentFirst();

    /**
     * Sets the "differentFirst" attribute
     */
    void setDifferentFirst(boolean differentFirst);

    /**
     * Sets (as xml) the "differentFirst" attribute
     */
    void xsetDifferentFirst(XmlBoolean differentFirst);

    /**
     * Unsets the "differentFirst" attribute
     */
    void unsetDifferentFirst();

    /**
     * Gets the "scaleWithDoc" attribute
     */
    boolean getScaleWithDoc();

    /**
     * Gets (as xml) the "scaleWithDoc" attribute
     */
    XmlBoolean xgetScaleWithDoc();

    /**
     * True if has "scaleWithDoc" attribute
     */
    boolean isSetScaleWithDoc();

    /**
     * Sets the "scaleWithDoc" attribute
     */
    void setScaleWithDoc(boolean scaleWithDoc);

    /**
     * Sets (as xml) the "scaleWithDoc" attribute
     */
    void xsetScaleWithDoc(XmlBoolean scaleWithDoc);

    /**
     * Unsets the "scaleWithDoc" attribute
     */
    void unsetScaleWithDoc();

    /**
     * Gets the "alignWithMargins" attribute
     */
    boolean getAlignWithMargins();

    /**
     * Gets (as xml) the "alignWithMargins" attribute
     */
    XmlBoolean xgetAlignWithMargins();

    /**
     * True if has "alignWithMargins" attribute
     */
    boolean isSetAlignWithMargins();

    /**
     * Sets the "alignWithMargins" attribute
     */
    void setAlignWithMargins(boolean alignWithMargins);

    /**
     * Sets (as xml) the "alignWithMargins" attribute
     */
    void xsetAlignWithMargins(XmlBoolean alignWithMargins);

    /**
     * Unsets the "alignWithMargins" attribute
     */
    void unsetAlignWithMargins();
}
