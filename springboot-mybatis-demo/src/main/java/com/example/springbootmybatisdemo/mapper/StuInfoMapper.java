package com.example.springbootmybatisdemo.mapper;

import com.example.springbootmybatisdemo.entity.StuInfo;
import com.example.springbootmybatisdemo.entity.StuInfo2;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StuInfoMapper {

    /**
     * 【使用StuInfoMapper.xml操作】
     * 根据ID查询学生
     *
     * @param stuId
     * @return
     */
    StuInfo selectById2(Long stuId);

    /**
     * 根据ID查询学生
     */
    @Select("SELECT * FROM stu_info WHERE stu_id = #{stuId}")
    StuInfo selectById(Long stuId);

    /**
     * 查询所有学生
     */
    @Select("SELECT * FROM stu_info")
    List<StuInfo> selectAll();

    /**
     * 根据学号查询（利用了我们之前加的唯一索引）
     */
    @Select("SELECT * FROM stu_info WHERE stu_no = #{stuNo}")
    StuInfo selectByStuNo(String stuNo);

    /**
     * 新增学生
     * useGeneratedKeys = true 表示使用数据库自增主键
     * keyProperty = "stuId" 表示将生成的ID赋值给对象的 stuId 属性
     */
    @Insert("INSERT INTO stu_info (stu_name, stu_no, class_name) VALUES (#{stuName}, #{stuNo}, #{className})")
    @Options(useGeneratedKeys = true, keyProperty = "stuId")// 声明自增主键
    int insert(StuInfo stuInfo);

    /**
     * 更新学生信息
     */
    @Update("UPDATE stu_info SET stu_name=#{stuName}, class_name=#{className} WHERE stu_id=#{stuId}")
    int update(StuInfo stuInfo);

    /**
     * 根据ID删除学生
     */
    @Delete("DELETE FROM stu_info WHERE stu_id=#{stuId}")
    int deleteById(Long stuId);

    /**
     * 批量删除学生
     *
     * @param ids 学生ID集合
     * @return 影响的行数
     */
    int deleteBatch(@Param("ids") List<Long> ids);

    /**
     * 批量删除学生 (注解版)
     *
     * @param ids 学生ID集合
     * @return 影响的行数
     */
    @Delete("<script>" +
            "DELETE FROM stu_info " +
            "WHERE stu_id IN " +
            "<foreach collection='ids' item='id' open='(' separator=',' close=')'>" +
            "#{id}" +
            "</foreach>" +
            "</script>")
    int deleteBatch2(@Param("ids") List<Long> ids);

    /**
     * 动态多表查询：根据条件查询学生及其成绩
     * @param stuInfo 查询条件封装对象
     * @return 包含成绩的学生列表
     */
    List<StuInfo2> selectStudentWithScores(@Param("condition") StuInfo2 stuInfo);

}
