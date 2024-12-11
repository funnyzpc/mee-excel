/*
 * XML Type:  CT_AutoFilter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_AutoFilter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTAutoFilterImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter {
    private static final long serialVersionUID = 1L;

    public CTAutoFilterImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "filterColumn"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortState"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
        new QName("", "ref"),
    };
    /**
     * Sets the "ref" attribute
     */
    @Override
    public void setRef(String ref) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(ref);
        }
    }

}
