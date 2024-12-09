/*
 * XML Type:  namespaceList
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML namespaceList(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList$Member
 *     org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList$Member2
 */
public interface NamespaceList extends org.apache.xmlbeans.XmlAnySimpleType {
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    SimpleTypeFactory<org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "namespacelist10cctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList$Member.
     */
    public interface Member extends org.apache.xmlbeans.XmlToken {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList.Member> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "anonfac7type");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
        void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

        Enum ANY = Enum.forString("##any");
        Enum OTHER = Enum.forString("##other");

        int INT_ANY = Enum.INT_ANY;
        int INT_OTHER = Enum.INT_OTHER;

        /**
         * Enumeration value class for org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList$Member.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ANY
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

            static final int INT_ANY = 1;
            static final int INT_OTHER = 2;

            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                new Enum("##any", INT_ANY),
                new Enum("##other", INT_OTHER),
            });
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() {
                return forInt(intValue());
            }
        }
    }

    /**
     * An anonymous inner XML type.
     *
     * This is a list type whose items are org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList$Member2$Item.
     */
    public interface Member2 extends org.apache.xmlbeans.XmlAnySimpleType {
        java.util.List getListValue();
        java.util.List xgetListValue();
        void setListValue(java.util.List<?> list);
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList.Member2> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "anona0e6type");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An anonymous inner XML type.
         *
         * This is a union type. Instances are of one of the following types:
         *     org.apache.xmlbeans.XmlAnyURI
         *     org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList$Member2$Item$Member
         */
        public interface Item extends org.apache.xmlbeans.XmlAnySimpleType {
            java.lang.Object getObjectValue();
            void setObjectValue(java.lang.Object val);
            org.apache.xmlbeans.SchemaType instanceType();
            ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList.Member2.Item> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "anon16cetype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            /**
             * An anonymous inner XML type.
             *
             * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList$Member2$Item$Member.
             */
            public interface Member extends org.apache.xmlbeans.XmlToken {
                ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList.Member2.Item.Member> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "anon0c73type");
                org.apache.xmlbeans.SchemaType type = Factory.getType();


                org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
                void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

                Enum TARGET_NAMESPACE = Enum.forString("##targetNamespace");
                Enum LOCAL = Enum.forString("##local");

                int INT_TARGET_NAMESPACE = Enum.INT_TARGET_NAMESPACE;
                int INT_LOCAL = Enum.INT_LOCAL;

                /**
                 * Enumeration value class for org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList$Member2$Item$Member.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_TARGET_NAMESPACE
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

                    static final int INT_TARGET_NAMESPACE = 1;
                    static final int INT_LOCAL = 2;

                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                      new Enum("##targetNamespace", INT_TARGET_NAMESPACE),
                      new Enum("##local", INT_LOCAL),
                    });
                    private static final long serialVersionUID = 1L;
                    private java.lang.Object readResolve() {
                        return forInt(intValue());
                    }
                }
            }
        }
    }
}
