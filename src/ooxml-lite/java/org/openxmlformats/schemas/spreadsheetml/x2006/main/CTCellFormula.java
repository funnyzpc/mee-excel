/*
 * XML Type:  CT_CellFormula
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_CellFormula(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula.
 */
public interface CTCellFormula extends STFormula {
    DocumentFactory<CTCellFormula> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcellformula3583type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "t" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType.Enum getT();

    /**
     * Gets (as xml) the "t" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType xgetT();

    /**
     * True if has "t" attribute
     */
    boolean isSetT();

    /**
     * Sets the "t" attribute
     */
    void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType.Enum t);

    /**
     * Sets (as xml) the "t" attribute
     */
    void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType t);

    /**
     * Unsets the "t" attribute
     */
    void unsetT();

    /**
     * Gets the "aca" attribute
     */
    boolean getAca();

    /**
     * Gets (as xml) the "aca" attribute
     */
    XmlBoolean xgetAca();

    /**
     * True if has "aca" attribute
     */
    boolean isSetAca();

    /**
     * Sets the "aca" attribute
     */
    void setAca(boolean aca);

    /**
     * Sets (as xml) the "aca" attribute
     */
    void xsetAca(XmlBoolean aca);

    /**
     * Unsets the "aca" attribute
     */
    void unsetAca();

    /**
     * Gets the "ref" attribute
     */
    String getRef();

    /**
     * Gets (as xml) the "ref" attribute
     */
    STRef xgetRef();

    /**
     * True if has "ref" attribute
     */
    boolean isSetRef();

    /**
     * Sets the "ref" attribute
     */
    void setRef(String ref);

    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(STRef ref);

    /**
     * Unsets the "ref" attribute
     */
    void unsetRef();

    /**
     * Gets the "dt2D" attribute
     */
    boolean getDt2D();

    /**
     * Gets (as xml) the "dt2D" attribute
     */
    XmlBoolean xgetDt2D();

    /**
     * True if has "dt2D" attribute
     */
    boolean isSetDt2D();

    /**
     * Sets the "dt2D" attribute
     */
    void setDt2D(boolean dt2D);

    /**
     * Sets (as xml) the "dt2D" attribute
     */
    void xsetDt2D(XmlBoolean dt2D);

    /**
     * Unsets the "dt2D" attribute
     */
    void unsetDt2D();

    /**
     * Gets the "dtr" attribute
     */
    boolean getDtr();

    /**
     * Gets (as xml) the "dtr" attribute
     */
    XmlBoolean xgetDtr();

    /**
     * True if has "dtr" attribute
     */
    boolean isSetDtr();

    /**
     * Sets the "dtr" attribute
     */
    void setDtr(boolean dtr);

    /**
     * Sets (as xml) the "dtr" attribute
     */
    void xsetDtr(XmlBoolean dtr);

    /**
     * Unsets the "dtr" attribute
     */
    void unsetDtr();

    /**
     * Gets the "del1" attribute
     */
    boolean getDel1();

    /**
     * Gets (as xml) the "del1" attribute
     */
    XmlBoolean xgetDel1();

    /**
     * True if has "del1" attribute
     */
    boolean isSetDel1();

    /**
     * Sets the "del1" attribute
     */
    void setDel1(boolean del1);

    /**
     * Sets (as xml) the "del1" attribute
     */
    void xsetDel1(XmlBoolean del1);

    /**
     * Unsets the "del1" attribute
     */
    void unsetDel1();

    /**
     * Gets the "del2" attribute
     */
    boolean getDel2();

    /**
     * Gets (as xml) the "del2" attribute
     */
    XmlBoolean xgetDel2();

    /**
     * True if has "del2" attribute
     */
    boolean isSetDel2();

    /**
     * Sets the "del2" attribute
     */
    void setDel2(boolean del2);

    /**
     * Sets (as xml) the "del2" attribute
     */
    void xsetDel2(XmlBoolean del2);

    /**
     * Unsets the "del2" attribute
     */
    void unsetDel2();

    /**
     * Gets the "r1" attribute
     */
    String getR1();

//    /**
//     * Gets (as xml) the "r1" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetR1();

    /**
     * True if has "r1" attribute
     */
    boolean isSetR1();

    /**
     * Sets the "r1" attribute
     */
    void setR1(String r1);

//    /**
//     * Sets (as xml) the "r1" attribute
//     */
//    void xsetR1(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef r1);

    /**
     * Unsets the "r1" attribute
     */
    void unsetR1();

    /**
     * Gets the "r2" attribute
     */
    String getR2();

//    /**
//     * Gets (as xml) the "r2" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetR2();

    /**
     * True if has "r2" attribute
     */
    boolean isSetR2();

    /**
     * Sets the "r2" attribute
     */
    void setR2(String r2);

//    /**
//     * Sets (as xml) the "r2" attribute
//     */
//    void xsetR2(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef r2);

    /**
     * Unsets the "r2" attribute
     */
    void unsetR2();

    /**
     * Gets the "ca" attribute
     */
    boolean getCa();

    /**
     * Gets (as xml) the "ca" attribute
     */
    XmlBoolean xgetCa();

    /**
     * True if has "ca" attribute
     */
    boolean isSetCa();

    /**
     * Sets the "ca" attribute
     */
    void setCa(boolean ca);

    /**
     * Sets (as xml) the "ca" attribute
     */
    void xsetCa(XmlBoolean ca);

    /**
     * Unsets the "ca" attribute
     */
    void unsetCa();

    /**
     * Gets the "si" attribute
     */
    long getSi();

    /**
     * Gets (as xml) the "si" attribute
     */
    XmlUnsignedInt xgetSi();

    /**
     * True if has "si" attribute
     */
    boolean isSetSi();

    /**
     * Sets the "si" attribute
     */
    void setSi(long si);

    /**
     * Sets (as xml) the "si" attribute
     */
    void xsetSi(XmlUnsignedInt si);

    /**
     * Unsets the "si" attribute
     */
    void unsetSi();

    /**
     * Gets the "bx" attribute
     */
    boolean getBx();

    /**
     * Gets (as xml) the "bx" attribute
     */
    XmlBoolean xgetBx();

    /**
     * True if has "bx" attribute
     */
    boolean isSetBx();

    /**
     * Sets the "bx" attribute
     */
    void setBx(boolean bx);

    /**
     * Sets (as xml) the "bx" attribute
     */
    void xsetBx(XmlBoolean bx);

    /**
     * Unsets the "bx" attribute
     */
    void unsetBx();
}
