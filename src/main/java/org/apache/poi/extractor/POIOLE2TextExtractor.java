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
package org.apache.poi.extractor;

import org.apache.poi.POIDocument;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.poifs.filesystem.DirectoryEntry;

/**
 * Common Parent for OLE2 based Text Extractors
 *  of POI Documents, such as .doc, .xls
 * You will typically find the implementation of
 *  a given format's text extractor under
 *  org.apache.poi.[format].extractor .
 *
 * @see org.apache.poi.hssf.extractor.ExcelExtractor
 * @see org.apache.poi.hdgf.extractor.VisioTextExtractor
 * @see org.apache.poi.hwpf.extractor.WordExtractor
 */
public interface POIOLE2TextExtractor extends POITextExtractor {



    /**
     * Return the underlying DirectoryEntry of this document.
     *
     * @return the DirectoryEntry that is associated with the POIDocument of this extractor.
     */
    default DirectoryEntry getRoot() {
        return getDocument().getDirectory();
    }

    /**
     * Return the underlying POIDocument
     *
     * @return the underlying POIDocument
     */
    @Override
    POIDocument getDocument();
}