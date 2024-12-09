/*
 * An XML document type.
 * Localname: complexType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ComplexTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one complexType(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class ComplexTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.ComplexTypeDocument {
    private static final long serialVersionUID = 1L;

    public ComplexTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "complexType"),
    };


    /**
     * Gets the "complexType" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType getComplexType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "complexType" element
     */
    public void setComplexType(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType complexType) {
        generatedSetterHelperImpl(complexType, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "complexType" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType addNewComplexType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
