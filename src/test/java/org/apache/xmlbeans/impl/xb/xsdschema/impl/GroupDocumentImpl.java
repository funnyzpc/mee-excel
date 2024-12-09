/*
 * An XML document type.
 * Localname: group
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one group(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.GroupDocument {
    private static final long serialVersionUID = 1L;

    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "group"),
    };


    /**
     * Gets the "group" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup getGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "group" element
     */
    public void setGroup(org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup group) {
        generatedSetterHelperImpl(group, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "group" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup addNewGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
