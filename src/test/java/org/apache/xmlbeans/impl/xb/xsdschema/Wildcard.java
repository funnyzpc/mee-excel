/*
 * XML Type:  wildcard
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Wildcard
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML wildcard(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface Wildcard extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.Wildcard> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "wildcarde0b9type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "namespace" attribute
     */
    java.lang.Object getNamespace();

    /**
     * Gets (as xml) the "namespace" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList xgetNamespace();

    /**
     * True if has "namespace" attribute
     */
    boolean isSetNamespace();

    /**
     * Sets the "namespace" attribute
     */
    void setNamespace(java.lang.Object namespace);

    /**
     * Sets (as xml) the "namespace" attribute
     */
    void xsetNamespace(org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList namespace);

    /**
     * Unsets the "namespace" attribute
     */
    void unsetNamespace();

    /**
     * Gets the "processContents" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents.Enum getProcessContents();

    /**
     * Gets (as xml) the "processContents" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents xgetProcessContents();

    /**
     * True if has "processContents" attribute
     */
    boolean isSetProcessContents();

    /**
     * Sets the "processContents" attribute
     */
    void setProcessContents(org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents.Enum processContents);

    /**
     * Sets (as xml) the "processContents" attribute
     */
    void xsetProcessContents(org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents processContents);

    /**
     * Unsets the "processContents" attribute
     */
    void unsetProcessContents();

    /**
     * An XML processContents(@).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.Wildcard$ProcessContents.
     */
    public interface ProcessContents extends org.apache.xmlbeans.XmlNMTOKEN {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.Wildcard.ProcessContents> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "processcontents864aattrtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
        void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

        Enum SKIP = Enum.forString("skip");
        Enum LAX = Enum.forString("lax");
        Enum STRICT = Enum.forString("strict");

        int INT_SKIP = Enum.INT_SKIP;
        int INT_LAX = Enum.INT_LAX;
        int INT_STRICT = Enum.INT_STRICT;

        /**
         * Enumeration value class for org.apache.xmlbeans.impl.xb.xsdschema.Wildcard$ProcessContents.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_SKIP
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

            static final int INT_SKIP = 1;
            static final int INT_LAX = 2;
            static final int INT_STRICT = 3;

            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                new Enum("skip", INT_SKIP),
                new Enum("lax", INT_LAX),
                new Enum("strict", INT_STRICT),
            });
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() {
                return forInt(intValue());
            }
        }
    }
}
