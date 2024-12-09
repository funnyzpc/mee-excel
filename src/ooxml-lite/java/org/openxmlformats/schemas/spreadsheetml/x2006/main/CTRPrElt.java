/*
 * XML Type:  CT_RPrElt
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRPrElt
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_RPrElt(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRPrElt extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTRPrElt> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctrpreltecc2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();

    /**
     * Gets ith "rFont" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName getRFontArray(int i);

    /**
     * Returns number of "rFont" element
     */
    int sizeOfRFontArray();


    /**
     * Appends and returns a new empty value (as xml) as the last "rFont" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName addNewRFont();

    /**
     * Removes the ith "rFont" element
     */
    void removeRFont(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "charset" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty addNewCharset();


    /**
     * Appends and returns a new empty value (as xml) as the last "family" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty addNewFamily();

    /**
     * Appends and returns a new empty value (as xml) as the last "b" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewB();
    /**
     * Appends and returns a new empty value (as xml) as the last "i" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewI();


    /**
     * Appends and returns a new empty value (as xml) as the last "strike" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewStrike();

    /**
     * Appends and returns a new empty value (as xml) as the last "outline" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewOutline();


    /**
     * Appends and returns a new empty value (as xml) as the last "shadow" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewShadow();
    /**
     * Appends and returns a new empty value (as xml) as the last "condense" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewCondense();

    /**
     * Appends and returns a new empty value (as xml) as the last "extend" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewExtend();
    /**
     * Appends and returns a new empty value (as xml) as the last "color" element
     */
    CTColor addNewColor();
    /**
     * Appends and returns a new empty value (as xml) as the last "sz" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize addNewSz();


    /**
     * Appends and returns a new empty value (as xml) as the last "u" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty addNewU();


    /**
     * Appends and returns a new empty value (as xml) as the last "vertAlign" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty addNewVertAlign();


    /**
     * Appends and returns a new empty value (as xml) as the last "scheme" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme addNewScheme();


}
