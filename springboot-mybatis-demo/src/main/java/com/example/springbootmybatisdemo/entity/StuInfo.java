package com.example.springbootmybatisdemo.entity;


/**
 * 【学生信息表实体类】
 * entity 也可以叫 Model、Domain、Pojo
 * Model：最通用的叫法之一。源于 MVC（Model-View-Controller）架构，代表数据模型。
 * Domain：源于 DDD（领域驱动设计）。强调该对象不仅包含数据，还包含业务逻辑，是业务领域的核心。
 * Pojo：Plain Old Java Object（简单的 Java 对象）。强调它是一个普通的 Java 类，不依赖于特定框架的接口或继承。
 */
public class StuInfo {
    private Long stuId;
    private String stuName;
    private String stuNo;
    private String className;

    // 无参构造
    public StuInfo() {
    }

    // 全参构造（方便测试）
    public StuInfo(Long stuId, String stuName, String stuNo, String className) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuNo = stuNo;
        this.className = className;
    }

    // Getter 和 Setter 方法
    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "StuInfo{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

}
