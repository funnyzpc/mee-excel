/*
 * An XML document type.
 * Localname: attributeGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one attributeGroup(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class AttributeGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupDocument {
    private static final long serialVersionUID = 1L;

    public AttributeGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "attributeGroup"),
    };


    /**
     * Gets the "attributeGroup" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup getAttributeGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "attributeGroup" element
     */
    public void setAttributeGroup(org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup attributeGroup) {
        generatedSetterHelperImpl(attributeGroup, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "attributeGroup" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup addNewAttributeGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
