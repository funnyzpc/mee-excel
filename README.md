
## mee-excel
 
  本项目为操作excel之依赖，由 poi 5.3.0 改造而来，同时简化了poi自身依赖 如：
  + `org.apache.compressors `
  + `org.apache.io `
  + `org.apache.lang3 `
  + `com.zaxxer.sparsebits.sparsebits `
  + `org.apache.collection5 `
  + `org.apache.math3 `
  
### 使用 
+ maven
  ```  
  <dependency>
      <groupId>io.github.funnyzpc</groupId>
      <artifactId>mee-excel</artifactId>
      <version>1.0.0</version>
  </dependency>
  ```
  
+ gradle

  `  implementation group: 'io.github.funnyzpc', name: 'mee-excel', version: '1.0.0'`

### example 
+ 独立使用
 - [ExcelReadTest.java](src%2Ftest%2Fjava%2Forg%2Fapache%2Fpoi%2Frw%2FExcelReadTest.java)
 - [ExcelWriteTest.java](src%2Ftest%2Fjava%2Forg%2Fapache%2Fpoi%2Frw%2FExcelWriteTest.java)

+ 配合 easyexcel使用
 - [ExcelWriteTest.java](src%2Ftest%2Fjava%2Forg%2Fapache%2Fpoi%2Frw%2FExcelWriteTest.java)
 - [EasyExcelWriteTest.java](src%2Ftest%2Fjava%2Forg%2Fapache%2Fpoi%2Frw%2FEasyExcelWriteTest.java)
 - 需要剔除依赖的poi：
   ```
   <dependency>
   <groupId>com.alibaba</groupId>
   <artifactId>easyexcel</artifactId>
   <version>4.0.3</version>
   <exclusions>
     <exclusion>
       <groupId>org.apache.poi</groupId>
       <artifactId>poi</artifactId>
     </exclusion>
     <exclusion>
       <groupId>org.apache.poi</groupId>
       <artifactId>poi-ooxml</artifactId>
     </exclusion>
   </exclusions>
   </dependency>
    ```

### 与使用poi打包比较

  原始打包大小 21.784 MB
+ 打包含POI大小(version=3.17) 35.485MB
+ 打包含mee-excel大小 27.006MB
+ 