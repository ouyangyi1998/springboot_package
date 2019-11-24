package com.jerry.springboot_package.service;

import com.jerry.springboot_package.pojo.User;

import java.util.List;

public interface UserService {
    boolean addUser(User user);
    
    boolean updateUser(User user);
    
    boolean deleteUser(int id);
    
    List<User> findAll();
}
