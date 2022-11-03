package com.study.springboot_jdbc.controller;

import com.study.springboot_jdbc.bean.User;
import com.study.springboot_jdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryuser", method = RequestMethod.GET)
    public User queryUserByID(int id)
    {
        return this.userService.queryUserByID(id);
    }

    @RequestMapping(value = "/queryalluser")
    public List<Map<String,Object>> queryAllUser(){
        return this.userService.queryUserListMap();
    }

    @RequestMapping(value = "/adduser",method = RequestMethod.POST)
    public int saveUser(int id,String name, String passwd){
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPasswd(passwd);
        return this.userService.add(user);
    }

    @RequestMapping(value = "/deleteuser",method = RequestMethod.GET)
    public int deleteUserByID(int id){
        return this.userService.delete(id);
    }
}
