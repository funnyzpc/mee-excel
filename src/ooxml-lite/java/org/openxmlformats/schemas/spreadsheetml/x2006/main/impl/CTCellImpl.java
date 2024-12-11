/*
 * XML Type:  CT_Cell
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * An XML CT_Cell(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCellImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell {
    private static final long serialVersionUID = 1L;

    public CTCellImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "f"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "v"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "is"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
        new QName("", "r"),
        new QName("", "s"),
        new QName("", "t"),
        new QName("", "cm"),
        new QName("", "vm"),
        new QName("", "ph"),
    };


    /**
     * Gets the "f" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula getF() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "f" element
     */
    @Override
    public boolean isSetF() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "f" element
     */
    @Override
    public void setF(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula f) {
        generatedSetterHelperImpl(f, PROPERTY_QNAME[0], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "f" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula addNewF() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "f" element
     */
    @Override
    public void unsetF() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "v" element
     */
    @Override
    public String getV() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "v" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetV() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "v" element
     */
    @Override
    public boolean isSetV() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "v" element
     */
    @Override
    public void setV(String v) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(v);
        }
    }

    /**
     * Sets (as xml) the "v" element
     */
    @Override
    public void xsetV(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring v) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(v);
        }
    }

    /**
     * Unsets the "v" element
     */
    @Override
    public void unsetV() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "is" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst getIs() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "is" element
     */
    @Override
    public boolean isSetIs() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "is" element
     */
    @Override
    public void setIs(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst is) {
        generatedSetterHelperImpl(is, PROPERTY_QNAME[2], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "is" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst addNewIs() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "is" element
     */
    @Override
    public void unsetIs() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }


    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "r" attribute
     */
    @Override
    public String getR() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getStringValue();
        }
    }


    /**
     * True if has "r" attribute
     */
    @Override
    public boolean isSetR() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "r" attribute
     */
    @Override
    public void setR(String r) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(r);
        }
    }

    /**
     * Unsets the "r" attribute
     */
    @Override
    public void unsetR() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "s" attribute
     */
    @Override
    public long getS() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[5]);
            }
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "s" attribute
     */
    @Override
    public XmlUnsignedInt xgetS() {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (XmlUnsignedInt)get_default_attribute_value(PROPERTY_QNAME[5]);
            }
            return target;
        }
    }

    /**
     * True if has "s" attribute
     */
    @Override
    public boolean isSetS() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "s" attribute
     */
    @Override
    public void setS(long s) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setLongValue(s);
        }
    }

    /**
     * Sets (as xml) the "s" attribute
     */
    @Override
    public void xsetS(XmlUnsignedInt s) {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(s);
        }
    }

    /**
     * Unsets the "s" attribute
     */
    @Override
    public void unsetS() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "t" attribute
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.Enum getT() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[6]);
            }
            return (target == null) ? null : (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "t" attribute
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType xgetT() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_default_attribute_value(PROPERTY_QNAME[6]);
            }
            return target;
        }
    }

    /**
     * True if has "t" attribute
     */
    @Override
    public boolean isSetT() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "t" attribute
     */
    @Override
    public void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.Enum t) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setEnumValue(t);
        }
    }

    /**
     * Sets (as xml) the "t" attribute
     */
    @Override
    public void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType t) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(t);
        }
    }

    /**
     * Unsets the "t" attribute
     */
    @Override
    public void unsetT() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "cm" attribute
     */
    @Override
    public long getCm() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[7]);
            }
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "cm" attribute
     */
    @Override
    public XmlUnsignedInt xgetCm() {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (XmlUnsignedInt)get_default_attribute_value(PROPERTY_QNAME[7]);
            }
            return target;
        }
    }

    /**
     * True if has "cm" attribute
     */
    @Override
    public boolean isSetCm() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "cm" attribute
     */
    @Override
    public void setCm(long cm) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setLongValue(cm);
        }
    }

    /**
     * Sets (as xml) the "cm" attribute
     */
    @Override
    public void xsetCm(XmlUnsignedInt cm) {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(cm);
        }
    }

    /**
     * Unsets the "cm" attribute
     */
    @Override
    public void unsetCm() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "vm" attribute
     */
    @Override
    public long getVm() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[8]);
            }
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "vm" attribute
     */
    @Override
    public XmlUnsignedInt xgetVm() {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (XmlUnsignedInt)get_default_attribute_value(PROPERTY_QNAME[8]);
            }
            return target;
        }
    }

    /**
     * True if has "vm" attribute
     */
    @Override
    public boolean isSetVm() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "vm" attribute
     */
    @Override
    public void setVm(long vm) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setLongValue(vm);
        }
    }

    /**
     * Sets (as xml) the "vm" attribute
     */
    @Override
    public void xsetVm(XmlUnsignedInt vm) {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(vm);
        }
    }

    /**
     * Unsets the "vm" attribute
     */
    @Override
    public void unsetVm() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "ph" attribute
     */
    @Override
    public boolean getPh() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[9]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "ph" attribute
     */
    @Override
    public XmlBoolean xgetPh() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[9]);
            }
            return target;
        }
    }

    /**
     * True if has "ph" attribute
     */
    @Override
    public boolean isSetPh() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "ph" attribute
     */
    @Override
    public void setPh(boolean ph) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setBooleanValue(ph);
        }
    }

    /**
     * Sets (as xml) the "ph" attribute
     */
    @Override
    public void xsetPh(XmlBoolean ph) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(ph);
        }
    }

    /**
     * Unsets the "ph" attribute
     */
    @Override
    public void unsetPh() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }
}
