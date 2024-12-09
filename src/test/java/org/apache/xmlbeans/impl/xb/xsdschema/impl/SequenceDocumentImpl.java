/*
 * An XML document type.
 * Localname: sequence
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SequenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one sequence(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class SequenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.SequenceDocument {
    private static final long serialVersionUID = 1L;

    public SequenceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "sequence"),
    };


    /**
     * Gets the "sequence" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "sequence" element
     */
    public void setSequence(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup sequence) {
        generatedSetterHelperImpl(sequence, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "sequence" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
