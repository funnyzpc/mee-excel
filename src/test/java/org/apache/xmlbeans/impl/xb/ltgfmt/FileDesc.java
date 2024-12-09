/*
 * XML Type:  file-desc
 * Namespace: http://www.bea.com/2003/05/xmlbean/ltgfmt
 * Java type: org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.ltgfmt;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML file-desc(@http://www.bea.com/2003/05/xmlbean/ltgfmt).
 *
 * This is a complex type.
 */
public interface FileDesc extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "filedesc9392type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "code" element
     */
    org.apache.xmlbeans.impl.xb.ltgfmt.Code getCode();

    /**
     * True if has "code" element
     */
    boolean isSetCode();

    /**
     * Sets the "code" element
     */
    void setCode(org.apache.xmlbeans.impl.xb.ltgfmt.Code code);

    /**
     * Appends and returns a new empty "code" element
     */
    org.apache.xmlbeans.impl.xb.ltgfmt.Code addNewCode();

    /**
     * Unsets the "code" element
     */
    void unsetCode();

    /**
     * Gets the "tsDir" attribute
     */
    java.lang.String getTsDir();

    /**
     * Gets (as xml) the "tsDir" attribute
     */
    org.apache.xmlbeans.XmlToken xgetTsDir();

    /**
     * True if has "tsDir" attribute
     */
    boolean isSetTsDir();

    /**
     * Sets the "tsDir" attribute
     */
    void setTsDir(java.lang.String tsDir);

    /**
     * Sets (as xml) the "tsDir" attribute
     */
    void xsetTsDir(org.apache.xmlbeans.XmlToken tsDir);

    /**
     * Unsets the "tsDir" attribute
     */
    void unsetTsDir();

    /**
     * Gets the "folder" attribute
     */
    java.lang.String getFolder();

    /**
     * Gets (as xml) the "folder" attribute
     */
    org.apache.xmlbeans.XmlToken xgetFolder();

    /**
     * True if has "folder" attribute
     */
    boolean isSetFolder();

    /**
     * Sets the "folder" attribute
     */
    void setFolder(java.lang.String folder);

    /**
     * Sets (as xml) the "folder" attribute
     */
    void xsetFolder(org.apache.xmlbeans.XmlToken folder);

    /**
     * Unsets the "folder" attribute
     */
    void unsetFolder();

    /**
     * Gets the "fileName" attribute
     */
    java.lang.String getFileName();

    /**
     * Gets (as xml) the "fileName" attribute
     */
    org.apache.xmlbeans.XmlToken xgetFileName();

    /**
     * True if has "fileName" attribute
     */
    boolean isSetFileName();

    /**
     * Sets the "fileName" attribute
     */
    void setFileName(java.lang.String fileName);

    /**
     * Sets (as xml) the "fileName" attribute
     */
    void xsetFileName(org.apache.xmlbeans.XmlToken fileName);

    /**
     * Unsets the "fileName" attribute
     */
    void unsetFileName();

    /**
     * Gets the "role" attribute
     */
    org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role.Enum getRole();

    /**
     * Gets (as xml) the "role" attribute
     */
    org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role xgetRole();

    /**
     * True if has "role" attribute
     */
    boolean isSetRole();

    /**
     * Sets the "role" attribute
     */
    void setRole(org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role.Enum role);

    /**
     * Sets (as xml) the "role" attribute
     */
    void xsetRole(org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role role);

    /**
     * Unsets the "role" attribute
     */
    void unsetRole();

    /**
     * Gets the "validity" attribute
     */
    boolean getValidity();

    /**
     * Gets (as xml) the "validity" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetValidity();

    /**
     * True if has "validity" attribute
     */
    boolean isSetValidity();

    /**
     * Sets the "validity" attribute
     */
    void setValidity(boolean validity);

    /**
     * Sets (as xml) the "validity" attribute
     */
    void xsetValidity(org.apache.xmlbeans.XmlBoolean validity);

    /**
     * Unsets the "validity" attribute
     */
    void unsetValidity();

    /**
     * An XML role(@).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc$Role.
     */
    public interface Role extends org.apache.xmlbeans.XmlToken {
        ElementFactory<org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc.Role> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "role21a8attrtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
        void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

        Enum SCHEMA = Enum.forString("schema");
        Enum INSTANCE = Enum.forString("instance");
        Enum RESOURCE = Enum.forString("resource");

        int INT_SCHEMA = Enum.INT_SCHEMA;
        int INT_INSTANCE = Enum.INT_INSTANCE;
        int INT_RESOURCE = Enum.INT_RESOURCE;

        /**
         * Enumeration value class for org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc$Role.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_SCHEMA
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

            static final int INT_SCHEMA = 1;
            static final int INT_INSTANCE = 2;
            static final int INT_RESOURCE = 3;

            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                new Enum("schema", INT_SCHEMA),
                new Enum("instance", INT_INSTANCE),
                new Enum("resource", INT_RESOURCE),
            });
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() {
                return forInt(intValue());
            }
        }
    }
}
