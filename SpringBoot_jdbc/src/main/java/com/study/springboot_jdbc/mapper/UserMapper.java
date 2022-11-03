package com.study.springboot_jdbc.mapper;


import com.study.springboot_jdbc.bean.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User>
{


    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        User user = new User();
        user.setId(1);
        user.setName("user1");
        user.setPasswd("passwd");

        return user;
    }
}
