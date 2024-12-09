/*
 * An XML document type.
 * Localname: maxExclusive
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.MaxExclusiveDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one maxExclusive(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class MaxExclusiveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.MaxExclusiveDocument {
    private static final long serialVersionUID = 1L;

    public MaxExclusiveDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "maxExclusive"),
    };


    /**
     * Gets the "maxExclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet getMaxExclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "maxExclusive" element
     */
    public void setMaxExclusive(org.apache.xmlbeans.impl.xb.xsdschema.Facet maxExclusive) {
        generatedSetterHelperImpl(maxExclusive, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "maxExclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMaxExclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
