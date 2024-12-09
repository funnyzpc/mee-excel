package org.apache.poi.excel;//package com.mee.common.util.excel;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;


/**
 * @author: funnyzpc
 * @Description 单元格样式构造类
 **/
@Deprecated
public class PoiCellStyleProcess {

    /**
     * 表头样式
     * @param wb
     * @return
     */
    public static CellStyle headerCellStyle(SXSSFWorkbook wb){
        CellStyle headerStyle = wb.createCellStyle();
        DataFormat dataFormat = wb.createDataFormat();
        headerStyle.setDataFormat(dataFormat.getFormat("@"));
        //水平居中
        headerStyle.setAlignment(HorizontalAlignment.CENTER);
        //垂直居中
        headerStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        //边线
        headerStyle.setBorderTop(BorderStyle.MEDIUM);
        headerStyle.setBorderBottom(BorderStyle.THIN);
        headerStyle.setBorderLeft(BorderStyle.HAIR);
        headerStyle.setBorderRight(BorderStyle.HAIR);
        //边线颜色
        headerStyle.setTopBorderColor(IndexedColors.DARK_RED.index);
        headerStyle.setBottomBorderColor(IndexedColors.GREY_80_PERCENT.index);
        headerStyle.setLeftBorderColor(IndexedColors.GREY_50_PERCENT.index);
        headerStyle.setRightBorderColor(IndexedColors.GREY_50_PERCENT.index);
        //字体
        Font font = wb.createFont();
        font.setColor(IndexedColors.WHITE1.index);
        //font.setFontName("SimHei");
        font.setBold(true);
        font.setFontHeight((short)12);
        font.setFontHeightInPoints((short)12);
        headerStyle.setFont(font);
        //背景色
        //headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
        headerStyle.setFillForegroundColor(IndexedColors.DARK_BLUE.index);
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        //允许单元格内换行
        headerStyle.setWrapText(true);
        return  headerStyle;
    }

    public static CellStyle[] bodyCellStyle(SXSSFWorkbook workbook, CellFmt[] cellFmts,int cellLen){
        //LOGGER.info("\r\n==>开始创建表头样式~");
        CellStyle defaultStyle = bodyCellStyle(workbook,null);
        final CellStyle[] cellStyles = new CellStyle[cellLen];
//        if(null == cellFmts || cellFmts.length==0){
//            IntStream.range(0,cellStyles.length).parallel().forEach(i->cellStyles[i]=defaultStyle);
//            //Arrays.stream(cellStyles).parallel().forEach(styleItem->cellStyles=defaultStyle);
//            return cellStyles;
//        }
        // 预设样式
        if(null == cellFmts || cellFmts.length==0){
            for(int i =0;i<cellLen;i++){
                cellStyles[i]=defaultStyle;
            }
            return cellStyles;
        }
        // 自定义样式
        for(int i =0;i<cellLen;i++){
            if(null == cellFmts[i]){
                cellStyles[i]=defaultStyle;
            }else{
                cellStyles[i] = bodyCellStyle(workbook, cellFmts[i]);
            }
        }
        return cellStyles;
    }

    public static CellStyle bodyCellStyle(SXSSFWorkbook workbook, CellFmt cellFmt){
        CellStyle bodyStyle = workbook.createCellStyle();
        DataFormat dataFormat = workbook.createDataFormat();
        if(null == cellFmt || (null==cellFmt.getCellFmt() || "".equals(cellFmt.getCellFmt())) ) {
            bodyStyle.setDataFormat(dataFormat.getFormat("@"));
        }else{
//            bodyStyle.setDataFormat(dataFormat.getFormat(cellFmt.getDataFmt()));
            bodyStyle.setDataFormat(dataFormat.getFormat(cellFmt.getCellFmt()));
        }
        //水平居中
        bodyStyle.setAlignment(HorizontalAlignment.CENTER);
        //垂直居中
        bodyStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        //边线
        bodyStyle.setBorderTop(BorderStyle.THIN);
        bodyStyle.setBorderBottom(BorderStyle.THIN);
        bodyStyle.setBorderLeft(BorderStyle.HAIR);
        bodyStyle.setBorderRight(BorderStyle.HAIR);
        //边线颜色
        bodyStyle.setTopBorderColor(IndexedColors.GREY_80_PERCENT.index);
        bodyStyle.setBottomBorderColor(IndexedColors.GREY_80_PERCENT.index);
        bodyStyle.setLeftBorderColor(IndexedColors.GREY_50_PERCENT.index);
        bodyStyle.setRightBorderColor(IndexedColors.GREY_50_PERCENT.index);
        //字体
        Font font = workbook.createFont();
        font.setColor(IndexedColors.BLACK.index);
        //font.setFontName("SimHei");
        //font.setBold(true);
        font.setFontHeight((short)12);
        font.setFontHeightInPoints((short)12);
        bodyStyle.setFont(font);
        //背景色
        bodyStyle.setFillForegroundColor(IndexedColors.WHITE.index);
        bodyStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        return bodyStyle;
    }

}