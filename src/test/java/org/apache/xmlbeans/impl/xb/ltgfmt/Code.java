/*
 * XML Type:  code
 * Namespace: http://www.bea.com/2003/05/xmlbean/ltgfmt
 * Java type: org.apache.xmlbeans.impl.xb.ltgfmt.Code
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.ltgfmt;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML code(@http://www.bea.com/2003/05/xmlbean/ltgfmt).
 *
 * This is a complex type.
 */
public interface Code extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.ltgfmt.Code> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "codef72ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ID" attribute
     */
    java.lang.String getID();

    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlToken xgetID();

    /**
     * True if has "ID" attribute
     */
    boolean isSetID();

    /**
     * Sets the "ID" attribute
     */
    void setID(java.lang.String id);

    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlToken id);

    /**
     * Unsets the "ID" attribute
     */
    void unsetID();
}
