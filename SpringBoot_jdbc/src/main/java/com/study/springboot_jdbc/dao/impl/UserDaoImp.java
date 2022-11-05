package com.study.springboot_jdbc.dao.impl;

import com.study.springboot_jdbc.bean.User;
import com.study.springboot_jdbc.dao.UserDao;
import com.study.springboot_jdbc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.sql.Types;

@Repository("userDao")
public class UserDaoImp implements UserDao
{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(User user)
    {
        String sql = "insert user values(id,name,passwd)";
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource());
        return npjt.update(sql, new BeanPropertySqlParameterSource(user));
        //return 0;
    }

    @Override
    public int update(User user)
    {
        String sql = "update user set name = ?,passwd = ? where id = ?";
        Object[] args = {user.getName(), user.getPasswd(), user.getId()};
        int[] argTypes = {Types.VARCHAR, Types.VARCHAR, Types.INTEGER};
        return this.jdbcTemplate.update(sql, args, argTypes);
        //return 0;
    }

    @Override
    public int deleteByID(int id)
    {
        String sql = "delete from user where id = ?";
        Object[] args = {id};
        int[] argTypes = {Types.INTEGER};
        return this.jdbcTemplate.update(sql, args, argTypes);
        //return 0;
    }

    @Override
    public List<Map<String, Object>> queryUserListMap()
    {
        //String sql = "select * form study.user";
        String sql = "select * from study.user";
        return this.jdbcTemplate.queryForList(sql);
    }

    @Override
    public User queryUserByID(int id)
    {
        String sql = "select * from user where id = ?";
        Object[] args = {id};
        int[] argTypes = {Types.INTEGER};
        List<User> userList = this.jdbcTemplate.query(sql, args, argTypes, new UserMapper());
        if (userList != null && userList.size() > 0)
        {
            return userList.get(0);
        }
        else
        {
            return null;
        }
    }
}
