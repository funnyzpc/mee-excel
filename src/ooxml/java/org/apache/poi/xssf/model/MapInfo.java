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

package org.apache.poi.xssf.model;

import static org.apache.poi.ooxml.POIXMLTypeLoader.DEFAULT_XML_OPTIONS;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.poi.ooxml.POIXMLDocumentPart;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.MapInfoDocument;

/**
 *
 * This class implements the Custom XML Mapping Part (Open Office XML Part 1:
 * chapter 12.3.6)
 *
 * An instance of this part type contains a schema for an XML file, and
 * information on the behavior that is used when allowing this custom XML schema
 * to be mapped into the spreadsheet.
 */

public class MapInfo extends POIXMLDocumentPart {

    private CTMapInfo mapInfo;

//    private Map<Integer, XSSFMap> maps ;

    public MapInfo() {
        super();
        mapInfo = CTMapInfo.Factory.newInstance();

    }

    /**
     * Returns the parent XSSFWorkbook
     *
     * @return the parent XSSFWorkbook
     */
    public XSSFWorkbook getWorkbook() {
        return (XSSFWorkbook)getParent();
    }


    protected void writeTo(OutputStream out) throws IOException {
        MapInfoDocument doc = MapInfoDocument.Factory.newInstance();
        doc.setMapInfo(mapInfo);
        doc.save(out, DEFAULT_XML_OPTIONS);
    }

    @Override
    protected void commit() throws IOException {
        PackagePart part = getPackagePart();
        try (OutputStream out = part.getOutputStream()) {
            writeTo(out);
        }
    }

}
