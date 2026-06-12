# springboot-mybatis-demo



## 这是一个SpringBoot MyBatis项目Demo。



## 启动说明


        启动类：～/src/main/java/com/example/springbootmybatisdemo/MybatisDemoApplication.java


## 使用步骤

### 1、创建（或导入）数据库表
    
        建表语句：～/table-sql
    
### 2、配置数据源（4要素）

        配置文件：～/src/main/resources/application.yml
    
### 3、编写关键代码：entity、mapper、mapper.xml

        entity：～/src/main/java/com/example/springbootmybatisdemo/entity/...
        mapper：～/src/main/java/com/example/springbootmybatisdemo/mapper/...
        mapper.xml：～/src/main/resources/mapper/...

### 4、单表 -> 单表映射 -> （基础）-> 动态SQL -> 动态多表映射SQL -> （高阶）

####（1）单表 & 映射
    
        Service：～/src/main/java/com/example/springbootmybatisdemo/service/StuInfoService.java
        Controller：～/src/main/java/com/example/springbootmybatisdemo/controller/StuInfoController.java

####（2）动态SQL
    
        代码：～/src/main/java/com/example/springbootmybatisdemo/service/impl/StuInfoServiceImpl.java
        方法：StuInfoServiceImpl.removeStudents()

####（3）动态多表映射SQL
    
        代码：～/src/main/java/com/example/springbootmybatisdemo/service/impl/StuInfoServiceImpl.java
        方法：StuInfoServiceImpl.removeStudents()

## Postman工具


    下载地址：https://www.postman.com/downloads/
