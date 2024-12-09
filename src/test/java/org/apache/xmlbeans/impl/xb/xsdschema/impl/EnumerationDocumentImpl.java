/*
 * An XML document type.
 * Localname: enumeration
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.EnumerationDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one enumeration(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class EnumerationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.EnumerationDocument {
    private static final long serialVersionUID = 1L;

    public EnumerationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "enumeration"),
    };


    /**
     * Gets the "enumeration" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet getEnumeration() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "enumeration" element
     */
    public void setEnumeration(org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet enumeration) {
        generatedSetterHelperImpl(enumeration, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "enumeration" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet addNewEnumeration() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
