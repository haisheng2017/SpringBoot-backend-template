package com.hao.template.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by hao
 * 2019/9/22
 */
@SpringBootApplication
@ComponentScan(value = "com.hao.template.*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
