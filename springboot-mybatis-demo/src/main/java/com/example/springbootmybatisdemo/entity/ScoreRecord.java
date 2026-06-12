package com.example.springbootmybatisdemo.entity;


import lombok.Data;

@Data
public class ScoreRecord {
    private Long id;
    private String stuNo;      // 学号
    private String subject;    // 科目
    private Double score;      // 分数
    private String examDate;   // 考试日期 (格式化字符串)
}
