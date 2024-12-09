/*
 * An XML document type.
 * Localname: all
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AllDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one all(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class AllDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.AllDocument {
    private static final long serialVersionUID = 1L;

    public AllDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "all"),
    };


    /**
     * Gets the "all" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.All getAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.All target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.All)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "all" element
     */
    public void setAll(org.apache.xmlbeans.impl.xb.xsdschema.All all) {
        generatedSetterHelperImpl(all, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "all" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.All addNewAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.All target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.All)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
