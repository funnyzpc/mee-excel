/*
 * An XML document type.
 * Localname: chartsheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.ChartsheetDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * A document containing one chartsheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class ChartsheetDocumentImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.ChartsheetDocument {
    private static final long serialVersionUID = 1L;

    public ChartsheetDocumentImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "chartsheet"),
    };


    /**
     * Gets the "chartsheet" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet getChartsheet() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "chartsheet" element
     */
    @Override
    public void setChartsheet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet chartsheet) {
        generatedSetterHelperImpl(chartsheet, PROPERTY_QNAME[0], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "chartsheet" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet addNewChartsheet() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
