/*
 * XML Type:  qnameconfig
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlconfig;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML qnameconfig(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a complex type.
 */
public interface Qnameconfig extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "qnameconfig463ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "name" attribute
     */
    javax.xml.namespace.QName getName();

    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlQName xgetName();

    /**
     * True if has "name" attribute
     */
    boolean isSetName();

    /**
     * Sets the "name" attribute
     */
    void setName(javax.xml.namespace.QName name);

    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlQName name);

    /**
     * Unsets the "name" attribute
     */
    void unsetName();

    /**
     * Gets the "javaname" attribute
     */
    java.lang.String getJavaname();

    /**
     * Gets (as xml) the "javaname" attribute
     */
    org.apache.xmlbeans.XmlString xgetJavaname();

    /**
     * True if has "javaname" attribute
     */
    boolean isSetJavaname();

    /**
     * Sets the "javaname" attribute
     */
    void setJavaname(java.lang.String javaname);

    /**
     * Sets (as xml) the "javaname" attribute
     */
    void xsetJavaname(org.apache.xmlbeans.XmlString javaname);

    /**
     * Unsets the "javaname" attribute
     */
    void unsetJavaname();

    /**
     * Gets the "target" attribute
     */
    java.util.List getTarget();

    /**
     * Gets (as xml) the "target" attribute
     */
    org.apache.xmlbeans.impl.xb.xmlconfig.Qnametargetlist xgetTarget();

    /**
     * True if has "target" attribute
     */
    boolean isSetTarget();

    /**
     * Sets the "target" attribute
     */
    void setTarget(java.util.List target);

    /**
     * Sets (as xml) the "target" attribute
     */
    void xsetTarget(org.apache.xmlbeans.impl.xb.xmlconfig.Qnametargetlist target);

    /**
     * Unsets the "target" attribute
     */
    void unsetTarget();
}
