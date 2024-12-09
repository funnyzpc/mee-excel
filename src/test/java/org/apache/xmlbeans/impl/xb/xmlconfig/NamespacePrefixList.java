/*
 * XML Type:  namespacePrefixList
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xmlbeans.impl.xb.xmlconfig.NamespacePrefixList
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlconfig;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML namespacePrefixList(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a list type whose items are org.apache.xmlbeans.XmlAnyURI.
 */
public interface NamespacePrefixList extends org.apache.xmlbeans.XmlAnySimpleType {
    java.util.List getListValue();
    java.util.List xgetListValue();
    void setListValue(java.util.List<?> list);
    SimpleTypeFactory<org.apache.xmlbeans.impl.xb.xmlconfig.NamespacePrefixList> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "namespaceprefixlistec0ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();

}
