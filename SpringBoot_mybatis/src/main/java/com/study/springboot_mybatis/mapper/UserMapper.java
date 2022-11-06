package com.study.springboot_mybatis.mapper;


import com.study.springboot_mybatis.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper
{
    @Insert("INSERT INTO USER VALUES(#{id},#{name},#{passwd})")
    int add(User user);

    @Update("UPDATE USER SET NAME = #{name},PASSWD = #{passwd} WHERE ID = #{id}")
    boolean update(User user);

    @Delete("DELETE FROM USER WHERE ID = #{id}")
    boolean delete(int id);

    @Select("SELECT * FROM USER WHERE ID = #{id}")
    @Results(id = "user",value = {
            @Result(property = "id", column = "id", javaType = int.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "passwd", column = "passwd", javaType = String.class)
    })
    User queryUserByID(int id);







}
