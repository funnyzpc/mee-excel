/*
 * An XML document type.
 * Localname: element
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one element(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class ElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.ElementDocument {
    private static final long serialVersionUID = 1L;

    public ElementDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "element"),
    };


    /**
     * Gets the "element" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement getElement() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "element" element
     */
    public void setElement(org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement element) {
        generatedSetterHelperImpl(element, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "element" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement addNewElement() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
