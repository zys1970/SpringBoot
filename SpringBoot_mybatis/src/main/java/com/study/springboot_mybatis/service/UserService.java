package com.study.springboot_mybatis.service;

import com.study.springboot_mybatis.bean.User;

public interface UserService
{
    int add(User user);
    boolean update(User user);
    boolean delete(int id);
    User queryUserByID(int id);
}
