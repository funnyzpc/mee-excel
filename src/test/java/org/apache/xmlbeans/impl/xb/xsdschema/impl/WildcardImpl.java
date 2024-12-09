/*
 * XML Type:  wildcard
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Wildcard
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML wildcard(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class WildcardImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.Wildcard {
    private static final long serialVersionUID = 1L;

    public WildcardImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "namespace"),
        new QName("", "processContents"),
    };


    /**
     * Gets the "namespace" attribute
     */
    public java.lang.Object getNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "namespace" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList xgetNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "namespace" attribute
     */
    public boolean isSetNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "namespace" attribute
     */
    public void setNamespace(java.lang.Object namespace) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setObjectValue(namespace);
        }
    }

    /**
     * Sets (as xml) the "namespace" attribute
     */
    public void xsetNamespace(org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList namespace) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(namespace);
        }
    }

    /**
     * Unsets the "namespace" attribute
     */
    public void unsetNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "processContents" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents.Enum getProcessContents() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return (target == null) ? null : (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "processContents" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents xgetProcessContents() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return target;
        }
    }

    /**
     * True if has "processContents" attribute
     */
    public boolean isSetProcessContents() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "processContents" attribute
     */
    public void setProcessContents(org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents.Enum processContents) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(processContents);
        }
    }

    /**
     * Sets (as xml) the "processContents" attribute
     */
    public void xsetProcessContents(org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents processContents) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(processContents);
        }
    }

    /**
     * Unsets the "processContents" attribute
     */
    public void unsetProcessContents() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
    /**
     * An XML processContents(@).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.Wildcard$ProcessContents.
     */
    public static class ProcessContentsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents {
        private static final long serialVersionUID = 1L;

        public ProcessContentsImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected ProcessContentsImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
}
