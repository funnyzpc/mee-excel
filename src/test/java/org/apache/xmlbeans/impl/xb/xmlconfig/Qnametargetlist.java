/*
 * XML Type:  qnametargetlist
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xmlbeans.impl.xb.xmlconfig.Qnametargetlist
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlconfig;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML qnametargetlist(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a list type whose items are org.apache.xmlbeans.impl.xb.xmlconfig.Qnametargetenum.
 */
public interface Qnametargetlist extends org.apache.xmlbeans.XmlAnySimpleType {
    java.util.List getListValue();
    java.util.List xgetListValue();
    void setListValue(java.util.List<?> list);
    SimpleTypeFactory<org.apache.xmlbeans.impl.xb.xmlconfig.Qnametargetlist> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "qnametargetlist16actype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();

}
