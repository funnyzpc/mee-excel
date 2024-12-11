/*
 * XML Type:  CT_DefinedName
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.values.JavaStringHolderEx;

import javax.xml.namespace.QName;

/**
 * An XML CT_DefinedName(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName.
 */
public class CTDefinedNameImpl extends JavaStringHolderEx implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName {
    private static final long serialVersionUID = 1L;

    public CTDefinedNameImpl(SchemaType sType) {
        super(sType, true);
    }

    protected CTDefinedNameImpl(SchemaType sType, boolean b) {
        super(sType, b);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "name"),
        new QName("", "comment"),
        new QName("", "customMenu"),
        new QName("", "description"),
        new QName("", "help"),
        new QName("", "statusBar"),
        new QName("", "localSheetId"),
        new QName("", "hidden"),
        new QName("", "function"),
        new QName("", "vbProcedure"),
        new QName("", "xlm"),
        new QName("", "functionGroupId"),
        new QName("", "shortcutKey"),
        new QName("", "publishToServer"),
        new QName("", "workbookParameter"),
    };


    /**
     * Gets the "name" attribute
     */
    @Override
    public String getName() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "name" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetName() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "name" attribute
     */
    @Override
    public void setName(String name) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(name);
        }
    }

    /**
     * Sets (as xml) the "name" attribute
     */
    @Override
    public void xsetName(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring name) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(name);
        }
    }

    /**
     * Gets the "comment" attribute
     */
    @Override
    public String getComment() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "comment" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetComment() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "comment" attribute
     */
    @Override
    public boolean isSetComment() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "comment" attribute
     */
    @Override
    public void setComment(String comment) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(comment);
        }
    }

    /**
     * Gets the "description" attribute
     */
    @Override
    public String getDescription() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "description" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "description" attribute
     */
    @Override
    public boolean isSetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "description" attribute
     */
    @Override
    public void setDescription(String description) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(description);
        }
    }

    /**
     * Sets (as xml) the "description" attribute
     */
    @Override
    public void xsetDescription(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring description) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(description);
        }
    }

    /**
     * Unsets the "description" attribute
     */
    @Override
    public void unsetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "help" attribute
     */
    @Override
    public String getHelp() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "help" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetHelp() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "help" attribute
     */
    @Override
    public boolean isSetHelp() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "help" attribute
     */
    @Override
    public void setHelp(String help) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(help);
        }
    }

    /**
     * Gets the "localSheetId" attribute
     */
    @Override
    public long getLocalSheetId() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "localSheetId" attribute
     */
    @Override
    public XmlUnsignedInt xgetLocalSheetId() {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "localSheetId" attribute
     */
    @Override
    public boolean isSetLocalSheetId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "localSheetId" attribute
     */
    @Override
    public void setLocalSheetId(long localSheetId) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setLongValue(localSheetId);
        }
    }

    /**
     * Sets (as xml) the "localSheetId" attribute
     */
    @Override
    public void xsetLocalSheetId(XmlUnsignedInt localSheetId) {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(localSheetId);
        }
    }

    /**
     * Unsets the "localSheetId" attribute
     */
    @Override
    public void unsetLocalSheetId() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "hidden" attribute
     */
    @Override
    public boolean getHidden() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[7]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "hidden" attribute
     */
    @Override
    public XmlBoolean xgetHidden() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[7]);
            }
            return target;
        }
    }

    /**
     * True if has "hidden" attribute
     */
    @Override
    public boolean isSetHidden() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "hidden" attribute
     */
    @Override
    public void setHidden(boolean hidden) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setBooleanValue(hidden);
        }
    }

    /**
     * Sets (as xml) the "hidden" attribute
     */
    @Override
    public void xsetHidden(XmlBoolean hidden) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(hidden);
        }
    }

    /**
     * Unsets the "hidden" attribute
     */
    @Override
    public void unsetHidden() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "function" attribute
     */
    @Override
    public boolean getFunction() {
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
     * Gets (as xml) the "function" attribute
     */
    @Override
    public XmlBoolean xgetFunction() {
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
     * True if has "function" attribute
     */
    @Override
    public boolean isSetFunction() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "function" attribute
     */
    @Override
    public void setFunction(boolean function) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setBooleanValue(function);
        }
    }

    /**
     * Sets the "xlm" attribute
     */
    @Override
    public void setXlm(boolean xlm) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setBooleanValue(xlm);
        }
    }

    /**
     * Sets (as xml) the "xlm" attribute
     */
    @Override
    public void xsetXlm(XmlBoolean xlm) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(xlm);
        }
    }

    /**
     * Unsets the "xlm" attribute
     */
    @Override
    public void unsetXlm() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "functionGroupId" attribute
     */
    @Override
    public long getFunctionGroupId() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "functionGroupId" attribute
     */
    @Override
    public XmlUnsignedInt xgetFunctionGroupId() {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * True if has "functionGroupId" attribute
     */
    @Override
    public boolean isSetFunctionGroupId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "functionGroupId" attribute
     */
    @Override
    public void setFunctionGroupId(long functionGroupId) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setLongValue(functionGroupId);
        }
    }

}
