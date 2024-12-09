/*
 * An XML document type.
 * Localname: attribute
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one attribute(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class AttributeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.AttributeDocument {
    private static final long serialVersionUID = 1L;

    public AttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "attribute"),
    };


    /**
     * Gets the "attribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute getAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "attribute" element
     */
    public void setAttribute(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute attribute) {
        generatedSetterHelperImpl(attribute, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "attribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute addNewAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
