/*
 * An XML document type.
 * Localname: anyAttribute
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AnyAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one anyAttribute(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class AnyAttributeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.AnyAttributeDocument {
    private static final long serialVersionUID = 1L;

    public AnyAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "anyAttribute"),
    };


    /**
     * Gets the "anyAttribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Wildcard getAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Wildcard target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "anyAttribute" element
     */
    public void setAnyAttribute(org.apache.xmlbeans.impl.xb.xsdschema.Wildcard anyAttribute) {
        generatedSetterHelperImpl(anyAttribute, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Wildcard addNewAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Wildcard target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
