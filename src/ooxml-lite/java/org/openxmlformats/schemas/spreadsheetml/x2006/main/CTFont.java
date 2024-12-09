/*
 * XML Type:  CT_Font
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Font(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFont extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTFont> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfont14d8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets ith "name" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName getNameArray(int i);

    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();


    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName addNewName();


    /**
     * Gets ith "charset" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty getCharsetArray(int i);

    /**
     * Returns number of "charset" element
     */
    int sizeOfCharsetArray();


    /**
     * Appends and returns a new empty value (as xml) as the last "charset" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty addNewCharset();


    /**
     * Gets ith "family" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontFamily getFamilyArray(int i);

    /**
     * Returns number of "family" element
     */
    int sizeOfFamilyArray();


    /**
     * Appends and returns a new empty value (as xml) as the last "family" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontFamily addNewFamily();


    /**
     * Gets ith "b" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getBArray(int i);

    /**
     * Returns number of "b" element
     */
    int sizeOfBArray();

    /**
     * Sets array of all "b" element
     */
    void setBArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] bArray);

    /**
     * Appends and returns a new empty value (as xml) as the last "b" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewB();


    /**
     * Gets ith "i" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getIArray(int i);

    /**
     * Returns number of "i" element
     */
    int sizeOfIArray();

    /**
     * Sets array of all "i" element
     */
    void setIArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] iValueArray);

    /**
     * Appends and returns a new empty value (as xml) as the last "i" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewI();


    /**
     * Gets ith "strike" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getStrikeArray(int i);

    /**
     * Returns number of "strike" element
     */
    int sizeOfStrikeArray();

    /**
     * Sets array of all "strike" element
     */
    void setStrikeArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] strikeArray);

    /**
     * Appends and returns a new empty value (as xml) as the last "strike" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewStrike();

    /**
     * Gets ith "outline" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getOutlineArray(int i);

    /**
     * Returns number of "outline" element
     */
    int sizeOfOutlineArray();
    /**
     * Gets ith "shadow" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getShadowArray(int i);

    /**
     * Returns number of "shadow" element
     */
    int sizeOfShadowArray();

    /**
     * Gets ith "condense" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getCondenseArray(int i);

    /**
     * Returns number of "condense" element
     */
    int sizeOfCondenseArray();

//
//    /**
//     * Gets array of all "extend" elements
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] getExtendArray();

    /**
     * Gets ith "extend" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getExtendArray(int i);

    /**
     * Returns number of "extend" element
     */
    int sizeOfExtendArray();

//    /**
//     * Sets array of all "extend" element
//     */
//    void setExtendArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] extendArray);
//
//    /**
//     * Sets ith "extend" element
//     */
//    void setExtendArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty extend);
//
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "extend" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty insertNewExtend(int i);
//
//    /**
//     * Appends and returns a new empty value (as xml) as the last "extend" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewExtend();
//
//    /**
//     * Removes the ith "extend" element
//     */
//    void removeExtend(int i);

    /**
     * Gets a List of "color" elements
     */
    java.util.List<CTColor> getColorList();


    /**
     * Gets ith "color" element
     */
    CTColor getColorArray(int i);

    /**
     * Returns number of "color" element
     */
    int sizeOfColorArray();

    /**
     * Sets array of all "color" element
     */
    void setColorArray(CTColor[] colorArray);

    /**
     * Sets ith "color" element
     */
    void setColorArray(int i, CTColor color);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "color" element
     */
    CTColor insertNewColor(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "color" element
     */
    CTColor addNewColor();

    /**
     * Removes the ith "color" element
     */
    void removeColor(int i);

    /**
     * Gets ith "sz" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize getSzArray(int i);

    /**
     * Returns number of "sz" element
     */
    int sizeOfSzArray();

    /**
     * Sets array of all "sz" element
     */
    void setSzArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize[] szArray);

//    /**
//     * Sets ith "sz" element
//     */
//    void setSzArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize sz);
//
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "sz" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize insertNewSz(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "sz" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize addNewSz();

//    /**
//     * Removes the ith "sz" element
//     */
//    void removeSz(int i);

//    /**
//     * Gets a List of "u" elements
//     */
//    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty> getUList();

//    /**
//     * Gets array of all "u" elements
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty[] getUArray();

    /**
     * Gets ith "u" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty getUArray(int i);

    /**
     * Returns number of "u" element
     */
    int sizeOfUArray();

    /**
     * Sets array of all "u" element
     */
    void setUArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty[] uArray);

//    /**
//     * Sets ith "u" element
//     */
//    void setUArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty u);

//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "u" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty insertNewU(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "u" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty addNewU();

    /**
     * Removes the ith "u" element
     */
    void removeU(int i);

//    /**
//     * Gets a List of "vertAlign" elements
//     */
//    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty> getVertAlignList();
//
//    /**
//     * Gets array of all "vertAlign" elements
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty[] getVertAlignArray();

    /**
     * Gets ith "vertAlign" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty getVertAlignArray(int i);

    /**
     * Returns number of "vertAlign" element
     */
    int sizeOfVertAlignArray();

    /**
     * Sets array of all "vertAlign" element
     */
    void setVertAlignArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty[] vertAlignArray);


    /**
     * Appends and returns a new empty value (as xml) as the last "vertAlign" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty addNewVertAlign();


    /**
     * Gets ith "scheme" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme getSchemeArray(int i);

    /**
     * Returns number of "scheme" element
     */
    int sizeOfSchemeArray();


    /**
     * Appends and returns a new empty value (as xml) as the last "scheme" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme addNewScheme();


}
