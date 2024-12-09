/*
 * An XML document type.
 * Localname: choice
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ChoiceDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one choice(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class ChoiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.ChoiceDocument {
    private static final long serialVersionUID = 1L;

    public ChoiceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "choice"),
    };


    /**
     * Gets the "choice" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getChoice() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "choice" element
     */
    public void setChoice(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup choice) {
        generatedSetterHelperImpl(choice, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "choice" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewChoice() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
