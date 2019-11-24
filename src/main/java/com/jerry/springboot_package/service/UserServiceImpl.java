package com.jerry.springboot_package.service;

import com.jerry.springboot_package.dao.UserDao;
import com.jerry.springboot_package.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean addUser(User user) {
        boolean flag=false;
        try{
            userDao.addUser(user);
            flag=true;
        }catch (Exception e)
        {
            log.error("新增失败",e);
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag=false;
        try{
            userDao.updateUser(user);
            flag=true;
        }catch (Exception e)
        {
            log.error("更新失败",e);
        }
        return flag;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean flag=false;
        try{
            userDao.deleteUser(id);
            flag=true;
        }catch (Exception e)
        {
            log.error("删除失败",e);
        }
        return flag;
    }

    @Override
    public List<User> findAll() {
       return userDao.findAll();
    }
}
