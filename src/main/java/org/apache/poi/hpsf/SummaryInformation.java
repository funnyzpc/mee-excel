/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hpsf;

import static org.apache.poi.hpsf.ClassIDPredefined.SUMMARY_PROPERTIES;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.poi.hpsf.wellknown.PropertyIDMap;

/**
 * Convenience class representing a Summary Information stream in a
 * Microsoft Office document.
 *
 * @see DocumentSummaryInformation
 */
public final class SummaryInformation extends PropertySet {

    /**
     * The document name a summary information stream usually has in a POIFS filesystem.
     */
    public static final String DEFAULT_STREAM_NAME = "\005SummaryInformation";

    /**
     * The SummaryInformation's section's format ID.
     */
    public static final ClassID FORMAT_ID = SUMMARY_PROPERTIES.getClassID();

    @Override
    public PropertyIDMap getPropertySetIDMap() {
        return PropertyIDMap.getSummaryInformationProperties();
    }

    /**
     * Creates an empty SummaryInformation.
     */
    public SummaryInformation() {
        getFirstSection().setFormatID(FORMAT_ID);
    }


    /**
     * Creates a SummaryInformation instance from an {@link
     * InputStream} in the Horrible Property Set Format.<p>
     *
     * The constructor reads the first few bytes from the stream
     * and determines whether it is really a property set stream. If
     * it is, it parses the rest of the stream. If it is not, it
     * resets the stream to its beginning in order to let other
     * components mess around with the data and throws an
     * exception.
     *
     * @param stream Holds the data making out the property set
     * stream.
     * @throws IOException
     *    if the {@link InputStream} cannot be accessed as needed.
     * @throws NoPropertySetStreamException
     *    if the input stream does not contain a property set.
     * @throws UnsupportedEncodingException
     *    if a character encoding is not supported.
     */
    public SummaryInformation(final InputStream stream)
    throws NoPropertySetStreamException, IOException {
        super(stream);
    }


    /**
     * @return The title or {@code null}
     */
    public String getTitle() {
        return getPropertyStringValue(PropertyIDMap.PID_TITLE);
    }



    /**
     * Sets the title.
     *
     * @param title The title to set.
     */
    public void setTitle(final String title) {
        set1stProperty(PropertyIDMap.PID_TITLE, title);
    }



    /**
     * Removes the title.
     */
    public void removeTitle() {
        remove1stProperty(PropertyIDMap.PID_TITLE);
    }



    /**
     * Returns the subject (or {@code null}).
     *
     * @return The subject or {@code null}
     */
    public String getSubject() {
        return getPropertyStringValue(PropertyIDMap.PID_SUBJECT);
    }



    /**
     * Sets the subject.
     *
     * @param subject The subject to set.
     */
    public void setSubject(final String subject) {
        set1stProperty(PropertyIDMap.PID_SUBJECT, subject);
    }



    /**
     * Removes the subject.
     */
    public void removeSubject() {
        remove1stProperty(PropertyIDMap.PID_SUBJECT);
    }



    /**
     * Returns the author (or {@code null}).
     *
     * @return The author or {@code null}
     */
    public String getAuthor() {
        return getPropertyStringValue(PropertyIDMap.PID_AUTHOR);
    }



    /**
     * Sets the author.
     *
     * @param author The author to set.
     */
    public void setAuthor(final String author) {
        set1stProperty(PropertyIDMap.PID_AUTHOR, author);
    }


    /**
     * Returns the comments (or {@code null}).
     *
     * @return The comments or {@code null}
     */
    public String getComments() {
        return getPropertyStringValue(PropertyIDMap.PID_COMMENTS);
    }



    /**
     * Sets the comments.
     *
     * @param comments The comments to set.
     */
    public void setComments(final String comments) {
        set1stProperty(PropertyIDMap.PID_COMMENTS, comments);
    }



    /**
     * Removes the comments.
     */
    public void removeComments() {
        remove1stProperty(PropertyIDMap.PID_COMMENTS);
    }



    /**
     * Returns the template (or {@code null}).
     *
     * @return The template or {@code null}
     */
    public String getTemplate() {
        return getPropertyStringValue(PropertyIDMap.PID_TEMPLATE);
    }



    /**
     * Sets the template.
     *
     * @param template The template to set.
     */
    public void setTemplate(final String template) {
        set1stProperty(PropertyIDMap.PID_TEMPLATE, template);
    }

    /**
     * Returns a security code which is one of the following values:
     *
     * <ul>
     *
     * <li>0 if the SummaryInformation does not contain a
     * security field or if there is no security on the document. Use
     * {@link PropertySet#wasNull()} to distinguish between the two
     * cases!
     *
     * <li>1 if the document is password protected
     *
     * <li>2 if the document is read-only recommended
     *
     * <li>4 if the document is read-only enforced
     *
     * <li>8 if the document is locked for annotations
     *
     * </ul>
     *
     * @return The security code or {@code null}
     */
    public int getSecurity() {
        return getPropertyIntValue(PropertyIDMap.PID_SECURITY);
    }



    /**
     * Sets the security code.
     *
     * @param security The security code to set.
     */
    public void setSecurity(final int security) {
        set1stProperty(PropertyIDMap.PID_SECURITY, security);
    }



    /**
     * Removes the security code.
     */
    public void removeSecurity() {
        remove1stProperty(PropertyIDMap.PID_SECURITY);
    }

}
