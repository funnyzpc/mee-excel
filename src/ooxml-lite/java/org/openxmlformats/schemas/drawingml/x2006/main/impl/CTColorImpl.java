/*
 * XML Type:  CT_Color
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTColor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;

/**
 * An XML CT_Color(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTColor {
    private static final long serialVersionUID = 1L;

    public CTColorImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scrgbClr"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "srgbClr"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hslClr"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sysClr"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "schemeClr"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstClr"),
    };

    /**
     * Gets the "sysClr" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor getSysClr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "sysClr" element
     */
    @Override
    public boolean isSetSysClr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }



}
