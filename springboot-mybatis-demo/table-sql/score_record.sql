CREATE TABLE score_record
(
    id        BIGINT PRIMARY KEY AUTO_INCREMENT,
    stu_no    VARCHAR(20)   NOT NULL COMMENT '关联学生表的学号',
    subject   VARCHAR(50)   NOT NULL COMMENT '科目名称，如 数学、英语',
    score     DECIMAL(5, 2) NOT NULL COMMENT '分数',  -- 5位长度（整数3位），小数点后2位
    exam_date DATE COMMENT '考试日期',

    INDEX idx_stu_no (stu_no),
    INDEX idx_subject (subject)
) ENGINE = InnoDB COMMENT = '成绩表';
