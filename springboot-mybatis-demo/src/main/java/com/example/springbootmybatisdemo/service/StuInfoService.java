package com.example.springbootmybatisdemo.service;

import com.example.springbootmybatisdemo.entity.StuInfo;

import java.util.List;

public interface StuInfoService {

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    StuInfo getById(Long id);

    /**
     * 查询所有
     *
     * @return
     */
    List<StuInfo> getAll();

    /**
     * 根据学号查询
     *
     * @param stuNo
     * @return
     */
    StuInfo getByStuNo(String stuNo);

    /**
     * 保存
     *
     * @param stuInfo
     * @return
     */
    int save(StuInfo stuInfo);

    /**
     * 更新
     *
     * @param stuInfo
     * @return
     */
    int update(StuInfo stuInfo);

    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    int delete(Long id);
}
