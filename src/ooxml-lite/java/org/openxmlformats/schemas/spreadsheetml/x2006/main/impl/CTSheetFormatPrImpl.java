/*
 * XML Type:  CT_SheetFormatPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlDouble;
import poi.org.apache.xmlbeans.XmlUnsignedByte;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_SheetFormatPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetFormatPrImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr {
    private static final long serialVersionUID = 1L;

    public CTSheetFormatPrImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "baseColWidth"),
        new QName("", "defaultColWidth"),
        new QName("", "defaultRowHeight"),
        new QName("", "customHeight"),
        new QName("", "zeroHeight"),
        new QName("", "thickTop"),
        new QName("", "thickBottom"),
        new QName("", "outlineLevelRow"),
        new QName("", "outlineLevelCol"),
    };


    /**
     * Gets the "baseColWidth" attribute
     */
    @Override
    public long getBaseColWidth() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "baseColWidth" attribute
     */
    @Override
    public XmlUnsignedInt xgetBaseColWidth() {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (XmlUnsignedInt)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "baseColWidth" attribute
     */
    @Override
    public boolean isSetBaseColWidth() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "baseColWidth" attribute
     */
    @Override
    public void setBaseColWidth(long baseColWidth) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setLongValue(baseColWidth);
        }
    }

    /**
     * Sets (as xml) the "baseColWidth" attribute
     */
    @Override
    public void xsetBaseColWidth(XmlUnsignedInt baseColWidth) {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(baseColWidth);
        }
    }

    /**
     * Unsets the "baseColWidth" attribute
     */
    @Override
    public void unsetBaseColWidth() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "defaultColWidth" attribute
     */
    @Override
    public double getDefaultColWidth() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "defaultColWidth" attribute
     */
    @Override
    public XmlDouble xgetDefaultColWidth() {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "defaultColWidth" attribute
     */
    @Override
    public boolean isSetDefaultColWidth() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "defaultColWidth" attribute
     */
    @Override
    public void setDefaultColWidth(double defaultColWidth) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setDoubleValue(defaultColWidth);
        }
    }

    /**
     * Sets (as xml) the "defaultColWidth" attribute
     */
    @Override
    public void xsetDefaultColWidth(XmlDouble defaultColWidth) {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(defaultColWidth);
        }
    }

    /**
     * Unsets the "defaultColWidth" attribute
     */
    @Override
    public void unsetDefaultColWidth() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "defaultRowHeight" attribute
     */
    @Override
    public double getDefaultRowHeight() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "defaultRowHeight" attribute
     */
    @Override
    public XmlDouble xgetDefaultRowHeight() {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Sets the "defaultRowHeight" attribute
     */
    @Override
    public void setDefaultRowHeight(double defaultRowHeight) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setDoubleValue(defaultRowHeight);
        }
    }

    /**
     * Sets (as xml) the "defaultRowHeight" attribute
     */
    @Override
    public void xsetDefaultRowHeight(XmlDouble defaultRowHeight) {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(defaultRowHeight);
        }
    }

    /**
     * Gets the "customHeight" attribute
     */
    @Override
    public boolean getCustomHeight() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "customHeight" attribute
     */
    @Override
    public XmlBoolean xgetCustomHeight() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return target;
        }
    }

    /**
     * True if has "customHeight" attribute
     */
    @Override
    public boolean isSetCustomHeight() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "customHeight" attribute
     */
    @Override
    public void setCustomHeight(boolean customHeight) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setBooleanValue(customHeight);
        }
    }

    /**
     * Sets (as xml) the "customHeight" attribute
     */
    @Override
    public void xsetCustomHeight(XmlBoolean customHeight) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(customHeight);
        }
    }

    /**
     * Unsets the "customHeight" attribute
     */
    @Override
    public void unsetCustomHeight() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "zeroHeight" attribute
     */
    @Override
    public boolean getZeroHeight() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[4]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "zeroHeight" attribute
     */
    @Override
    public XmlBoolean xgetZeroHeight() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[4]);
            }
            return target;
        }
    }

    /**
     * True if has "zeroHeight" attribute
     */
    @Override
    public boolean isSetZeroHeight() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "zeroHeight" attribute
     */
    @Override
    public void setZeroHeight(boolean zeroHeight) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setBooleanValue(zeroHeight);
        }
    }

    /**
     * Sets (as xml) the "zeroHeight" attribute
     */
    @Override
    public void xsetZeroHeight(XmlBoolean zeroHeight) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(zeroHeight);
        }
    }

    /**
     * Unsets the "zeroHeight" attribute
     */
    @Override
    public void unsetZeroHeight() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "thickTop" attribute
     */
    @Override
    public boolean getThickTop() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[5]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "thickTop" attribute
     */
    @Override
    public XmlBoolean xgetThickTop() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[5]);
            }
            return target;
        }
    }

    /**
     * True if has "thickTop" attribute
     */
    @Override
    public boolean isSetThickTop() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "thickTop" attribute
     */
    @Override
    public void setThickTop(boolean thickTop) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setBooleanValue(thickTop);
        }
    }

    /**
     * Sets (as xml) the "thickTop" attribute
     */
    @Override
    public void xsetThickTop(XmlBoolean thickTop) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(thickTop);
        }
    }

    /**
     * Unsets the "thickTop" attribute
     */
    @Override
    public void unsetThickTop() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "thickBottom" attribute
     */
    @Override
    public boolean getThickBottom() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[6]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "thickBottom" attribute
     */
    @Override
    public XmlBoolean xgetThickBottom() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[6]);
            }
            return target;
        }
    }

    /**
     * True if has "thickBottom" attribute
     */
    @Override
    public boolean isSetThickBottom() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "thickBottom" attribute
     */
    @Override
    public void setThickBottom(boolean thickBottom) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setBooleanValue(thickBottom);
        }
    }

    /**
     * Sets (as xml) the "thickBottom" attribute
     */
    @Override
    public void xsetThickBottom(XmlBoolean thickBottom) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(thickBottom);
        }
    }

    /**
     * Unsets the "thickBottom" attribute
     */
    @Override
    public void unsetThickBottom() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "outlineLevelRow" attribute
     */
    @Override
    public short getOutlineLevelRow() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[7]);
            }
            return (target == null) ? 0 : target.getShortValue();
        }
    }

    /**
     * Gets (as xml) the "outlineLevelRow" attribute
     */
    @Override
    public XmlUnsignedByte xgetOutlineLevelRow() {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedByte target = null;
            target = (XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (XmlUnsignedByte)get_default_attribute_value(PROPERTY_QNAME[7]);
            }
            return target;
        }
    }

    /**
     * True if has "outlineLevelRow" attribute
     */
    @Override
    public boolean isSetOutlineLevelRow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "outlineLevelRow" attribute
     */
    @Override
    public void setOutlineLevelRow(short outlineLevelRow) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setShortValue(outlineLevelRow);
        }
    }

    /**
     * Sets (as xml) the "outlineLevelRow" attribute
     */
    @Override
    public void xsetOutlineLevelRow(XmlUnsignedByte outlineLevelRow) {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedByte target = null;
            target = (XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (XmlUnsignedByte)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(outlineLevelRow);
        }
    }

    /**
     * Unsets the "outlineLevelRow" attribute
     */
    @Override
    public void unsetOutlineLevelRow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "outlineLevelCol" attribute
     */
    @Override
    public short getOutlineLevelCol() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[8]);
            }
            return (target == null) ? 0 : target.getShortValue();
        }
    }

    /**
     * Gets (as xml) the "outlineLevelCol" attribute
     */
    @Override
    public XmlUnsignedByte xgetOutlineLevelCol() {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedByte target = null;
            target = (XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (XmlUnsignedByte)get_default_attribute_value(PROPERTY_QNAME[8]);
            }
            return target;
        }
    }

    /**
     * True if has "outlineLevelCol" attribute
     */
    @Override
    public boolean isSetOutlineLevelCol() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "outlineLevelCol" attribute
     */
    @Override
    public void setOutlineLevelCol(short outlineLevelCol) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setShortValue(outlineLevelCol);
        }
    }

    /**
     * Sets (as xml) the "outlineLevelCol" attribute
     */
    @Override
    public void xsetOutlineLevelCol(XmlUnsignedByte outlineLevelCol) {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedByte target = null;
            target = (XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (XmlUnsignedByte)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(outlineLevelCol);
        }
    }

    /**
     * Unsets the "outlineLevelCol" attribute
     */
    @Override
    public void unsetOutlineLevelCol() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }
}
