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

import poi.org.apache.xmlbeans.impl.soap.Name;
import poi.org.apache.xmlbeans.impl.soap.SOAPHeader;
import poi.org.apache.xmlbeans.impl.soap.SOAPHeaderElement;

import javax.xml.namespace.QName;
import java.util.Iterator;

class SoapHeaderXobj extends SoapElementXobj implements SOAPHeader {
    SoapHeaderXobj(Locale l, QName name) {
        super(l, name);
    }

    Xobj newNode(Locale l) {
        return new SoapHeaderXobj(l, _name);
    }

    public Iterator<SOAPHeaderElement> examineAllHeaderElements() {
        return DomImpl.soapHeader_examineAllHeaderElements(this);
    }

    public Iterator<SOAPHeaderElement> extractAllHeaderElements() {
        return DomImpl.soapHeader_extractAllHeaderElements(this);
    }

    public Iterator<SOAPHeaderElement> examineHeaderElements(String actor) {
        return DomImpl.soapHeader_examineHeaderElements(this, actor);
    }

    public Iterator<SOAPHeaderElement> examineMustUnderstandHeaderElements(String mustUnderstandString) {
        return DomImpl.soapHeader_examineMustUnderstandHeaderElements(this, mustUnderstandString);
    }

    public Iterator<SOAPHeaderElement> extractHeaderElements(String actor) {
        return DomImpl.soapHeader_extractHeaderElements(this, actor);
    }

    public SOAPHeaderElement addHeaderElement(Name name) {
        return DomImpl.soapHeader_addHeaderElement(this, name);
    }
}
