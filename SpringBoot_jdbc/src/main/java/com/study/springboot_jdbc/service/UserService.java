package com.study.springboot_jdbc.service;

import com.study.springboot_jdbc.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService
{
    int add(User user);
    int update(User user);
    int delete(int id);
    List<Map<String,Object>> queryUserListMap();
    User queryUserByID(int id);

}
