package com.study.springboot_jdbc.dao;

import com.study.springboot_jdbc.bean.User;

import java.util.List;
import java.util.Map;

public interface UserDao
{
    int add(User user);
    int update(User user );
    int deleteByID(int id);
    List<Map<String, Object>> queryUserListMap();
    User queryUserByID(int id);
}
