/*
 *  ====================================================================
 *    Licensed to the Apache Software Foundation (ASF) under one or more
 *    contributor license agreements.  See the NOTICE file distributed with
 *    this work for additional information regarding copyright ownership.
 *    The ASF licenses this file to You under the Apache License, Version 2.0
 *    (the "License"); you may not use this file except in compliance with
 *    the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 * ====================================================================
 */

package org.apache.poi.ss.usermodel;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.formula.FormulaShifter;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.Beta;

@Beta
public abstract class RangeCopier {
    private Sheet sourceSheet;
    private Sheet destSheet;
    private FormulaShifter horizontalFormulaShifter;
    private FormulaShifter verticalFormulaShifter;

    public RangeCopier(Sheet sourceSheet, Sheet destSheet) {
        this.sourceSheet = sourceSheet;
        this.destSheet = destSheet;
    }

    public RangeCopier(Sheet sheet) {
        this(sheet, sheet);
    }

    protected abstract void adjustCellReferencesInsideFormula(Cell cell, Sheet destSheet, int deltaX, int deltaY); // this part is different for HSSF and XSSF

    protected boolean adjustInBothDirections(Ptg[] ptgs, int sheetIndex, int deltaX, int deltaY) {
        boolean adjustSucceeded = true;
        if(deltaY != 0)
            adjustSucceeded = verticalFormulaShifter.adjustFormula(ptgs, sheetIndex);
        if(deltaX != 0)
            adjustSucceeded = adjustSucceeded && horizontalFormulaShifter.adjustFormula(ptgs, sheetIndex);
        return adjustSucceeded;
    }

    // TODO clone some more properties ?
    public static void cloneCellContent(Cell srcCell, Cell destCell, Map<Integer, CellStyle> styleMap) {
         if(styleMap != null) {
             if(srcCell.getSheet().getWorkbook() == destCell.getSheet().getWorkbook()){
                 destCell.setCellStyle(srcCell.getCellStyle());
             } else {
                 int stHashCode = srcCell.getCellStyle().hashCode();
                 CellStyle newCellStyle = styleMap.get(stHashCode);
                 if(newCellStyle == null){
                     newCellStyle = destCell.getSheet().getWorkbook().createCellStyle();
                     newCellStyle.cloneStyleFrom(srcCell.getCellStyle());
                     styleMap.put(stHashCode, newCellStyle);
                 }
                 destCell.setCellStyle(newCellStyle);
             }
         }
         switch(srcCell.getCellType()) {
             case STRING:
                 destCell.setCellValue(srcCell.getStringCellValue());
                 break;
             case NUMERIC:
                 destCell.setCellValue(srcCell.getNumericCellValue());
                 break;
             case BLANK:
                 destCell.setBlank();
                 break;
             case BOOLEAN:
                 destCell.setCellValue(srcCell.getBooleanCellValue());
                 break;
             case ERROR:
                 destCell.setCellErrorValue(srcCell.getErrorCellValue());
                 break;
             case FORMULA:
                 String oldFormula = srcCell.getCellFormula();
                 destCell.setCellFormula(oldFormula);
                 break;
             default:
                 break;
         }
     }
}
