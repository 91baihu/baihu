package com.example.springbootmybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 扫描 Mapper 接口所在的包
@MapperScan("com.example.springbootmybatisdemo.mapper")
public class MybatisDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisDemoApplication.class, args);
    }
}
