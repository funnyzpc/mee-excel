/*
 * An XML document type.
 * Localname: simpleType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SimpleTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one simpleType(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class SimpleTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.SimpleTypeDocument {
    private static final long serialVersionUID = 1L;

    public SimpleTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "simpleType"),
    };


    /**
     * Gets the "simpleType" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType getSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "simpleType" element
     */
    public void setSimpleType(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType simpleType) {
        generatedSetterHelperImpl(simpleType, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "simpleType" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType addNewSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
