/*
 * XML Type:  CT_RPrElt
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRPrElt
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_RPrElt(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRPrEltImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRPrElt {
    private static final long serialVersionUID = 1L;

    public CTRPrEltImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rFont"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "charset"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "family"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "b"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "i"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "strike"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "outline"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "shadow"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "condense"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extend"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "color"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sz"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "u"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "vertAlign"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "scheme"),
    };

    /**
     * Gets ith "rFont" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName getRFontArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "rFont" element
     */
    @Override
    public int sizeOfRFontArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }


    /**
     * Appends and returns a new empty value (as xml) as the last "rFont" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName addNewRFont() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "rFont" element
     */
    @Override
    public void removeRFont(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "charset" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty addNewCharset() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "family" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty addNewFamily() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "b" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewB() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "i" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewI() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }


    /**
     * Appends and returns a new empty value (as xml) as the last "strike" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewStrike() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "outline" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewOutline() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "shadow" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewShadow() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "condense" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewCondense() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }
    /**
     * Appends and returns a new empty value (as xml) as the last "extend" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewExtend() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "color" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "sz" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize addNewSz() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }



    /**
     * Appends and returns a new empty value (as xml) as the last "u" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty addNewU() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "vertAlign" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty addNewVertAlign() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "scheme" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme addNewScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme)get_store().add_element_user(PROPERTY_QNAME[14]);
            return target;
        }
    }


}
