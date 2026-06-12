package com.example.springbootmybatisdemo.controller;

import com.example.springbootmybatisdemo.entity.StuInfo;
import com.example.springbootmybatisdemo.service.StuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * http://127.0.0.1:80/students
 */
@RestController
@RequestMapping("/students")
public class StuInfoController {

    @Autowired
    private StuInfoService stuInfoService;

    @GetMapping
    public List<StuInfo> getAll() {
        return stuInfoService.getAll();
    }

    /**
     * 根据表ID查询学生信息
     * 【访问示例：http://127.0.0.1/students/1】
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public StuInfo getById(@PathVariable Long id) {
        return stuInfoService.getById(id);
    }

    /**
     * 根据学号查询学生信息
     * 【访问示例：http://127.0.0.1/students/stuNo/202600001】
     *
     * @param stuNo
     * @return
     */
    @GetMapping("/stuNo/{stuNo}")
    public StuInfo getByStuNo(@PathVariable String stuNo) {
        return stuInfoService.getByStuNo(stuNo);
    }

    /**
     * 【这里是POST请求】
     *
     * @param stuInfo
     * @return
     */
    @PostMapping
    public String save(@RequestBody StuInfo stuInfo) {
        try {
            stuInfoService.save(stuInfo);
            return "保存成功";
        } catch (Exception e) {
            return "保存失败: " + e.getMessage();
        }
    }

    /**
     * 【这里是PUT请求】
     * @param stuInfo
     * @return
     */
    @PutMapping
    public String update(@RequestBody StuInfo stuInfo) {
        stuInfoService.update(stuInfo);
        return "更新成功";
    }

    /**
     * 【这里是DELETE请求】
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        stuInfoService.delete(id);
        return "删除成功";
    }
}
