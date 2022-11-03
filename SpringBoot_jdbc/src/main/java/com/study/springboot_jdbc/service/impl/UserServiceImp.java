package com.study.springboot_jdbc.service.impl;

import com.study.springboot_jdbc.bean.User;
import com.study.springboot_jdbc.dao.UserDao;
import com.study.springboot_jdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("userService")
public class UserServiceImp implements UserService
{

    @Autowired
    private UserDao userDao;

    @Override
    public int add(User user)
    {
        return this.userDao.add(user);
    }

    @Override
    public int update(User user)
    {
        return this.userDao.update(user);
    }

    @Override
    public int delete(int id)
    {
        return this.userDao.deleteByID(id);
    }

    @Override
    public List<Map<String, Object>> queryUserListMap()
    {
        return this.userDao.queryUserListMap();
    }

    @Override
    public User queryUserByID(int id)
    {
        return userDao.queryUserByID(id);
    }
}
