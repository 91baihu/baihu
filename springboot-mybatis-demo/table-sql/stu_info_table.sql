--     可导入的建表语句

CREATE TABLE `stu_info`
(
    `stu_id`     bigint      NOT NULL AUTO_INCREMENT COMMENT 'ID', -- AUTO_INCREMENT：自增
    `stu_name`   varchar(50) NOT NULL COMMENT '姓名',
    `stu_no`     varchar(50) NOT NULL COMMENT '学号',
    `class_name` varchar(50) NOT NULL COMMENT '班级',
    PRIMARY KEY (`stu_id`),                                        -- 主键（不建议用自增ID作为主键）
    UNIQUE KEY `uk_stu_no` (`stu_no`)                              -- 唯一索引
) ENGINE = InnoDB COMMENT = '学生信息表';
