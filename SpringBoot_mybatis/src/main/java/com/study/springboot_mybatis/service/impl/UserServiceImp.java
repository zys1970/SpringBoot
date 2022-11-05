package com.study.springboot_mybatis.service.impl;

import com.study.springboot_mybatis.bean.User;
import com.study.springboot_mybatis.mapper.UserMapper;
import com.study.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImp implements UserService
{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user)
    {
        return userMapper.add(user);
    }

    @Override
    public boolean update(User user)
    {
        return userMapper.update(user);
    }

    @Override
    public boolean delete(int id)
    {
        return userMapper.delete(id);
    }

    @Override
    public User queryUserByID(int id)
    {
        return userMapper.queryUserByID(id);
    }
}
