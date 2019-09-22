package com.hao.template.common.service.impl;

import com.hao.template.common.model.User;
import com.hao.template.common.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by hao
 * 2019/9/22
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findOne(int id) {
        return new User(id,"test");
    }
}
