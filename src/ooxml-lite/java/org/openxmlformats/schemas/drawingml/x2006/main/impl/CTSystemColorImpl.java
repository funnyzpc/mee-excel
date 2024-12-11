/*
 * XML Type:  CT_SystemColor
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_SystemColor(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSystemColorImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor {
    private static final long serialVersionUID = 1L;

    public CTSystemColorImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tint"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "shade"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "comp"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "inv"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gray"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alpha"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaOff"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaMod"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hue"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hueOff"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hueMod"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sat"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "satOff"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "satMod"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lum"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lumOff"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lumMod"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "red"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "redOff"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "redMod"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "green"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "greenOff"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "greenMod"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blue"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blueOff"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blueMod"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gamma"),
        new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "invGamma"),
        new QName("", "val"),
        new QName("", "lastClr"),
    };


    /**
     * Gets the "lastClr" attribute
     */
    @Override
    public byte[] getLastClr() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[29]);
            return (target == null) ? null : target.getByteArrayValue();
        }
    }

}
