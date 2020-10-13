package com.example.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.spring.demo.mapper")
@EnableCaching
@ComponentScan (basePackages = {"com.example.spring.demo.service","com.example.spring.demo.mapper", "com.example.spring.demo.controller"})

public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
