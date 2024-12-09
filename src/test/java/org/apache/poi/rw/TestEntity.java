//package org.apache.poi.rw;
//
//
//import com.alibaba.excel.annotation.write.style.ContentRowHeight;
//
//import java.io.Serializable;
//import java.util.Date;
//
///**
// * testEntity
// *
// * @author shaoow
// * @version 1.0
// * @className TestEntity
// * @date 2024/12/6 14:14
// */
//@ContentRowHeight(60)
//public class TestEntity implements Serializable {
//
//
//    /**
//     * 序列化标识
//     */
//    private static final long serialVersionUID = 1L;
//
//    private Long serialNo;
////    @ContentLoopMerge(eachRow=3)
//    private String name;
//    private Double price;
//    private String tag;
////    @DateTimeFormat(value = "yyyy-MM-dd HH:mm:ss")
//    private Date publishDate;
//    private boolean statue;
//    private Long pubNo;
////    @DateTimeFormat(value = "yyyy-MM-dd HH:mm:ss")
//    private Date createTime;
//
//    public Long getSerialNo() {
//        return serialNo;
//    }
//
//    public void setSerialNo(Long serialNo) {
//        this.serialNo = serialNo;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    public String getTag() {
//        return tag;
//    }
//
//    public void setTag(String tag) {
//        this.tag = tag;
//    }
//
//    public Date getPublishDate() {
//        return publishDate;
//    }
//
//    public void setPublishDate(Date publishDate) {
//        this.publishDate = publishDate;
//    }
//
//    public boolean isStatue() {
//        return statue;
//    }
//
//    public void setStatue(boolean statue) {
//        this.statue = statue;
//    }
//
//    public Long getPubNo() {
//        return pubNo;
//    }
//
//    public void setPubNo(Long pubNo) {
//        this.pubNo = pubNo;
//    }
//
//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }
//
//    @Override
//    public String toString() {
//        return "TestEntity{" +
//                "serialNo=" + serialNo +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                ", tag='" + tag + '\'' +
//                ", publishDate=" + publishDate +
//                ", statue=" + statue +
//                ", pubNo=" + pubNo +
//                ", createTime=" + createTime +
//                '}';
//    }
//}
