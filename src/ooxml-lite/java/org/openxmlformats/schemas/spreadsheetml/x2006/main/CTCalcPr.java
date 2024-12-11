/*
 * XML Type:  CT_CalcPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlDouble;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_CalcPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCalcPr extends XmlObject {
    DocumentFactory<CTCalcPr> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcalcprd480type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "calcId" attribute
     */
    long getCalcId();

    /**
     * Gets (as xml) the "calcId" attribute
     */
    XmlUnsignedInt xgetCalcId();

    /**
     * True if has "calcId" attribute
     */
    boolean isSetCalcId();

    /**
     * Sets the "calcId" attribute
     */
    void setCalcId(long calcId);

    /**
     * Sets (as xml) the "calcId" attribute
     */
    void xsetCalcId(XmlUnsignedInt calcId);

    /**
     * Unsets the "calcId" attribute
     */
    void unsetCalcId();

    /**
     * Gets the "calcMode" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode.Enum getCalcMode();

    /**
     * Gets (as xml) the "calcMode" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode xgetCalcMode();

    /**
     * True if has "calcMode" attribute
     */
    boolean isSetCalcMode();

    /**
     * Sets the "calcMode" attribute
     */
    void setCalcMode(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode.Enum calcMode);

    /**
     * Sets (as xml) the "calcMode" attribute
     */
    void xsetCalcMode(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode calcMode);

    /**
     * Unsets the "calcMode" attribute
     */
    void unsetCalcMode();

    /**
     * Gets the "fullCalcOnLoad" attribute
     */
    boolean getFullCalcOnLoad();

    /**
     * Gets (as xml) the "fullCalcOnLoad" attribute
     */
    XmlBoolean xgetFullCalcOnLoad();

    /**
     * True if has "fullCalcOnLoad" attribute
     */
    boolean isSetFullCalcOnLoad();

    /**
     * Sets the "fullCalcOnLoad" attribute
     */
    void setFullCalcOnLoad(boolean fullCalcOnLoad);

    /**
     * Sets (as xml) the "fullCalcOnLoad" attribute
     */
    void xsetFullCalcOnLoad(XmlBoolean fullCalcOnLoad);

    /**
     * Unsets the "fullCalcOnLoad" attribute
     */
    void unsetFullCalcOnLoad();

    /**
     * Gets the "refMode" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode.Enum getRefMode();

    /**
     * Gets (as xml) the "refMode" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode xgetRefMode();

    /**
     * True if has "refMode" attribute
     */
    boolean isSetRefMode();

    /**
     * Sets the "refMode" attribute
     */
    void setRefMode(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode.Enum refMode);

    /**
     * Sets (as xml) the "refMode" attribute
     */
    void xsetRefMode(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode refMode);

    /**
     * Unsets the "refMode" attribute
     */
    void unsetRefMode();

    /**
     * Gets the "iterate" attribute
     */
    boolean getIterate();

    /**
     * Gets (as xml) the "iterate" attribute
     */
    XmlBoolean xgetIterate();

    /**
     * True if has "iterate" attribute
     */
    boolean isSetIterate();

    /**
     * Sets the "iterate" attribute
     */
    void setIterate(boolean iterate);

    /**
     * Sets (as xml) the "iterate" attribute
     */
    void xsetIterate(XmlBoolean iterate);

    /**
     * Unsets the "iterate" attribute
     */
    void unsetIterate();

    /**
     * Gets the "iterateCount" attribute
     */
    long getIterateCount();

    /**
     * Gets (as xml) the "iterateCount" attribute
     */
    XmlUnsignedInt xgetIterateCount();

    /**
     * True if has "iterateCount" attribute
     */
    boolean isSetIterateCount();

    /**
     * Sets the "iterateCount" attribute
     */
    void setIterateCount(long iterateCount);

    /**
     * Sets (as xml) the "iterateCount" attribute
     */
    void xsetIterateCount(XmlUnsignedInt iterateCount);

    /**
     * Unsets the "iterateCount" attribute
     */
    void unsetIterateCount();

    /**
     * Gets the "iterateDelta" attribute
     */
    double getIterateDelta();

    /**
     * Gets (as xml) the "iterateDelta" attribute
     */
    XmlDouble xgetIterateDelta();

    /**
     * True if has "iterateDelta" attribute
     */
    boolean isSetIterateDelta();

    /**
     * Sets the "iterateDelta" attribute
     */
    void setIterateDelta(double iterateDelta);

    /**
     * Sets (as xml) the "iterateDelta" attribute
     */
    void xsetIterateDelta(XmlDouble iterateDelta);

    /**
     * Unsets the "iterateDelta" attribute
     */
    void unsetIterateDelta();

    /**
     * Gets the "fullPrecision" attribute
     */
    boolean getFullPrecision();

    /**
     * Gets (as xml) the "fullPrecision" attribute
     */
    XmlBoolean xgetFullPrecision();

    /**
     * True if has "fullPrecision" attribute
     */
    boolean isSetFullPrecision();

    /**
     * Sets the "fullPrecision" attribute
     */
    void setFullPrecision(boolean fullPrecision);

    /**
     * Sets (as xml) the "fullPrecision" attribute
     */
    void xsetFullPrecision(XmlBoolean fullPrecision);

    /**
     * Unsets the "fullPrecision" attribute
     */
    void unsetFullPrecision();

    /**
     * Gets the "calcCompleted" attribute
     */
    boolean getCalcCompleted();

    /**
     * Gets (as xml) the "calcCompleted" attribute
     */
    XmlBoolean xgetCalcCompleted();

    /**
     * True if has "calcCompleted" attribute
     */
    boolean isSetCalcCompleted();

    /**
     * Sets the "calcCompleted" attribute
     */
    void setCalcCompleted(boolean calcCompleted);

    /**
     * Sets (as xml) the "calcCompleted" attribute
     */
    void xsetCalcCompleted(XmlBoolean calcCompleted);

    /**
     * Unsets the "calcCompleted" attribute
     */
    void unsetCalcCompleted();

    /**
     * Gets the "calcOnSave" attribute
     */
    boolean getCalcOnSave();

    /**
     * Gets (as xml) the "calcOnSave" attribute
     */
    XmlBoolean xgetCalcOnSave();

    /**
     * True if has "calcOnSave" attribute
     */
    boolean isSetCalcOnSave();

    /**
     * Sets the "calcOnSave" attribute
     */
    void setCalcOnSave(boolean calcOnSave);

    /**
     * Sets (as xml) the "calcOnSave" attribute
     */
    void xsetCalcOnSave(XmlBoolean calcOnSave);

    /**
     * Unsets the "calcOnSave" attribute
     */
    void unsetCalcOnSave();

    /**
     * Gets the "concurrentCalc" attribute
     */
    boolean getConcurrentCalc();

    /**
     * Gets (as xml) the "concurrentCalc" attribute
     */
    XmlBoolean xgetConcurrentCalc();

    /**
     * True if has "concurrentCalc" attribute
     */
    boolean isSetConcurrentCalc();

    /**
     * Sets the "concurrentCalc" attribute
     */
    void setConcurrentCalc(boolean concurrentCalc);

    /**
     * Sets (as xml) the "concurrentCalc" attribute
     */
    void xsetConcurrentCalc(XmlBoolean concurrentCalc);

    /**
     * Unsets the "concurrentCalc" attribute
     */
    void unsetConcurrentCalc();

    /**
     * Gets the "concurrentManualCount" attribute
     */
    long getConcurrentManualCount();

    /**
     * Gets (as xml) the "concurrentManualCount" attribute
     */
    XmlUnsignedInt xgetConcurrentManualCount();

    /**
     * True if has "concurrentManualCount" attribute
     */
    boolean isSetConcurrentManualCount();

    /**
     * Sets the "concurrentManualCount" attribute
     */
    void setConcurrentManualCount(long concurrentManualCount);

    /**
     * Sets (as xml) the "concurrentManualCount" attribute
     */
    void xsetConcurrentManualCount(XmlUnsignedInt concurrentManualCount);

    /**
     * Unsets the "concurrentManualCount" attribute
     */
    void unsetConcurrentManualCount();

    /**
     * Gets the "forceFullCalc" attribute
     */
    boolean getForceFullCalc();

    /**
     * Gets (as xml) the "forceFullCalc" attribute
     */
    XmlBoolean xgetForceFullCalc();

    /**
     * True if has "forceFullCalc" attribute
     */
    boolean isSetForceFullCalc();

    /**
     * Sets the "forceFullCalc" attribute
     */
    void setForceFullCalc(boolean forceFullCalc);

    /**
     * Sets (as xml) the "forceFullCalc" attribute
     */
    void xsetForceFullCalc(XmlBoolean forceFullCalc);

    /**
     * Unsets the "forceFullCalc" attribute
     */
    void unsetForceFullCalc();
}
