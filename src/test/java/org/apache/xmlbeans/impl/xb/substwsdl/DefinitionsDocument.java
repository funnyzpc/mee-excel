/*
 * An XML document type.
 * Localname: definitions
 * Namespace: http://www.apache.org/internal/xmlbeans/wsdlsubst
 * Java type: org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.substwsdl;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one definitions(@http://www.apache.org/internal/xmlbeans/wsdlsubst) element.
 *
 * This is a complex type.
 */
public interface DefinitionsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "definitionsc7f1doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "definitions" element
     */
    org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions getDefinitions();

    /**
     * Sets the "definitions" element
     */
    void setDefinitions(org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions definitions);

    /**
     * Appends and returns a new empty "definitions" element
     */
    org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions addNewDefinitions();

    /**
     * An XML definitions(@http://www.apache.org/internal/xmlbeans/wsdlsubst).
     *
     * This is a complex type.
     */
    public interface Definitions extends org.apache.xmlbeans.XmlObject {
        ElementFactory<org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "definitions05ddelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "import" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.substwsdl.TImport> getImportList();

        /**
         * Gets array of all "import" elements
         */
        org.apache.xmlbeans.impl.xb.substwsdl.TImport[] getImportArray();

        /**
         * Gets ith "import" element
         */
        org.apache.xmlbeans.impl.xb.substwsdl.TImport getImportArray(int i);

        /**
         * Returns number of "import" element
         */
        int sizeOfImportArray();

        /**
         * Sets array of all "import" element
         */
        void setImportArray(org.apache.xmlbeans.impl.xb.substwsdl.TImport[] ximportArray);

        /**
         * Sets ith "import" element
         */
        void setImportArray(int i, org.apache.xmlbeans.impl.xb.substwsdl.TImport ximport);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "import" element
         */
        org.apache.xmlbeans.impl.xb.substwsdl.TImport insertNewImport(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "import" element
         */
        org.apache.xmlbeans.impl.xb.substwsdl.TImport addNewImport();

        /**
         * Removes the ith "import" element
         */
        void removeImport(int i);

        /**
         * Gets a List of "types" elements
         */
        java.util.List<org.apache.xmlbeans.XmlObject> getTypesList();

        /**
         * Gets array of all "types" elements
         */
        org.apache.xmlbeans.XmlObject[] getTypesArray();

        /**
         * Gets ith "types" element
         */
        org.apache.xmlbeans.XmlObject getTypesArray(int i);

        /**
         * Returns number of "types" element
         */
        int sizeOfTypesArray();

        /**
         * Sets array of all "types" element
         */
        void setTypesArray(org.apache.xmlbeans.XmlObject[] typesArray);

        /**
         * Sets ith "types" element
         */
        void setTypesArray(int i, org.apache.xmlbeans.XmlObject types);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "types" element
         */
        org.apache.xmlbeans.XmlObject insertNewTypes(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "types" element
         */
        org.apache.xmlbeans.XmlObject addNewTypes();

        /**
         * Removes the ith "types" element
         */
        void removeTypes(int i);

        /**
         * Gets a List of "message" elements
         */
        java.util.List<org.apache.xmlbeans.XmlObject> getMessageList();

        /**
         * Gets array of all "message" elements
         */
        org.apache.xmlbeans.XmlObject[] getMessageArray();

        /**
         * Gets ith "message" element
         */
        org.apache.xmlbeans.XmlObject getMessageArray(int i);

        /**
         * Returns number of "message" element
         */
        int sizeOfMessageArray();

        /**
         * Sets array of all "message" element
         */
        void setMessageArray(org.apache.xmlbeans.XmlObject[] messageArray);

        /**
         * Sets ith "message" element
         */
        void setMessageArray(int i, org.apache.xmlbeans.XmlObject message);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "message" element
         */
        org.apache.xmlbeans.XmlObject insertNewMessage(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "message" element
         */
        org.apache.xmlbeans.XmlObject addNewMessage();

        /**
         * Removes the ith "message" element
         */
        void removeMessage(int i);

        /**
         * Gets a List of "binding" elements
         */
        java.util.List<org.apache.xmlbeans.XmlObject> getBindingList();

        /**
         * Gets array of all "binding" elements
         */
        org.apache.xmlbeans.XmlObject[] getBindingArray();

        /**
         * Gets ith "binding" element
         */
        org.apache.xmlbeans.XmlObject getBindingArray(int i);

        /**
         * Returns number of "binding" element
         */
        int sizeOfBindingArray();

        /**
         * Sets array of all "binding" element
         */
        void setBindingArray(org.apache.xmlbeans.XmlObject[] bindingArray);

        /**
         * Sets ith "binding" element
         */
        void setBindingArray(int i, org.apache.xmlbeans.XmlObject binding);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "binding" element
         */
        org.apache.xmlbeans.XmlObject insertNewBinding(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "binding" element
         */
        org.apache.xmlbeans.XmlObject addNewBinding();

        /**
         * Removes the ith "binding" element
         */
        void removeBinding(int i);

        /**
         * Gets a List of "portType" elements
         */
        java.util.List<org.apache.xmlbeans.XmlObject> getPortTypeList();

        /**
         * Gets array of all "portType" elements
         */
        org.apache.xmlbeans.XmlObject[] getPortTypeArray();

        /**
         * Gets ith "portType" element
         */
        org.apache.xmlbeans.XmlObject getPortTypeArray(int i);

        /**
         * Returns number of "portType" element
         */
        int sizeOfPortTypeArray();

        /**
         * Sets array of all "portType" element
         */
        void setPortTypeArray(org.apache.xmlbeans.XmlObject[] portTypeArray);

        /**
         * Sets ith "portType" element
         */
        void setPortTypeArray(int i, org.apache.xmlbeans.XmlObject portType);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "portType" element
         */
        org.apache.xmlbeans.XmlObject insertNewPortType(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "portType" element
         */
        org.apache.xmlbeans.XmlObject addNewPortType();

        /**
         * Removes the ith "portType" element
         */
        void removePortType(int i);

        /**
         * Gets a List of "service" elements
         */
        java.util.List<org.apache.xmlbeans.XmlObject> getServiceList();

        /**
         * Gets array of all "service" elements
         */
        org.apache.xmlbeans.XmlObject[] getServiceArray();

        /**
         * Gets ith "service" element
         */
        org.apache.xmlbeans.XmlObject getServiceArray(int i);

        /**
         * Returns number of "service" element
         */
        int sizeOfServiceArray();

        /**
         * Sets array of all "service" element
         */
        void setServiceArray(org.apache.xmlbeans.XmlObject[] serviceArray);

        /**
         * Sets ith "service" element
         */
        void setServiceArray(int i, org.apache.xmlbeans.XmlObject service);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "service" element
         */
        org.apache.xmlbeans.XmlObject insertNewService(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "service" element
         */
        org.apache.xmlbeans.XmlObject addNewService();

        /**
         * Removes the ith "service" element
         */
        void removeService(int i);
    }
}
