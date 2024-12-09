package org.apache.poi.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

public class SeqGenUtil {

    private static final ZoneId zoneId = ZoneId.of("Asia/Shanghai");
    private static final AtomicInteger SHOT_STATIC_IT = new AtomicInteger(1000);
    private static final DateTimeFormatter DATE_SHORT_FORMAT = DateTimeFormatter.ofPattern("yyMMddHHmmss");

    /** 16位： 12(日期时间yyMMddHHmmss)+4(有序序列) **/
    public static String genSeq(){
        LocalDateTime dataTime = LocalDateTime.now(zoneId);
        if(SHOT_STATIC_IT.intValue()>9990){
            System.out.println("重置genSeq序列 1000");
            SHOT_STATIC_IT.getAndSet(1000);
        }
        return dataTime.format(DATE_SHORT_FORMAT)+ SHOT_STATIC_IT.getAndIncrement();
    }

    public static Long genLongSeq(){
        return Long.parseLong(genSeq());
    }


    /** 18位：14(日期时间YYMMDDHHMIssSS)+4(有序序列) **/
    private static final AtomicInteger STATIC_IT = new AtomicInteger(100000);
    public static synchronized String genBigSeq(){
        LocalDateTime dataTime = LocalDateTime.now(zoneId);
        if(STATIC_IT.intValue()>990000){
            System.out.println("重置genSeq序列 1000");
            STATIC_IT.getAndSet(100000);
        }
        return dataTime.format(DATE_SHORT_FORMAT)+ STATIC_IT.getAndIncrement();
    }

}
