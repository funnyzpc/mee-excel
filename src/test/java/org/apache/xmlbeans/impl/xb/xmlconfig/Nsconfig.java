/*
 * XML Type:  nsconfig
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlconfig;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML nsconfig(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a complex type.
 */
public interface Nsconfig extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "nsconfigaebatype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "package" element
     */
    java.lang.String getPackage();

    /**
     * Gets (as xml) the "package" element
     */
    org.apache.xmlbeans.XmlString xgetPackage();

    /**
     * True if has "package" element
     */
    boolean isSetPackage();

    /**
     * Sets the "package" element
     */
    void setPackage(java.lang.String xpackage);

    /**
     * Sets (as xml) the "package" element
     */
    void xsetPackage(org.apache.xmlbeans.XmlString xpackage);

    /**
     * Unsets the "package" element
     */
    void unsetPackage();

    /**
     * Gets the "prefix" element
     */
    java.lang.String getPrefix();

    /**
     * Gets (as xml) the "prefix" element
     */
    org.apache.xmlbeans.XmlString xgetPrefix();

    /**
     * True if has "prefix" element
     */
    boolean isSetPrefix();

    /**
     * Sets the "prefix" element
     */
    void setPrefix(java.lang.String prefix);

    /**
     * Sets (as xml) the "prefix" element
     */
    void xsetPrefix(org.apache.xmlbeans.XmlString prefix);

    /**
     * Unsets the "prefix" element
     */
    void unsetPrefix();

    /**
     * Gets the "suffix" element
     */
    java.lang.String getSuffix();

    /**
     * Gets (as xml) the "suffix" element
     */
    org.apache.xmlbeans.XmlString xgetSuffix();

    /**
     * True if has "suffix" element
     */
    boolean isSetSuffix();

    /**
     * Sets the "suffix" element
     */
    void setSuffix(java.lang.String suffix);

    /**
     * Sets (as xml) the "suffix" element
     */
    void xsetSuffix(org.apache.xmlbeans.XmlString suffix);

    /**
     * Unsets the "suffix" element
     */
    void unsetSuffix();

    /**
     * Gets the "uri" attribute
     */
    java.lang.Object getUri();

    /**
     * Gets (as xml) the "uri" attribute
     */
    org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList xgetUri();

    /**
     * True if has "uri" attribute
     */
    boolean isSetUri();

    /**
     * Sets the "uri" attribute
     */
    void setUri(java.lang.Object uri);

    /**
     * Sets (as xml) the "uri" attribute
     */
    void xsetUri(org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList uri);

    /**
     * Unsets the "uri" attribute
     */
    void unsetUri();

    /**
     * Gets the "uriprefix" attribute
     */
    java.util.List getUriprefix();

    /**
     * Gets (as xml) the "uriprefix" attribute
     */
    org.apache.xmlbeans.impl.xb.xmlconfig.NamespacePrefixList xgetUriprefix();

    /**
     * True if has "uriprefix" attribute
     */
    boolean isSetUriprefix();

    /**
     * Sets the "uriprefix" attribute
     */
    void setUriprefix(java.util.List uriprefix);

    /**
     * Sets (as xml) the "uriprefix" attribute
     */
    void xsetUriprefix(org.apache.xmlbeans.impl.xb.xmlconfig.NamespacePrefixList uriprefix);

    /**
     * Unsets the "uriprefix" attribute
     */
    void unsetUriprefix();
}
