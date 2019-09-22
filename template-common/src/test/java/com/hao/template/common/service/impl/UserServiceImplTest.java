package com.hao.template.common.service.impl;

import com.hao.template.common.model.User;
import com.hao.template.common.service.UserService;
import com.hao.template.common.utils.UnitTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by hao
 * 2019/9/22
 */
public class UserServiceImplTest extends UnitTest {

    @Autowired
    private UserService userService;
    @Test
    public void findOne() {
        int id=0;
        User user=userService.findOne(id);
        Assert.assertEquals(id,user.getId());
    }
}