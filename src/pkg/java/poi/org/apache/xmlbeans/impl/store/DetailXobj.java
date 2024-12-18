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

package poi.org.apache.xmlbeans.impl.store;

import poi.org.apache.xmlbeans.impl.soap.Detail;
import poi.org.apache.xmlbeans.impl.soap.DetailEntry;
import poi.org.apache.xmlbeans.impl.soap.Name;

import javax.xml.namespace.QName;
import java.util.Iterator;

class DetailXobj extends SoapFaultElementXobj implements Detail {
    DetailXobj(Locale l, QName name) {
        super(l, name);
    }

    Xobj newNode(Locale l) {
        return new DetailXobj(l, _name);
    }

    public DetailEntry addDetailEntry(Name name) {
        return DomImpl.detail_addDetailEntry(this, name);
    }

    public Iterator<DetailEntry> getDetailEntries() {
        return DomImpl.detail_getDetailEntries(this);
    }
}
