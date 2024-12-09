/*
 * XML Type:  CT_Font
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;

/**
 * An XML CT_Font(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFontImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont {
    private static final long serialVersionUID = 1L;

    public CTFontImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "name"),
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
     * Gets ith "name" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName getNameArray(int i) {
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
     * Returns number of "name" element
     */
    @Override
    public int sizeOfNameArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }


    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName addNewName() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets ith "charset" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty getCharsetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "charset" element
     */
    @Override
    public int sizeOfCharsetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
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
     * Gets ith "family" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontFamily getFamilyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontFamily target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontFamily)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "family" element
     */
    @Override
    public int sizeOfFamilyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }


    /**
     * Appends and returns a new empty value (as xml) as the last "family" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontFamily addNewFamily() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontFamily target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontFamily)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }


    /**
     * Gets ith "b" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getBArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "b" element
     */
    @Override
    public int sizeOfBArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "b" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setBArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] bArray) {
        check_orphaned();
        arraySetterHelper(bArray, PROPERTY_QNAME[3]);
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
     * Gets ith "i" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getIArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "i" element
     */
    @Override
    public int sizeOfIArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "i" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setIArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] iValueArray) {
        check_orphaned();
        arraySetterHelper(iValueArray, PROPERTY_QNAME[4]);
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
     * Gets ith "strike" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getStrikeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "strike" element
     */
    @Override
    public int sizeOfStrikeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "strike" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStrikeArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] strikeArray) {
        check_orphaned();
        arraySetterHelper(strikeArray, PROPERTY_QNAME[5]);
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
     * Gets ith "outline" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getOutlineArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "outline" element
     */
    @Override
    public int sizeOfOutlineArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }


    /**
     * Gets ith "shadow" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getShadowArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "shadow" element
     */
    @Override
    public int sizeOfShadowArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets ith "condense" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getCondenseArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "condense" element
     */
    @Override
    public int sizeOfCondenseArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }


    /**
     * Gets ith "extend" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getExtendArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "extend" element
     */
    @Override
    public int sizeOfExtendArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets a List of "color" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor> getColorList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getColorArray,
                this::setColorArray,
                this::insertNewColor,
                this::removeColor,
                this::sizeOfColorArray
            );
        }
    }

    /**
     * Gets ith "color" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getColorArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "color" element
     */
    @Override
    public int sizeOfColorArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets array of all "color" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setColorArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[] colorArray) {
        check_orphaned();
        arraySetterHelper(colorArray, PROPERTY_QNAME[10]);
    }

    /**
     * Sets ith "color" element
     */
    @Override
    public void setColorArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor color) {
        generatedSetterHelperImpl(color, PROPERTY_QNAME[10], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "color" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor insertNewColor(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().insert_element_user(PROPERTY_QNAME[10], i);
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
     * Removes the ith "color" element
     */
    @Override
    public void removeColor(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }

    /**
     * Gets ith "sz" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize getSzArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "sz" element
     */
    @Override
    public int sizeOfSzArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets array of all "sz" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSzArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize[] szArray) {
        check_orphaned();
        arraySetterHelper(szArray, PROPERTY_QNAME[11]);
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
     * Gets ith "u" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty getUArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "u" element
     */
    @Override
    public int sizeOfUArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Sets array of all "u" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setUArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty[] uArray) {
        check_orphaned();
        arraySetterHelper(uArray, PROPERTY_QNAME[12]);
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
     * Removes the ith "u" element
     */
    @Override
    public void removeU(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], i);
        }
    }

    /**
     * Gets ith "vertAlign" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty getVertAlignArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "vertAlign" element
     */
    @Override
    public int sizeOfVertAlignArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets array of all "vertAlign" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setVertAlignArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty[] vertAlignArray) {
        check_orphaned();
        arraySetterHelper(vertAlignArray, PROPERTY_QNAME[13]);
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
     * Gets ith "scheme" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme getSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "scheme" element
     */
    @Override
    public int sizeOfSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]);
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
