/*
 * An XML document type.
 * Localname: unique
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.UniqueDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one unique(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class UniqueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.UniqueDocument {
    private static final long serialVersionUID = 1L;

    public UniqueDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "unique"),
    };


    /**
     * Gets the "unique" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Keybase getUnique() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Keybase target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Keybase)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "unique" element
     */
    public void setUnique(org.apache.xmlbeans.impl.xb.xsdschema.Keybase unique) {
        generatedSetterHelperImpl(unique, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "unique" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Keybase addNewUnique() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Keybase target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Keybase)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
