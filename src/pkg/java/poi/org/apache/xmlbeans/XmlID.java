/*   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package poi.org.apache.xmlbeans;

import poi.org.apache.xmlbeans.impl.schema.XmlObjectFactory;

/**
 * Corresponds to the XML Schema
 * <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#ID">xs:ID</a> type.
 * <p>
 * When validated, IDs must be unique within a document.  An element
 * may not have more than one attribute whose type is ID.
 * <p>
 * Convertible to a {@link String}.
 */
public interface XmlID extends XmlNCName {
    XmlObjectFactory<XmlID> Factory = new XmlObjectFactory<>("_BI_ID");

    /**
     * The constant {@link SchemaType} object representing this schema type.
     */
    SchemaType type = Factory.getType();
}

