/*
 * XML Type:  CT_PageMargins
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlDouble;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_PageMargins(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPageMargins extends XmlObject {
    DocumentFactory<CTPageMargins> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctpagemargins5455type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "left" attribute
     */
    double getLeft();

    /**
     * Gets (as xml) the "left" attribute
     */
    XmlDouble xgetLeft();

    /**
     * Sets the "left" attribute
     */
    void setLeft(double left);

    /**
     * Sets (as xml) the "left" attribute
     */
    void xsetLeft(XmlDouble left);

    /**
     * Gets the "right" attribute
     */
    double getRight();

    /**
     * Gets (as xml) the "right" attribute
     */
    XmlDouble xgetRight();

    /**
     * Sets the "right" attribute
     */
    void setRight(double right);

    /**
     * Sets (as xml) the "right" attribute
     */
    void xsetRight(XmlDouble right);

    /**
     * Gets the "top" attribute
     */
    double getTop();

    /**
     * Gets (as xml) the "top" attribute
     */
    XmlDouble xgetTop();

    /**
     * Sets the "top" attribute
     */
    void setTop(double top);

    /**
     * Sets (as xml) the "top" attribute
     */
    void xsetTop(XmlDouble top);

    /**
     * Gets the "bottom" attribute
     */
    double getBottom();

    /**
     * Gets (as xml) the "bottom" attribute
     */
    XmlDouble xgetBottom();

    /**
     * Sets the "bottom" attribute
     */
    void setBottom(double bottom);

    /**
     * Sets (as xml) the "bottom" attribute
     */
    void xsetBottom(XmlDouble bottom);

    /**
     * Gets the "header" attribute
     */
    double getHeader();

    /**
     * Gets (as xml) the "header" attribute
     */
    XmlDouble xgetHeader();

    /**
     * Sets the "header" attribute
     */
    void setHeader(double header);

    /**
     * Sets (as xml) the "header" attribute
     */
    void xsetHeader(XmlDouble header);

    /**
     * Gets the "footer" attribute
     */
    double getFooter();

    /**
     * Gets (as xml) the "footer" attribute
     */
    XmlDouble xgetFooter();

    /**
     * Sets the "footer" attribute
     */
    void setFooter(double footer);

    /**
     * Sets (as xml) the "footer" attribute
     */
    void xsetFooter(XmlDouble footer);
}
