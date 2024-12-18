/*
 * XML Type:  CT_CalcCell
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlInt;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_CalcCell(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCalcCell extends XmlObject {
    DocumentFactory<CTCalcCell> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcalccellb960type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "r" attribute
     */
    String getR();

//    /**
//     * Gets (as xml) the "r" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetR();

    /**
     * True if has "r" attribute
     */
    boolean isSetR();

    /**
     * Sets the "r" attribute
     */
    void setR(String r);

//    /**
//     * Sets (as xml) the "r" attribute
//     */
//    void xsetR(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef r);

    /**
     * Unsets the "r" attribute
     */
    void unsetR();

    /**
     * Gets the "ref" attribute
     */
    String getRef();
//
//    /**
//     * Gets (as xml) the "ref" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetRef();

    /**
     * True if has "ref" attribute
     */
    boolean isSetRef();

    /**
     * Sets the "ref" attribute
     */
    void setRef(String ref);

//    /**
//     * Sets (as xml) the "ref" attribute
//     */
//    void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef ref);
//
//    /**
//     * Unsets the "ref" attribute
//     */
//    void unsetRef();

    /**
     * Gets the "i" attribute
     */
    int getI();

    /**
     * Gets (as xml) the "i" attribute
     */
    XmlInt xgetI();

    /**
     * True if has "i" attribute
     */
    boolean isSetI();

    /**
     * Sets the "i" attribute
     */
    void setI(int iValue);

//    /**
//     * Sets (as xml) the "i" attribute
//     */
//    void xsetI(org.apache.xmlbeans.XmlInt iValue);
//
//    /**
//     * Unsets the "i" attribute
//     */
//    void unsetI();

    /**
     * Gets the "s" attribute
     */
    boolean getS();

//    /**
//     * Gets (as xml) the "s" attribute
//     */
//    org.apache.xmlbeans.XmlBoolean xgetS();
//
//    /**
//     * True if has "s" attribute
//     */
//    boolean isSetS();

    /**
     * Sets the "s" attribute
     */
    void setS(boolean s);

    /**
     * Sets (as xml) the "s" attribute
     */
    void xsetS(XmlBoolean s);

    /**
     * Unsets the "s" attribute
     */
    void unsetS();

    /**
     * Gets the "l" attribute
     */
    boolean getL();

    /**
     * Gets (as xml) the "l" attribute
     */
    XmlBoolean xgetL();

    /**
     * True if has "l" attribute
     */
    boolean isSetL();

    /**
     * Sets the "l" attribute
     */
    void setL(boolean l);

    /**
     * Sets (as xml) the "l" attribute
     */
    void xsetL(XmlBoolean l);

    /**
     * Unsets the "l" attribute
     */
    void unsetL();

    /**
     * Gets the "t" attribute
     */
    boolean getT();

    /**
     * Gets (as xml) the "t" attribute
     */
    XmlBoolean xgetT();

    /**
     * True if has "t" attribute
     */
    boolean isSetT();

    /**
     * Sets the "t" attribute
     */
    void setT(boolean t);

    /**
     * Sets (as xml) the "t" attribute
     */
    void xsetT(XmlBoolean t);

    /**
     * Unsets the "t" attribute
     */
    void unsetT();

    /**
     * Gets the "a" attribute
     */
    boolean getA();

    /**
     * Gets (as xml) the "a" attribute
     */
    XmlBoolean xgetA();

    /**
     * True if has "a" attribute
     */
    boolean isSetA();

    /**
     * Sets the "a" attribute
     */
    void setA(boolean a);

//    /**
//     * Sets (as xml) the "a" attribute
//     */
//    void xsetA(org.apache.xmlbeans.XmlBoolean a);
//
//    /**
//     * Unsets the "a" attribute
//     */
//    void unsetA();
}
