/*
 * XML Type:  CT_CfRule
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;

/**
 * An XML CT_CfRule(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCfRuleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule {
    private static final long serialVersionUID = 1L;

    public CTCfRuleImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "formula"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colorScale"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataBar"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "iconSet"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
        new QName("", "type"),
        new QName("", "dxfId"),
        new QName("", "priority"),
        new QName("", "stopIfTrue"),
        new QName("", "aboveAverage"),
        new QName("", "percent"),
        new QName("", "bottom"),
        new QName("", "operator"),
        new QName("", "text"),
        new QName("", "timePeriod"),
        new QName("", "rank"),
        new QName("", "stdDev"),
        new QName("", "equalAverage"),
    };


    /**
     * Gets a List of "formula" elements
     */
    @Override
    public java.util.List<String> getFormulaList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getFormulaArray,
                this::setFormulaArray,
                this::insertFormula,
                this::removeFormula,
                this::sizeOfFormulaArray
            );
        }
    }

    /**
     * Gets array of all "formula" elements
     */
    @Override
    public String[] getFormulaArray() {
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "formula" element
     */
    @Override
    public String getFormulaArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "formula" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula> xgetFormulaList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetFormulaArray,
                this::xsetFormulaArray,
                this::insertNewFormula,
                this::removeFormula,
                this::sizeOfFormulaArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "formula" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula[] xgetFormulaArray() {
        return xgetArray(PROPERTY_QNAME[0], org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula[]::new);
    }

    /**
     * Gets (as xml) ith "formula" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula xgetFormulaArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "formula" element
     */
    @Override
    public int sizeOfFormulaArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "formula" element
     */
    @Override
    public void setFormulaArray(String[] formulaArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(formulaArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "formula" element
     */
    @Override
    public void setFormulaArray(int i, String formula) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(formula);
        }
    }

    /**
     * Sets (as xml) array of all "formula" element
     */
    @Override
    public void xsetFormulaArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula[]formulaArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(formulaArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "formula" element
     */
    @Override
    public void xsetFormulaArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula formula) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(formula);
        }
    }

    /**
     * Inserts the value as the ith "formula" element
     */
    @Override
    public void insertFormula(int i, String formula) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setStringValue(formula);
        }
    }

    /**
     * Appends the value as the last "formula" element
     */
    @Override
    public void addFormula(String formula) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setStringValue(formula);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "formula" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula insertNewFormula(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "formula" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula addNewFormula() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "formula" element
     */
    @Override
    public void removeFormula(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "colorScale" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale getColorScale() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "colorScale" element
     */
    @Override
    public boolean isSetColorScale() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "colorScale" element
     */
    @Override
    public void setColorScale(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale colorScale) {
        generatedSetterHelperImpl(colorScale, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "colorScale" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale addNewColorScale() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "colorScale" element
     */
    @Override
    public void unsetColorScale() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "dataBar" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar getDataBar() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "dataBar" element
     */
    @Override
    public boolean isSetDataBar() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "dataBar" element
     */
    @Override
    public void setDataBar(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar dataBar) {
        generatedSetterHelperImpl(dataBar, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "dataBar" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar addNewDataBar() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "dataBar" element
     */
    @Override
    public void unsetDataBar() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "iconSet" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet getIconSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "iconSet" element
     */
    @Override
    public boolean isSetIconSet() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "iconSet" element
     */
    @Override
    public void setIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet iconSet) {
        generatedSetterHelperImpl(iconSet, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "iconSet" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet addNewIconSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "type" attribute
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType.Enum getType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "type" attribute
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType xgetType() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "type" attribute
     */
    @Override
    public boolean isSetType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "type" attribute
     */
    @Override
    public void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType.Enum type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setEnumValue(type);
        }
    }

    /**
     * Gets the "dxfId" attribute
     */
    @Override
    public long getDxfId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * True if has "dxfId" attribute
     */
    @Override
    public boolean isSetDxfId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "dxfId" attribute
     */
    @Override
    public void setDxfId(long dxfId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setLongValue(dxfId);
        }
    }


    /**
     * Gets the "priority" attribute
     */
    @Override
    public int getPriority() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "priority" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetPriority() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Sets the "priority" attribute
     */
    @Override
    public void setPriority(int priority) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setIntValue(priority);
        }
    }

    /**
     * Sets (as xml) the "priority" attribute
     */
    @Override
    public void xsetPriority(org.apache.xmlbeans.XmlInt priority) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(priority);
        }
    }

    /**
     * Gets the "stopIfTrue" attribute
     */
    @Override
    public boolean getStopIfTrue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[8]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "stopIfTrue" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetStopIfTrue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[8]);
            }
            return target;
        }
    }

    /**
     * True if has "stopIfTrue" attribute
     */
    @Override
    public boolean isSetStopIfTrue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "stopIfTrue" attribute
     */
    @Override
    public void setStopIfTrue(boolean stopIfTrue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setBooleanValue(stopIfTrue);
        }
    }

    /**
     * Sets (as xml) the "stopIfTrue" attribute
     */
    @Override
    public void xsetStopIfTrue(org.apache.xmlbeans.XmlBoolean stopIfTrue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(stopIfTrue);
        }
    }

    /**
     * Unsets the "stopIfTrue" attribute
     */
    @Override
    public void unsetStopIfTrue() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "aboveAverage" attribute
     */
    @Override
    public boolean getAboveAverage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[9]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "aboveAverage" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetAboveAverage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[9]);
            }
            return target;
        }
    }

    /**
     * True if has "aboveAverage" attribute
     */
    @Override
    public boolean isSetAboveAverage() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "aboveAverage" attribute
     */
    @Override
    public void setAboveAverage(boolean aboveAverage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setBooleanValue(aboveAverage);
        }
    }

    /**
     * Sets (as xml) the "aboveAverage" attribute
     */
    @Override
    public void xsetAboveAverage(org.apache.xmlbeans.XmlBoolean aboveAverage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(aboveAverage);
        }
    }

    /**
     * Unsets the "aboveAverage" attribute
     */
    @Override
    public void unsetAboveAverage() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "percent" attribute
     */
    @Override
    public boolean getPercent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[10]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "percent" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetPercent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[10]);
            }
            return target;
        }
    }

    /**
     * True if has "percent" attribute
     */
    @Override
    public boolean isSetPercent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "percent" attribute
     */
    @Override
    public void setPercent(boolean percent) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setBooleanValue(percent);
        }
    }

    /**
     * Sets (as xml) the "percent" attribute
     */
    @Override
    public void xsetPercent(org.apache.xmlbeans.XmlBoolean percent) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(percent);
        }
    }

    /**
     * Unsets the "percent" attribute
     */
    @Override
    public void unsetPercent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "bottom" attribute
     */
    @Override
    public boolean getBottom() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[11]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "bottom" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetBottom() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[11]);
            }
            return target;
        }
    }

    /**
     * True if has "bottom" attribute
     */
    @Override
    public boolean isSetBottom() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "bottom" attribute
     */
    @Override
    public void setBottom(boolean bottom) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setBooleanValue(bottom);
        }
    }


    /**
     * Gets the "operator" attribute
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator.Enum getOperator() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? null : (org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "operator" attribute
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator xgetOperator() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "operator" attribute
     */
    @Override
    public boolean isSetOperator() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "operator" attribute
     */
    @Override
    public void setOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator.Enum operator) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setEnumValue(operator);
        }
    }

    /**
     * Sets (as xml) the "operator" attribute
     */
    @Override
    public void xsetOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator operator) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(operator);
        }
    }

    /**
     * Unsets the "operator" attribute
     */
    @Override
    public void unsetOperator() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "text" attribute
     */
    @Override
    public String getText() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "text" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetText() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "text" attribute
     */
    @Override
    public boolean isSetText() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "text" attribute
     */
    @Override
    public void setText(String text) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setStringValue(text);
        }
    }

    /**
     * Sets (as xml) the "text" attribute
     */
    @Override
    public void xsetText(org.apache.xmlbeans.XmlString text) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(text);
        }
    }

    /**
     * Gets the "rank" attribute
     */
    @Override
    public long getRank() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }


    /**
     * Gets the "stdDev" attribute
     */
    @Override
    public int getStdDev() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }


    /**
     * Gets the "equalAverage" attribute
     */
    @Override
    public boolean getEqualAverage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[17]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }



}
