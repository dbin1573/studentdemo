package com.zhanghongbin.studentdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan(basePackages = "com.zhanghongbin.studentdemo.mapper")
@SpringBootApplication
public class StudentdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentdemoApplication.class, args);
    }

}
