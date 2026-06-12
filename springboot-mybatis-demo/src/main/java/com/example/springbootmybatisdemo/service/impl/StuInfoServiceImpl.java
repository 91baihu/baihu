package com.example.springbootmybatisdemo.service.impl;

import com.example.springbootmybatisdemo.entity.StuInfo;
import com.example.springbootmybatisdemo.mapper.StuInfoMapper;
import com.example.springbootmybatisdemo.service.StuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class StuInfoServiceImpl implements StuInfoService {

    @Autowired
    private StuInfoMapper stuInfoMapper;

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public StuInfo getById(Long id) {
        return stuInfoMapper.selectById(id);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<StuInfo> getAll() {
        return stuInfoMapper.selectAll();
    }

    /**
     * 根据学号查询
     *
     * @param stuNo
     * @return
     */
    @Override
    public StuInfo getByStuNo(String stuNo) {
        return stuInfoMapper.selectByStuNo(stuNo);
    }

    /**
     * 保存
     *
     * @param stuInfo
     * @return
     */
    @Override
    public int save(StuInfo stuInfo) {
        // 这里可以加一点业务逻辑，比如判断学号是否已存在
        if (stuInfoMapper.selectByStuNo(stuInfo.getStuNo()) != null) {
            throw new RuntimeException("学号 " + stuInfo.getStuNo() + " 已存在！");
        }
        return stuInfoMapper.insert(stuInfo);
    }

    /**
     * 更新
     *
     * @param stuInfo
     * @return
     */
    @Override
    public int update(StuInfo stuInfo) {
        return stuInfoMapper.update(stuInfo);
    }

    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    @Override
    public int delete(Long id) {
        return stuInfoMapper.deleteById(id);
    }


    /**
     * 批量删除
     */
    // @PostConstruct
    public void removeStudents() {
        // 假设要删除 ID 为 1, 2, 3 的学生
        List<Long> idsToDelete = Arrays.asList(1L, 2L, 3L);

        int rows = stuInfoMapper.deleteBatch(idsToDelete);
        System.out.println("成功删除了 " + rows + " 条记录");
    }
}
