/*
 * XML Type:  file-desc
 * Namespace: http://www.bea.com/2003/05/xmlbean/ltgfmt
 * Java type: org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.ltgfmt.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML file-desc(@http://www.bea.com/2003/05/xmlbean/ltgfmt).
 *
 * This is a complex type.
 */
public class FileDescImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc {
    private static final long serialVersionUID = 1L;

    public FileDescImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.bea.com/2003/05/xmlbean/ltgfmt", "code"),
        new QName("", "tsDir"),
        new QName("", "folder"),
        new QName("", "fileName"),
        new QName("", "role"),
        new QName("", "validity"),
    };


    /**
     * Gets the "code" element
     */
    public org.apache.xmlbeans.impl.xb.ltgfmt.Code getCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.ltgfmt.Code target = null;
            target = (org.apache.xmlbeans.impl.xb.ltgfmt.Code)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "code" element
     */
    public boolean isSetCode() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "code" element
     */
    public void setCode(org.apache.xmlbeans.impl.xb.ltgfmt.Code code) {
        generatedSetterHelperImpl(code, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "code" element
     */
    public org.apache.xmlbeans.impl.xb.ltgfmt.Code addNewCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.ltgfmt.Code target = null;
            target = (org.apache.xmlbeans.impl.xb.ltgfmt.Code)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "code" element
     */
    public void unsetCode() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "tsDir" attribute
     */
    public java.lang.String getTsDir() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "tsDir" attribute
     */
    public org.apache.xmlbeans.XmlToken xgetTsDir() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "tsDir" attribute
     */
    public boolean isSetTsDir() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "tsDir" attribute
     */
    public void setTsDir(java.lang.String tsDir) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(tsDir);
        }
    }

    /**
     * Sets (as xml) the "tsDir" attribute
     */
    public void xsetTsDir(org.apache.xmlbeans.XmlToken tsDir) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(tsDir);
        }
    }

    /**
     * Unsets the "tsDir" attribute
     */
    public void unsetTsDir() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "folder" attribute
     */
    public java.lang.String getFolder() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "folder" attribute
     */
    public org.apache.xmlbeans.XmlToken xgetFolder() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "folder" attribute
     */
    public boolean isSetFolder() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "folder" attribute
     */
    public void setFolder(java.lang.String folder) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(folder);
        }
    }

    /**
     * Sets (as xml) the "folder" attribute
     */
    public void xsetFolder(org.apache.xmlbeans.XmlToken folder) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(folder);
        }
    }

    /**
     * Unsets the "folder" attribute
     */
    public void unsetFolder() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "fileName" attribute
     */
    public java.lang.String getFileName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "fileName" attribute
     */
    public org.apache.xmlbeans.XmlToken xgetFileName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "fileName" attribute
     */
    public boolean isSetFileName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "fileName" attribute
     */
    public void setFileName(java.lang.String fileName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(fileName);
        }
    }

    /**
     * Sets (as xml) the "fileName" attribute
     */
    public void xsetFileName(org.apache.xmlbeans.XmlToken fileName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(fileName);
        }
    }

    /**
     * Unsets the "fileName" attribute
     */
    public void unsetFileName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "role" attribute
     */
    public org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role.Enum getRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : (org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "role" attribute
     */
    public org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role xgetRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role target = null;
            target = (org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "role" attribute
     */
    public boolean isSetRole() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "role" attribute
     */
    public void setRole(org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role.Enum role) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setEnumValue(role);
        }
    }

    /**
     * Sets (as xml) the "role" attribute
     */
    public void xsetRole(org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role role) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role target = null;
            target = (org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(role);
        }
    }

    /**
     * Unsets the "role" attribute
     */
    public void unsetRole() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "validity" attribute
     */
    public boolean getValidity() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "validity" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetValidity() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "validity" attribute
     */
    public boolean isSetValidity() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "validity" attribute
     */
    public void setValidity(boolean validity) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setBooleanValue(validity);
        }
    }

    /**
     * Sets (as xml) the "validity" attribute
     */
    public void xsetValidity(org.apache.xmlbeans.XmlBoolean validity) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(validity);
        }
    }

    /**
     * Unsets the "validity" attribute
     */
    public void unsetValidity() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }
    /**
     * An XML role(@).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc$Role.
     */
    public static class RoleImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role {
        private static final long serialVersionUID = 1L;

        public RoleImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected RoleImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
}
