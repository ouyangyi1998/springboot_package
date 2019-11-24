package com.jerry.springboot_package.dao;

import com.jerry.springboot_package.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Insert("insert into user(name,age) values(#{name},#{age})")
    void addUser(User user);
    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(User user);
    @Delete("delete from user where id=#{id}")
    void deleteUser(int id);
    @Select("select * from user")
    List<User> findAll();
}
