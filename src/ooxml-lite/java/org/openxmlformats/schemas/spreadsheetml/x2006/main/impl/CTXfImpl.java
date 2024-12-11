/*
 * XML Type:  CT_Xf
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * An XML CT_Xf(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTXfImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf {
    private static final long serialVersionUID = 1L;

    public CTXfImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "alignment"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "protection"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
        new QName("", "numFmtId"),
        new QName("", "fontId"),
        new QName("", "fillId"),
        new QName("", "borderId"),
        new QName("", "xfId"),
        new QName("", "quotePrefix"),
        new QName("", "pivotButton"),
        new QName("", "applyNumberFormat"),
        new QName("", "applyFont"),
        new QName("", "applyFill"),
        new QName("", "applyBorder"),
        new QName("", "applyAlignment"),
        new QName("", "applyProtection"),
    };


    /**
     * Gets the "alignment" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment getAlignment() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "alignment" element
     */
    @Override
    public boolean isSetAlignment() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "alignment" element
     */
    @Override
    public void setAlignment(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment alignment) {
        generatedSetterHelperImpl(alignment, PROPERTY_QNAME[0], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "alignment" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment addNewAlignment() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "alignment" element
     */
    @Override
    public void unsetAlignment() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "protection" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection getProtection() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "protection" element
     */
    @Override
    public boolean isSetProtection() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "protection" element
     */
    @Override
    public void setProtection(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection protection) {
        generatedSetterHelperImpl(protection, PROPERTY_QNAME[1], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "protection" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection addNewProtection() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "numFmtId" attribute
     */
    @Override
    public long getNumFmtId() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * True if has "numFmtId" attribute
     */
    @Override
    public boolean isSetNumFmtId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "numFmtId" attribute
     */
    @Override
    public void setNumFmtId(long numFmtId) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setLongValue(numFmtId);
        }
    }

    /**
     * Unsets the "numFmtId" attribute
     */
    @Override
    public void unsetNumFmtId() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "fontId" attribute
     */
    @Override
    public long getFontId() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * True if has "fontId" attribute
     */
    @Override
    public boolean isSetFontId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "fontId" attribute
     */
    @Override
    public void setFontId(long fontId) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setLongValue(fontId);
        }
    }


    /**
     * Gets the "fillId" attribute
     */
    @Override
    public long getFillId() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * True if has "fillId" attribute
     */
    @Override
    public boolean isSetFillId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "fillId" attribute
     */
    @Override
    public void setFillId(long fillId) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setLongValue(fillId);
        }
    }
    /**
     * Gets the "borderId" attribute
     */
    @Override
    public long getBorderId() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }



    /**
     * Sets the "borderId" attribute
     */
    @Override
    public void setBorderId(long borderId) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setLongValue(borderId);
        }
    }

    /**
     * Gets the "xfId" attribute
     */
    @Override
    public long getXfId() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Sets the "xfId" attribute
     */
    @Override
    public void setXfId(long xfId) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setLongValue(xfId);
        }
    }

    /**
     * Gets the "quotePrefix" attribute
     */
    @Override
    public boolean getQuotePrefix() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[8]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "quotePrefix" attribute
     */
    @Override
    public XmlBoolean xgetQuotePrefix() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[8]);
            }
            return target;
        }
    }

    /**
     * True if has "quotePrefix" attribute
     */
    @Override
    public boolean isSetQuotePrefix() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "quotePrefix" attribute
     */
    @Override
    public void setQuotePrefix(boolean quotePrefix) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setBooleanValue(quotePrefix);
        }
    }

    /**
     * Sets the "applyNumberFormat" attribute
     */
    @Override
    public void setApplyNumberFormat(boolean applyNumberFormat) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setBooleanValue(applyNumberFormat);
        }
    }

    /**
     * Sets (as xml) the "applyNumberFormat" attribute
     */
    @Override
    public void xsetApplyNumberFormat(XmlBoolean applyNumberFormat) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(applyNumberFormat);
        }
    }

    /**
     * Unsets the "applyNumberFormat" attribute
     */
    @Override
    public void unsetApplyNumberFormat() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "applyFont" attribute
     */
    @Override
    public boolean getApplyFont() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "applyFont" attribute
     */
    @Override
    public XmlBoolean xgetApplyFont() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * True if has "applyFont" attribute
     */
    @Override
    public boolean isSetApplyFont() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "applyFont" attribute
     */
    @Override
    public void setApplyFont(boolean applyFont) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setBooleanValue(applyFont);
        }
    }

    /**
     * Sets (as xml) the "applyFont" attribute
     */
    @Override
    public void xsetApplyFont(XmlBoolean applyFont) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(applyFont);
        }
    }

    /**
     * Unsets the "applyFont" attribute
     */
    @Override
    public void unsetApplyFont() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "applyFill" attribute
     */
    @Override
    public boolean getApplyFill() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "applyFill" attribute
     */
    @Override
    public XmlBoolean xgetApplyFill() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "applyFill" attribute
     */
    @Override
    public boolean isSetApplyFill() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "applyFill" attribute
     */
    @Override
    public void setApplyFill(boolean applyFill) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setBooleanValue(applyFill);
        }
    }

    /**
     * Sets (as xml) the "applyFill" attribute
     */
    @Override
    public void xsetApplyFill(XmlBoolean applyFill) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(applyFill);
        }
    }

    /**
     * Unsets the "applyFill" attribute
     */
    @Override
    public void unsetApplyFill() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "applyBorder" attribute
     */
    @Override
    public boolean getApplyBorder() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "applyBorder" attribute
     */
    @Override
    public XmlBoolean xgetApplyBorder() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "applyBorder" attribute
     */
    @Override
    public boolean isSetApplyBorder() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "applyBorder" attribute
     */
    @Override
    public void setApplyBorder(boolean applyBorder) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setBooleanValue(applyBorder);
        }
    }

    /**
     * Sets (as xml) the "applyBorder" attribute
     */
    @Override
    public void xsetApplyBorder(XmlBoolean applyBorder) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(applyBorder);
        }
    }

    /**
     * Unsets the "applyBorder" attribute
     */
    @Override
    public void unsetApplyBorder() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Gets the "applyAlignment" attribute
     */
    @Override
    public boolean getApplyAlignment() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "applyAlignment" attribute
     */
    @Override
    public XmlBoolean xgetApplyAlignment() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * True if has "applyAlignment" attribute
     */
    @Override
    public boolean isSetApplyAlignment() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
        }
    }

    /**
     * Sets the "applyAlignment" attribute
     */
    @Override
    public void setApplyAlignment(boolean applyAlignment) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.setBooleanValue(applyAlignment);
        }
    }


}
