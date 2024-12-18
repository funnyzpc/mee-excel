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
package org.apache.poi.openxml4j.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import poi.org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

/**
 * An Interface to make getting the different bits
 *  of a Zip File easy.
 * Allows you to get at the ZipEntries, without
 *  needing to worry about ZipFile vs ZipInputStream
 *  being annoyingly very different.
 */
public interface ZipEntrySource extends Closeable {
    /**
     * Returns an Enumeration of all the Entries
     */
    Enumeration<? extends ZipArchiveEntry> getEntries();

    /**
     * Return an entry by its path
     * @param path the path in unix-notation
     * @return the entry or {@code null} if not found
     *
     * @since POI 4.0.0
     */
    ZipArchiveEntry getEntry(String path);

    /**
     * Returns an InputStream of the decompressed 
     *  data that makes up the entry
     */
    InputStream getInputStream(ZipArchiveEntry entry) throws IOException;
    
    /**
     * Indicates we are done with reading, and 
     *  resources may be freed
     */
    @Override
    void close() throws IOException;
    
    /**
     * Has close been called already?
     */
    boolean isClosed();
}
