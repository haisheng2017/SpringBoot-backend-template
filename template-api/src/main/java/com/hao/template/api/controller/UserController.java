package com.hao.template.api.controller;

import com.hao.template.common.model.User;
import com.hao.template.common.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hao
 * 2019/9/22
 */
@Api(tags = "User API")
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("Get user by id")
    @GetMapping
    public User getUser(@ApiParam(value = "id", required = true) @RequestParam Integer id) {
        return userService.findOne(id);
    }
}
