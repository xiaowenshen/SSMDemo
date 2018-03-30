package com.SSMDemo.service.impl;

import com.SSMDemo.dao.UserMapper;
import com.SSMDemo.pojo.User;
import com.SSMDemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiao on 2018/3/30.
 */
@Service("iUserService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public String Test() {
        User res = userMapper.selectByPrimaryKey(25);
        return res.toString();
    }
}
