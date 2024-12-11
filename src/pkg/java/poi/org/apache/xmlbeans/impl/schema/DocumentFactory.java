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

package poi.org.apache.xmlbeans.impl.schema;

import poi.org.apache.xmlbeans.SchemaTypeSystem;
import poi.org.apache.xmlbeans.XmlOptions;

@SuppressWarnings("unchecked")
public class DocumentFactory<T> extends AbstractDocumentFactory<T> {
    public DocumentFactory(SchemaTypeSystem typeSystem, String typeHandle) {
        super(typeSystem, typeHandle);
    }

    public T newInstance() {
        return (T) getTypeLoader().newInstance(getType(), null);
    }


    public T newInstance(XmlOptions options) {
        return (T) getTypeLoader().newInstance(getType(), options);
    }
}