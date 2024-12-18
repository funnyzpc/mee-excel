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
import poi.org.apache.xmlbeans.impl.soap.MimeHeader;
import poi.org.apache.xmlbeans.impl.soap.Name;
import poi.org.apache.xmlbeans.impl.soap.SOAPBody;
import poi.org.apache.xmlbeans.impl.soap.SOAPBodyElement;
import poi.org.apache.xmlbeans.impl.soap.SOAPElement;
import poi.org.apache.xmlbeans.impl.soap.SOAPEnvelope;
import poi.org.apache.xmlbeans.impl.soap.SOAPException;
import poi.org.apache.xmlbeans.impl.soap.SOAPFault;
import poi.org.apache.xmlbeans.impl.soap.SOAPHeader;
import poi.org.apache.xmlbeans.impl.soap.SOAPHeaderElement;
import poi.org.apache.xmlbeans.impl.soap.SOAPPart;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import poi.org.apache.xmlbeans.impl.soap.Text;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import java.util.Iterator;
import java.util.Locale;

public interface Saaj
{

    public interface SaajCallback
    {
        void   setSaajData ( Node n, Object o );
        Object getSaajData ( Node n );

        Element createSoapElement ( QName name, QName parentName );

        Element importSoapElement ( Document doc, Element elem, boolean deep, QName parentName );
    }

    void setCallback ( SaajCallback callback );

    Class identifyElement ( QName name, QName parentName );

    void        soapNode_detachNode       ( poi.org.apache.xmlbeans.impl.soap.Node soapNode );
    void        soapNode_recycleNode      ( poi.org.apache.xmlbeans.impl.soap.Node node );
    String      soapNode_getValue         ( poi.org.apache.xmlbeans.impl.soap.Node node );
    void        soapNode_setValue         (poi.org.apache.xmlbeans.impl.soap.Node node, String value );
    SOAPElement soapNode_getParentElement (poi.org.apache.xmlbeans.impl.soap.Node node );
    void        soapNode_setParentElement (poi.org.apache.xmlbeans.impl.soap.Node node, SOAPElement soapElement );

    void        soapElement_removeContents              ( SOAPElement soapElement );
    String      soapElement_getEncodingStyle            ( SOAPElement soapElement );
    void        soapElement_setEncodingStyle            ( SOAPElement soapElement, String encodingStyle );
    boolean     soapElement_removeNamespaceDeclaration  ( SOAPElement soapElement, String prefix );
    Iterator<Name>         soapElement_getAllAttributes            (SOAPElement soapElement );
    Iterator<SOAPElement>  soapElement_getChildElements            ( SOAPElement parent );
    Iterator<String>       soapElement_getNamespacePrefixes        ( SOAPElement soapElement );
    SOAPElement soapElement_addAttribute                ( SOAPElement soapElement, Name name, String value ) throws SOAPException;
    SOAPElement soapElement_addChildElement             ( SOAPElement parent, SOAPElement oldChild ) throws SOAPException;
    SOAPElement soapElement_addChildElement             ( SOAPElement soapElement, Name name ) throws SOAPException;
    SOAPElement soapElement_addChildElement             ( SOAPElement soapElement, String localName ) throws SOAPException;
    SOAPElement soapElement_addChildElement             ( SOAPElement soapElement, String localName, String prefix ) throws SOAPException;
    SOAPElement soapElement_addChildElement             ( SOAPElement soapElement, String localName, String prefix, String uri ) throws SOAPException;
    SOAPElement soapElement_addNamespaceDeclaration     ( SOAPElement soapElement, String prefix, String uri );
    SOAPElement soapElement_addTextNode                 ( SOAPElement soapElement, String data );
    String      soapElement_getAttributeValue           ( SOAPElement soapElement, Name name );
    Iterator    soapElement_getChildElements            ( SOAPElement parent, Name name );
    Name        soapElement_getElementName              ( SOAPElement soapElement );
    String      soapElement_getNamespaceURI             ( SOAPElement soapElement, String prefix );
    Iterator    soapElement_getVisibleNamespacePrefixes ( SOAPElement soapElement );
    boolean     soapElement_removeAttribute             ( SOAPElement soapElement, Name name );

    SOAPBody soapEnvelope_addBody    (SOAPEnvelope soapEnvelope ) throws SOAPException;
    SOAPBody   soapEnvelope_getBody    ( SOAPEnvelope soapEnvelope ) throws SOAPException;
    SOAPHeader soapEnvelope_getHeader  (SOAPEnvelope soapEnvelope ) throws SOAPException;
    SOAPHeader soapEnvelope_addHeader  ( SOAPEnvelope soapEnvelope ) throws SOAPException;
    Name       soapEnvelope_createName ( SOAPEnvelope soapEnvelope, String localName );
    Name       soapEnvelope_createName ( SOAPEnvelope soapEnvelope, String localName, String prefix, String namespaceURI );

    Iterator<SOAPHeaderElement> soapHeader_examineAllHeaderElements            (SOAPHeader soapHeader );
    Iterator<SOAPHeaderElement> soapHeader_extractAllHeaderElements            ( SOAPHeader soapHeader );
    Iterator<SOAPHeaderElement> soapHeader_examineHeaderElements               ( SOAPHeader soapHeader, String actor );
    Iterator<SOAPHeaderElement> soapHeader_examineMustUnderstandHeaderElements ( SOAPHeader soapHeader, String mustUnderstandString );
    Iterator<SOAPHeaderElement> soapHeader_extractHeaderElements               ( SOAPHeader soapHeader, String actor );
    SOAPHeaderElement soapHeader_addHeaderElement                    ( SOAPHeader soapHeader, Name name );

    void         soapPart_removeAllMimeHeaders      ( SOAPPart soapPart );
    void         soapPart_removeMimeHeader          ( SOAPPart soapPart, String name );
    Iterator<MimeHeader> soapPart_getAllMimeHeaders         (SOAPPart soapPart );
    SOAPEnvelope soapPart_getEnvelope               ( SOAPPart soapPart );
    Source       soapPart_getContent                ( SOAPPart soapPart );
    void         soapPart_setContent                ( SOAPPart soapPart, Source source );
    String[]     soapPart_getMimeHeader             ( SOAPPart soapPart, String name );
    void         soapPart_addMimeHeader             ( SOAPPart soapPart, String name, String value );
    void         soapPart_setMimeHeader             ( SOAPPart soapPart, String name, String value );
    Iterator<MimeHeader> soapPart_getMatchingMimeHeaders    ( SOAPPart soapPart, String[] names );
    Iterator<MimeHeader> soapPart_getNonMatchingMimeHeaders ( SOAPPart soapPart, String[] names );

    boolean         soapBody_hasFault       ( SOAPBody soapBody );
    SOAPFault soapBody_addFault       (SOAPBody soapBody ) throws SOAPException;
    SOAPFault       soapBody_getFault       ( SOAPBody soapBody );
    SOAPBodyElement soapBody_addBodyElement (SOAPBody soapBody, Name name );
    SOAPBodyElement soapBody_addDocument    ( SOAPBody soapBody, Document document );
    SOAPFault       soapBody_addFault       ( SOAPBody soapBody, Name name, String s ) throws SOAPException;
    SOAPFault       soapBody_addFault       ( SOAPBody soapBody, Name faultCode, String faultString, Locale locale ) throws SOAPException;

    Detail soapFault_addDetail            (SOAPFault soapFault ) throws SOAPException;
    Detail   soapFault_getDetail            ( SOAPFault soapFault );
    String   soapFault_getFaultActor        ( SOAPFault soapFault );
    String   soapFault_getFaultCode         ( SOAPFault soapFault );
    Name     soapFault_getFaultCodeAsName   ( SOAPFault soapFault );
    String   soapFault_getFaultString       ( SOAPFault soapFault );
    Locale   soapFault_getFaultStringLocale ( SOAPFault soapFault );
    void     soapFault_setFaultActor        ( SOAPFault soapFault, String faultActorString );
    void     soapFault_setFaultCode         ( SOAPFault soapFault, Name faultCodeName ) throws SOAPException;
    void     soapFault_setFaultCode         ( SOAPFault soapFault, String faultCode ) throws SOAPException;
    void     soapFault_setFaultString       ( SOAPFault soapFault, String faultString );
    void     soapFault_setFaultString       ( SOAPFault soapFault, String faultString, Locale locale );

    void    soapHeaderElement_setMustUnderstand ( SOAPHeaderElement soapHeaderElement, boolean mustUnderstand );
    boolean soapHeaderElement_getMustUnderstand ( SOAPHeaderElement soapHeaderElement );
    void    soapHeaderElement_setActor          ( SOAPHeaderElement soapHeaderElement, String actor );
    String  soapHeaderElement_getActor          ( SOAPHeaderElement soapHeaderElement );

    boolean soapText_isComment ( Text text );

    DetailEntry detail_addDetailEntry   (Detail detail, Name name );
    Iterator<DetailEntry> detail_getDetailEntries ( Detail detail );
}