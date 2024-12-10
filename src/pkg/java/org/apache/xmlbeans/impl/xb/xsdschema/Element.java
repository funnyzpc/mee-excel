/*
 * XML Type:  element
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Element
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML element(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface Element extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
    AbstractDocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.Element> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "elementd189type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "simpleType" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType getSimpleType();

    /**
     * True if has "simpleType" element
     */
    boolean isSetSimpleType();

    /**
     * Sets the "simpleType" element
     */
    void setSimpleType(org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType simpleType);

    /**
     * Appends and returns a new empty "simpleType" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType addNewSimpleType();

    /**
     * Unsets the "simpleType" element
     */
    void unsetSimpleType();

    /**
     * Gets the "complexType" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.LocalComplexType getComplexType();

    /**
     * True if has "complexType" element
     */
    boolean isSetComplexType();

    /**
     * Sets the "complexType" element
     */
    void setComplexType(org.apache.xmlbeans.impl.xb.xsdschema.LocalComplexType complexType);

    /**
     * Appends and returns a new empty "complexType" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.LocalComplexType addNewComplexType();

    /**
     * Unsets the "complexType" element
     */
    void unsetComplexType();

    /**
     * Gets a List of "unique" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Keybase> getUniqueList();

    /**
     * Gets array of all "unique" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Keybase[] getUniqueArray();

    /**
     * Gets ith "unique" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Keybase getUniqueArray(int i);

    /**
     * Returns number of "unique" element
     */
    int sizeOfUniqueArray();

    /**
     * Sets array of all "unique" element
     */
    void setUniqueArray(org.apache.xmlbeans.impl.xb.xsdschema.Keybase[] uniqueArray);

    /**
     * Sets ith "unique" element
     */
    void setUniqueArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Keybase unique);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "unique" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Keybase insertNewUnique(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "unique" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Keybase addNewUnique();

    /**
     * Removes the ith "unique" element
     */
    void removeUnique(int i);

    /**
     * Gets a List of "key" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Keybase> getKeyList();

    /**
     * Gets array of all "key" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Keybase[] getKeyArray();

    /**
     * Gets ith "key" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Keybase getKeyArray(int i);

    /**
     * Returns number of "key" element
     */
    int sizeOfKeyArray();

    /**
     * Sets array of all "key" element
     */
    void setKeyArray(org.apache.xmlbeans.impl.xb.xsdschema.Keybase[] keyArray);

    /**
     * Sets ith "key" element
     */
    void setKeyArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Keybase key);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "key" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Keybase insertNewKey(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "key" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Keybase addNewKey();

    /**
     * Removes the ith "key" element
     */
    void removeKey(int i);

    /**
     * Gets a List of "keyref" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref> getKeyrefList();

    /**
     * Gets array of all "keyref" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref[] getKeyrefArray();

    /**
     * Gets ith "keyref" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref getKeyrefArray(int i);

    /**
     * Returns number of "keyref" element
     */
    int sizeOfKeyrefArray();

    /**
     * Sets array of all "keyref" element
     */
    void setKeyrefArray(org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref[] keyrefArray);

    /**
     * Sets ith "keyref" element
     */
    void setKeyrefArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref keyref);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "keyref" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref insertNewKeyref(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "keyref" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref addNewKeyref();

    /**
     * Removes the ith "keyref" element
     */
    void removeKeyref(int i);

    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetName();

    /**
     * True if has "name" attribute
     */
    boolean isSetName();

    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlNCName name);

    /**
     * Unsets the "name" attribute
     */
    void unsetName();

    /**
     * Gets the "ref" attribute
     */
    javax.xml.namespace.QName getRef();

    /**
     * Gets (as xml) the "ref" attribute
     */
    org.apache.xmlbeans.XmlQName xgetRef();

    /**
     * True if has "ref" attribute
     */
    boolean isSetRef();

    /**
     * Sets the "ref" attribute
     */
    void setRef(javax.xml.namespace.QName ref);

    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.apache.xmlbeans.XmlQName ref);

    /**
     * Unsets the "ref" attribute
     */
    void unsetRef();

    /**
     * Gets the "type" attribute
     */
    javax.xml.namespace.QName getType();

    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlQName xgetType();

    /**
     * True if has "type" attribute
     */
    boolean isSetType();

    /**
     * Sets the "type" attribute
     */
    void setType(javax.xml.namespace.QName type);

    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlQName type);

    /**
     * Unsets the "type" attribute
     */
    void unsetType();

    /**
     * Gets the "substitutionGroup" attribute
     */
    javax.xml.namespace.QName getSubstitutionGroup();

    /**
     * Gets (as xml) the "substitutionGroup" attribute
     */
    org.apache.xmlbeans.XmlQName xgetSubstitutionGroup();

    /**
     * True if has "substitutionGroup" attribute
     */
    boolean isSetSubstitutionGroup();

    /**
     * Sets the "substitutionGroup" attribute
     */
    void setSubstitutionGroup(javax.xml.namespace.QName substitutionGroup);

    /**
     * Sets (as xml) the "substitutionGroup" attribute
     */
    void xsetSubstitutionGroup(org.apache.xmlbeans.XmlQName substitutionGroup);

    /**
     * Unsets the "substitutionGroup" attribute
     */
    void unsetSubstitutionGroup();

    /**
     * Gets the "minOccurs" attribute
     */
    java.math.BigInteger getMinOccurs();

    /**
     * Gets (as xml) the "minOccurs" attribute
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetMinOccurs();

    /**
     * True if has "minOccurs" attribute
     */
    boolean isSetMinOccurs();

    /**
     * Sets the "minOccurs" attribute
     */
    void setMinOccurs(java.math.BigInteger minOccurs);

    /**
     * Sets (as xml) the "minOccurs" attribute
     */
    void xsetMinOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minOccurs);

    /**
     * Unsets the "minOccurs" attribute
     */
    void unsetMinOccurs();

    /**
     * Gets the "maxOccurs" attribute
     */
    java.lang.Object getMaxOccurs();

    /**
     * Gets (as xml) the "maxOccurs" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AllNNI xgetMaxOccurs();

    /**
     * True if has "maxOccurs" attribute
     */
    boolean isSetMaxOccurs();

    /**
     * Sets the "maxOccurs" attribute
     */
    void setMaxOccurs(java.lang.Object maxOccurs);

    /**
     * Sets (as xml) the "maxOccurs" attribute
     */
    void xsetMaxOccurs(org.apache.xmlbeans.impl.xb.xsdschema.AllNNI maxOccurs);

    /**
     * Unsets the "maxOccurs" attribute
     */
    void unsetMaxOccurs();

    /**
     * Gets the "default" attribute
     */
    java.lang.String getDefault();

    /**
     * Gets (as xml) the "default" attribute
     */
    org.apache.xmlbeans.XmlString xgetDefault();

    /**
     * True if has "default" attribute
     */
    boolean isSetDefault();

    /**
     * Sets the "default" attribute
     */
    void setDefault(java.lang.String xdefault);

    /**
     * Sets (as xml) the "default" attribute
     */
    void xsetDefault(org.apache.xmlbeans.XmlString xdefault);

    /**
     * Unsets the "default" attribute
     */
    void unsetDefault();

    /**
     * Gets the "fixed" attribute
     */
    java.lang.String getFixed();

    /**
     * Gets (as xml) the "fixed" attribute
     */
    org.apache.xmlbeans.XmlString xgetFixed();

    /**
     * True if has "fixed" attribute
     */
    boolean isSetFixed();

    /**
     * Sets the "fixed" attribute
     */
    void setFixed(java.lang.String fixed);

    /**
     * Sets (as xml) the "fixed" attribute
     */
    void xsetFixed(org.apache.xmlbeans.XmlString fixed);

    /**
     * Unsets the "fixed" attribute
     */
    void unsetFixed();

    /**
     * Gets the "nillable" attribute
     */
    boolean getNillable();

    /**
     * Gets (as xml) the "nillable" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetNillable();

    /**
     * True if has "nillable" attribute
     */
    boolean isSetNillable();

    /**
     * Sets the "nillable" attribute
     */
    void setNillable(boolean nillable);

    /**
     * Sets (as xml) the "nillable" attribute
     */
    void xsetNillable(org.apache.xmlbeans.XmlBoolean nillable);

    /**
     * Unsets the "nillable" attribute
     */
    void unsetNillable();

    /**
     * Gets the "abstract" attribute
     */
    boolean getAbstract();

    /**
     * Gets (as xml) the "abstract" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAbstract();

    /**
     * True if has "abstract" attribute
     */
    boolean isSetAbstract();

    /**
     * Sets the "abstract" attribute
     */
    void setAbstract(boolean xabstract);

    /**
     * Sets (as xml) the "abstract" attribute
     */
    void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract);

    /**
     * Unsets the "abstract" attribute
     */
    void unsetAbstract();

    /**
     * Gets the "final" attribute
     */
    java.lang.Object getFinal();

    /**
     * Gets (as xml) the "final" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet xgetFinal();

    /**
     * True if has "final" attribute
     */
    boolean isSetFinal();

    /**
     * Sets the "final" attribute
     */
    void setFinal(java.lang.Object xfinal);

    /**
     * Sets (as xml) the "final" attribute
     */
    void xsetFinal(org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet xfinal);

    /**
     * Unsets the "final" attribute
     */
    void unsetFinal();

    /**
     * Gets the "block" attribute
     */
    java.lang.Object getBlock();

    /**
     * Gets (as xml) the "block" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.BlockSet xgetBlock();

    /**
     * True if has "block" attribute
     */
    boolean isSetBlock();

    /**
     * Sets the "block" attribute
     */
    void setBlock(java.lang.Object block);

    /**
     * Sets (as xml) the "block" attribute
     */
    void xsetBlock(org.apache.xmlbeans.impl.xb.xsdschema.BlockSet block);

    /**
     * Unsets the "block" attribute
     */
    void unsetBlock();

    /**
     * Gets the "form" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum getForm();

    /**
     * Gets (as xml) the "form" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.FormChoice xgetForm();

    /**
     * True if has "form" attribute
     */
    boolean isSetForm();

    /**
     * Sets the "form" attribute
     */
    void setForm(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum form);

    /**
     * Sets (as xml) the "form" attribute
     */
    void xsetForm(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice form);

    /**
     * Unsets the "form" attribute
     */
    void unsetForm();
}
