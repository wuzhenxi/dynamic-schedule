package com.example.dynamicschedule;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableKnife4j
@SpringBootApplication
@MapperScan(basePackages = "com.example.dynamicschedule.dao")
public class DynamicScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicScheduleApplication.class, args);
    }

}

