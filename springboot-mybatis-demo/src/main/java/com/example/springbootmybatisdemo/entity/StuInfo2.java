package com.example.springbootmybatisdemo.entity;

import lombok.Data;

import java.util.List;

@Data
public class StuInfo2 {
    private Long stuId;
    private String stuName;
    private String stuNo;
    private String className;

    // --- 用于存储该学生的所有成绩 ---
    // 这个属性名必须和 XML resultMap 中的 property 一致
    private List<ScoreRecord> scoreList;

}
