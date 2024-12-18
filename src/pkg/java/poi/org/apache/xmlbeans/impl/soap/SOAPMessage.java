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

package poi.org.apache.xmlbeans.impl.soap;

// ericvas
//import javax.activation.DataHandler;
import java.io.IOException;
import java.io.OutputStream;

/**
 * <P>The root class for all SOAP messages. As transmitted on the
 * "wire", a SOAP message is an XML document or a MIME message
 * whose first body part is an XML/SOAP document.</P>
 *
 * <P>A {@code SOAPMessage} object consists of a SOAP part
 * and optionally one or more attachment parts. The SOAP part for
 * a {@code SOAPMessage} object is a {@code SOAPPart}
 * object, which contains information used for message routing and
 * identification, and which can contain application-specific
 * content. All data in the SOAP Part of a message must be in XML
 * format.</P>
 *
 * <P>A new {@code SOAPMessage} object contains the following
 * by default:</P>
 *
 * <UL>
 *  <LI>A {@code SOAPPart} object</LI>
 *
 *  <LI>A {@code SOAPEnvelope} object</LI>
 *
 *  <LI>A {@code SOAPBody} object</LI>
 *
 *  <LI>A {@code SOAPHeader} object</LI>
 * </UL>
 * The SOAP part of a message can be retrieved by calling the
 * method {@code SOAPMessage.getSOAPPart()}. The {@code
 * SOAPEnvelope} object is retrieved from the {@code
 * SOAPPart} object, and the {@code SOAPEnvelope}
 * object is used to retrieve the {@code SOAPBody} and {@code
 * SOAPHeader} objects.
 * <PRE>
 * SOAPPart sp = message.getSOAPPart();
 * SOAPEnvelope se = sp.getEnvelope();
 * SOAPBody sb = se.getBody();
 * SOAPHeader sh = se.getHeader();
 * </PRE>
 *
 * <P>In addition to the mandatory {@code SOAPPart} object, a
 * {@code SOAPMessage} object may contain zero or more {@code
 * AttachmentPart} objects, each of which contains
 * application-specific data. The {@code SOAPMessage}
 * interface provides methods for creating {@code
 * AttachmentPart} objects and also for adding them to a
 * {@code SOAPMessage} object. A party that has received a
 * {@code SOAPMessage} object can examine its contents by
 * retrieving individual attachment parts.</P>
 *
 * <P>Unlike the rest of a SOAP message, an attachment is not
 * required to be in XML format and can therefore be anything from
 * simple text to an image file. Consequently, any message content
 * that is not in XML format must be in an {@code
 * AttachmentPart} object.</P>
 *
 * <P>A {@code MessageFactory} object creates new {@code
 * SOAPMessage} objects. If the {@code MessageFactory}
 * object was initialized with a messaging Profile, it produces
 * {@code SOAPMessage} objects that conform to that Profile.
 * For example, a {@code SOAPMessage} object created by a
 * {@code MessageFactory} object initialized with the ebXML
 * Profile will have the appropriate ebXML headers.</P>
 * @see MessageFactory MessageFactory
 * @see AttachmentPart AttachmentPart
 */
public abstract class SOAPMessage {

    public SOAPMessage() {}

    /**
     * Updates this {@code SOAPMessage} object with all the
     *   changes that have been made to it. This method is called
     *   automatically when a message is sent or written to by the
     *   methods {@code ProviderConnection.send}, {@code
     *   SOAPConnection.call}, or {@code
     *   SOAPMessage.writeTo}. However, if changes are made to
     *   a message that was received or to one that has already been
     *   sent, the method {@code saveChanges} needs to be
     *   called explicitly in order to save the changes. The method
     *   {@code saveChanges} also generates any changes that
     *   can be read back (for example, a MessageId in profiles that
     *   support a message id). All MIME headers in a message that
     *   is created for sending purposes are guaranteed to have
     *   valid values only after {@code saveChanges} has been
     *   called.
     *
     *   <P>In addition, this method marks the point at which the
     *   data from all constituent {@code AttachmentPart}
     *   objects are pulled into the message.</P>
     * @throws  SOAPException if there
     *     was a problem saving changes to this message.
     */
    public abstract void saveChanges() throws SOAPException;

    /**
     * Indicates whether this {@code SOAPMessage} object
     * has had the method {@code saveChanges} called on
     * it.
     * @return {@code true} if {@code saveChanges} has
     *     been called on this message at least once; {@code
     *     false} otherwise.
     */
    public abstract boolean saveRequired();

    /**
     * Writes this {@code SOAPMessage} object to the given
     *   output stream. The externalization format is as defined by
     *   the SOAP 1.1 with Attachments specification.
     *
     *   <P>If there are no attachments, just an XML stream is
     *   written out. For those messages that have attachments,
     *   {@code writeTo} writes a MIME-encoded byte stream.</P>
     * @param   out the {@code OutputStream}
     *     object to which this {@code SOAPMessage} object will
     *     be written
     * @throws  SOAPException  if there was a problem in
     *     externalizing this SOAP message
     * @throws  IOException  if an I/O error
     *     occurs
     */
    public abstract void writeTo(OutputStream out)
        throws SOAPException, IOException;

    /**
     * Gets the SOAP Body contained in this {@code SOAPMessage} object.
     *
     * @return the {@code SOAPBody} object contained by this
     *              {@code SOAPMessage} object
     * @throws SOAPException if the SOAP Body does not exist or cannot be
     *              retrieved
     */
    public abstract SOAPBody getSOAPBody() throws SOAPException;

    /**
     * Gets the SOAP Header contained in this {@code SOAPMessage} object.
     *
     * @return the {@code SOAPHeader} object contained by this
     *              {@code SOAPMessage} object
     * @throws SOAPException  if the SOAP Header does not exist or cannot be
     *              retrieved
     */
    public abstract SOAPHeader getSOAPHeader() throws SOAPException;

    /**
     * Associates the specified value with the specified property. If there was
     * already a value associated with this property, the old value is replaced.
     * <p>
     * The valid property names include {@code WRITE_XML_DECLARATION} and
     * {@code CHARACTER_SET_ENCODING}. All of these standard SAAJ
     * properties are prefixed by "javax.xml.soap". Vendors may also add
     * implementation specific properties. These properties must be prefixed
     * with package names that are unique to the vendor.
     * <p>
     * Setting the property {@code WRITE_XML_DECLARATION} to
     * {@code "true"} will cause an XML Declaration to be written out at
     * the start of the SOAP message. The default value of "false" suppresses
     * this declaration.
     * <p>
     * The property {@code CHARACTER_SET_ENCODING} defaults to the value
     * {@code "utf-8"} which causes the SOAP message to be encoded using
     * UTF-8. Setting {@code CHARACTER_SET_ENCODING} to
     * {@code "utf-16"} causes the SOAP message to be encoded using UTF-16.
     * <p>
     * Some implementations may allow encodings in addition to UTF-8 and UTF-16.
     * Refer to your vendor's documentation for details.
     *
     * @param property the property with which the specified value is to be
     *              associated
     * @param value the value to be associated with the specified property
     * @throws SOAPException if the property name is not recognized
     */
    public abstract void setProperty(String property, Object value)
            throws SOAPException;

    /**
     * Retrieves value of the specified property.
     *
     * @param property the name of the property to retrieve
     * @return the value of the property or {@code null} if no such
     *              property exists
     * @throws SOAPException  if the property name is not recognized
     */
    public abstract Object getProperty(String property) throws SOAPException;

    /** Specifies the character type encoding for the SOAP Message. */
    public static final String CHARACTER_SET_ENCODING
            = "javax.xml.soap.character-set-encoding";

    /** Specifies whether the SOAP Message should contain an XML declaration. */
    public static final String WRITE_XML_DECLARATION
            = "javax.xml.soap.write-xml-declaration";
}
