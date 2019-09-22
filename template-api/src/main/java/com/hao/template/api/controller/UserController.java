package com.hao.template.api.controller;

import com.hao.template.common.model.User;
import com.hao.template.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hao
 * 2019/9/22
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public User getUser(@RequestParam Integer id){
        return userService.findOne(id);
    }
}
