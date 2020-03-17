package com.example.factorydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.factorydemo.mapper")
public class FactorydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactorydemoApplication.class, args);
    }

}
