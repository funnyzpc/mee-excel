/*
 * XML Type:  CT_WorkbookProtection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlBase64Binary;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_WorkbookProtection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTWorkbookProtectionImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection {
    private static final long serialVersionUID = 1L;

    public CTWorkbookProtectionImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "workbookPassword"),
        new QName("", "workbookPasswordCharacterSet"),
        new QName("", "revisionsPassword"),
        new QName("", "revisionsPasswordCharacterSet"),
        new QName("", "lockStructure"),
        new QName("", "lockWindows"),
        new QName("", "lockRevision"),
        new QName("", "revisionsAlgorithmName"),
        new QName("", "revisionsHashValue"),
        new QName("", "revisionsSaltValue"),
        new QName("", "revisionsSpinCount"),
        new QName("", "workbookAlgorithmName"),
        new QName("", "workbookHashValue"),
        new QName("", "workbookSaltValue"),
        new QName("", "workbookSpinCount"),
    };

    /**
     * Unsets the "revisionsPassword" attribute
     */
    @Override
    public void unsetRevisionsPassword() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "revisionsPasswordCharacterSet" attribute
     */
    @Override
    public String getRevisionsPasswordCharacterSet() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "revisionsPasswordCharacterSet" attribute
     */
    @Override
    public XmlString xgetRevisionsPasswordCharacterSet() {
        synchronized (monitor()) {
            check_orphaned();
            XmlString target = null;
            target = (XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "revisionsPasswordCharacterSet" attribute
     */
    @Override
    public boolean isSetRevisionsPasswordCharacterSet() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "revisionsPasswordCharacterSet" attribute
     */
    @Override
    public void setRevisionsPasswordCharacterSet(String revisionsPasswordCharacterSet) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(revisionsPasswordCharacterSet);
        }
    }

    /**
     * Sets (as xml) the "revisionsPasswordCharacterSet" attribute
     */
    @Override
    public void xsetRevisionsPasswordCharacterSet(XmlString revisionsPasswordCharacterSet) {
        synchronized (monitor()) {
            check_orphaned();
            XmlString target = null;
            target = (XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (XmlString)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(revisionsPasswordCharacterSet);
        }
    }

    /**
     * Unsets the "revisionsPasswordCharacterSet" attribute
     */
    @Override
    public void unsetRevisionsPasswordCharacterSet() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "lockStructure" attribute
     */
    @Override
    public boolean getLockStructure() {
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
     * Gets (as xml) the "lockStructure" attribute
     */
    @Override
    public XmlBoolean xgetLockStructure() {
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
     * True if has "lockStructure" attribute
     */
    @Override
    public boolean isSetLockStructure() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "lockStructure" attribute
     */
    @Override
    public void setLockStructure(boolean lockStructure) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setBooleanValue(lockStructure);
        }
    }

    /**
     * Sets (as xml) the "lockStructure" attribute
     */
    @Override
    public void xsetLockStructure(XmlBoolean lockStructure) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(lockStructure);
        }
    }

    /**
     * Unsets the "lockStructure" attribute
     */
    @Override
    public void unsetLockStructure() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "lockWindows" attribute
     */
    @Override
    public boolean getLockWindows() {
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
     * Gets (as xml) the "lockWindows" attribute
     */
    @Override
    public XmlBoolean xgetLockWindows() {
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
     * True if has "lockWindows" attribute
     */
    @Override
    public boolean isSetLockWindows() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "lockWindows" attribute
     */
    @Override
    public void setLockWindows(boolean lockWindows) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setBooleanValue(lockWindows);
        }
    }

    /**
     * Sets (as xml) the "lockWindows" attribute
     */
    @Override
    public void xsetLockWindows(XmlBoolean lockWindows) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(lockWindows);
        }
    }

    /**
     * Unsets the "lockWindows" attribute
     */
    @Override
    public void unsetLockWindows() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "lockRevision" attribute
     */
    @Override
    public boolean getLockRevision() {
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
     * Gets (as xml) the "lockRevision" attribute
     */
    @Override
    public XmlBoolean xgetLockRevision() {
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
     * True if has "lockRevision" attribute
     */
    @Override
    public boolean isSetLockRevision() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "lockRevision" attribute
     */
    @Override
    public void setLockRevision(boolean lockRevision) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setBooleanValue(lockRevision);
        }
    }

    /**
     * Sets (as xml) the "lockRevision" attribute
     */
    @Override
    public void xsetLockRevision(XmlBoolean lockRevision) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(lockRevision);
        }
    }

    /**
     * Unsets the "lockRevision" attribute
     */
    @Override
    public void unsetLockRevision() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "revisionsAlgorithmName" attribute
     */
    @Override
    public String getRevisionsAlgorithmName() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "revisionsAlgorithmName" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetRevisionsAlgorithmName() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "revisionsAlgorithmName" attribute
     */
    @Override
    public boolean isSetRevisionsAlgorithmName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "revisionsAlgorithmName" attribute
     */
    @Override
    public void setRevisionsAlgorithmName(String revisionsAlgorithmName) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setStringValue(revisionsAlgorithmName);
        }
    }

    /**
     * Sets (as xml) the "revisionsAlgorithmName" attribute
     */
    @Override
    public void xsetRevisionsAlgorithmName(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring revisionsAlgorithmName) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(revisionsAlgorithmName);
        }
    }

    /**
     * Unsets the "revisionsAlgorithmName" attribute
     */
    @Override
    public void unsetRevisionsAlgorithmName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "revisionsHashValue" attribute
     */
    @Override
    public byte[] getRevisionsHashValue() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : target.getByteArrayValue();
        }
    }

    /**
     * Gets (as xml) the "revisionsHashValue" attribute
     */
    @Override
    public XmlBase64Binary xgetRevisionsHashValue() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBase64Binary target = null;
            target = (XmlBase64Binary)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "revisionsHashValue" attribute
     */
    @Override
    public boolean isSetRevisionsHashValue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "revisionsHashValue" attribute
     */
    @Override
    public void setRevisionsHashValue(byte[] revisionsHashValue) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setByteArrayValue(revisionsHashValue);
        }
    }

    /**
     * Sets (as xml) the "revisionsHashValue" attribute
     */
    @Override
    public void xsetRevisionsHashValue(XmlBase64Binary revisionsHashValue) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBase64Binary target = null;
            target = (XmlBase64Binary)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (XmlBase64Binary)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(revisionsHashValue);
        }
    }

    /**
     * Unsets the "revisionsHashValue" attribute
     */
    @Override
    public void unsetRevisionsHashValue() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "revisionsSaltValue" attribute
     */
    @Override
    public byte[] getRevisionsSaltValue() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? null : target.getByteArrayValue();
        }
    }

    /**
     * Gets (as xml) the "revisionsSaltValue" attribute
     */
    @Override
    public XmlBase64Binary xgetRevisionsSaltValue() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBase64Binary target = null;
            target = (XmlBase64Binary)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "revisionsSaltValue" attribute
     */
    @Override
    public boolean isSetRevisionsSaltValue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "revisionsSaltValue" attribute
     */
    @Override
    public void setRevisionsSaltValue(byte[] revisionsSaltValue) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setByteArrayValue(revisionsSaltValue);
        }
    }

    /**
     * Sets (as xml) the "revisionsSaltValue" attribute
     */
    @Override
    public void xsetRevisionsSaltValue(XmlBase64Binary revisionsSaltValue) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBase64Binary target = null;
            target = (XmlBase64Binary)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (XmlBase64Binary)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(revisionsSaltValue);
        }
    }

    /**
     * Unsets the "revisionsSaltValue" attribute
     */
    @Override
    public void unsetRevisionsSaltValue() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "revisionsSpinCount" attribute
     */
    @Override
    public long getRevisionsSpinCount() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "revisionsSpinCount" attribute
     */
    @Override
    public XmlUnsignedInt xgetRevisionsSpinCount() {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * True if has "revisionsSpinCount" attribute
     */
    @Override
    public boolean isSetRevisionsSpinCount() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "revisionsSpinCount" attribute
     */
    @Override
    public void setRevisionsSpinCount(long revisionsSpinCount) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setLongValue(revisionsSpinCount);
        }
    }

    /**
     * Sets (as xml) the "revisionsSpinCount" attribute
     */
    @Override
    public void xsetRevisionsSpinCount(XmlUnsignedInt revisionsSpinCount) {
        synchronized (monitor()) {
            check_orphaned();
            XmlUnsignedInt target = null;
            target = (XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(revisionsSpinCount);
        }
    }

    /**
     * Unsets the "revisionsSpinCount" attribute
     */
    @Override
    public void unsetRevisionsSpinCount() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "workbookAlgorithmName" attribute
     */
    @Override
    public String getWorkbookAlgorithmName() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "workbookAlgorithmName" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetWorkbookAlgorithmName() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }






}
