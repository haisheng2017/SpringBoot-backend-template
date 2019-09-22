package com.hao.template.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hao
 * 2019/9/22
 */
@RestController
public class HelloController {

    @GetMapping
    public String hello(){
        return "hello world";
    }
}
