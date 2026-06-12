package com.example.springbootmybatisdemo.service.impl;

import com.example.springbootmybatisdemo.entity.ScoreRecord;
import com.example.springbootmybatisdemo.entity.StuInfo2;
import com.example.springbootmybatisdemo.mapper.StuInfoMapper;
import com.example.springbootmybatisdemo.service.ScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * This is created,
 * but not necessarily updated by me.
 * Therefore, AUTHOR is useless.
 * 2026/4/16 17:16
 *
 * @Version 1.0
 */
@Slf4j // 这个是日志（import lombok.extern.slf4j.Slf4j;），下面有使用的说明
@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private StuInfoMapper stuInfoMapper;


    @PostConstruct
    @Override
    public void queryExamples() {
        StuInfo2 condition = new StuInfo2();

        // 场景1：查询所有学生及其所有成绩
        List<StuInfo2> all = stuInfoMapper.selectStudentWithScores(new StuInfo2());

        // 场景2：查询 "张" 开头的学生
        condition.setStuName("张");
        /*
        // 这里只查 "数学" 成绩
        // 这里利用了 scoreList 属性来传递查询参数（虽然它通常用于存结果，但作为参数传入也是可以的）
        condition.setScoreList(Arrays.asList(new ScoreRecord(){{
            setSubject("数学");
        }}));
        */

        List<StuInfo2> result = stuInfoMapper.selectStudentWithScores(condition);

        // 遍历结果
        for (StuInfo2 student : result) {
            System.out.println("学生: " + student.getStuName());
            for (ScoreRecord score : student.getScoreList()) {
                System.out.println("  科目: " + score.getSubject() + ", 分数: " + score.getScore());
            }
        }
    }

    // @PostConstruct
    public void testLog() {
        log.info("这个是log.info日志打印");
        log.warn("这个是log.warn日志打印");
        log.error("这个是log.error日志打印");
        log.error("这个是log.error日志打印+异常", new RuntimeException("自定义异常"));
    }

}
