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
package org.apache.poi.util;

import java.awt.geom.Dimension2D;
import java.awt.geom.Rectangle2D;

public class Units {
    /**
     * In Escher absolute distances are specified in
     * English Metric Units (EMUs), occasionally referred to as A units;
     * there are 360000 EMUs per centimeter, 914400 EMUs per inch, 12700 EMUs per point.
     */
    public static final int EMU_PER_PIXEL = 9525;
    public static final int EMU_PER_POINT = 12700;
    public static final int EMU_PER_CENTIMETER = 360000;

    /** 72 points per inch (dpi) */
    public static final int EMU_PER_INCH = 12700*72;

    /** EMU_PER_POINT/20 */
    public static final int EMU_PER_DXA = 635;

    /**
     * Master DPI (576 pixels per inch).
     * Used by the reference coordinate system in PowerPoint (HSLF)
     */
    public static final int MASTER_DPI = 576;

    /**
     * Pixels DPI (96 pixels per inch)
     */
    public static final int PIXEL_DPI = 96;

    /**
     * Points DPI (72 pixels per inch)
     */
    public static final int POINT_DPI = 72;


    /**
     * Width of one "standard character" of the default font in pixels. Same for Calibri and Arial.
     * "Standard character" defined as the widest digit character in the given font.
     * Copied from XSSFWorkbook, since that isn't available here.
     * <p>
     * Note this is only valid for workbooks using the default Excel font.
     * <p>
     * Would be nice to eventually support arbitrary document default fonts.
     */
    public static final float DEFAULT_CHARACTER_WIDTH = 7.0017f;

    /**
     * Column widths are in fractional characters, this is the EMU equivalent.
     * One character is defined as the widest value for the integers 0-9 in the
     * default font.
     */
    public static final int EMU_PER_CHARACTER = (int) (EMU_PER_PIXEL * DEFAULT_CHARACTER_WIDTH);


}
