/*
 * XML Type:  attribute
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Attribute
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML attribute(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface Attribute extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.Attribute> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "attribute83a9type");
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
     * Gets the "use" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use.Enum getUse();

    /**
     * Gets (as xml) the "use" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use xgetUse();

    /**
     * True if has "use" attribute
     */
    boolean isSetUse();

    /**
     * Sets the "use" attribute
     */
    void setUse(org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use.Enum use);

    /**
     * Sets (as xml) the "use" attribute
     */
    void xsetUse(org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use use);

    /**
     * Unsets the "use" attribute
     */
    void unsetUse();

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

    /**
     * An XML use(@).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.Attribute$Use.
     */
    public interface Use extends org.apache.xmlbeans.XmlNMTOKEN {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "usea41aattrtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
        void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

        Enum PROHIBITED = Enum.forString("prohibited");
        Enum OPTIONAL = Enum.forString("optional");
        Enum REQUIRED = Enum.forString("required");

        int INT_PROHIBITED = Enum.INT_PROHIBITED;
        int INT_OPTIONAL = Enum.INT_OPTIONAL;
        int INT_REQUIRED = Enum.INT_REQUIRED;

        /**
         * Enumeration value class for org.apache.xmlbeans.impl.xb.xsdschema.Attribute$Use.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_PROHIBITED
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s) {
                return (Enum)table.forString(s);
            }

            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i) {
                return (Enum)table.forInt(i);
            }

            private Enum(java.lang.String s, int i) {
                super(s, i);
            }

            static final int INT_PROHIBITED = 1;
            static final int INT_OPTIONAL = 2;
            static final int INT_REQUIRED = 3;

            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                new Enum("prohibited", INT_PROHIBITED),
                new Enum("optional", INT_OPTIONAL),
                new Enum("required", INT_REQUIRED),
            });
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() {
                return forInt(intValue());
            }
        }
    }
}
