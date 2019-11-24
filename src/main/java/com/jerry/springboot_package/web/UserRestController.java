package com.jerry.springboot_package.web;

import com.jerry.springboot_package.pojo.User;
import com.jerry.springboot_package.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Slf4j
public class UserRestController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello")
    private String hello()
    {
        return "hello tomcat";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user) {
        log.info("开始新增...");
        return userService.addUser(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public boolean updateUser(@RequestBody User user) {
        log.info("开始更新...");
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "userId", required = true) int userId) {
        log.info("开始删除...");
        return userService.deleteUser(userId);
    }


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> findByUserAge() {
        log.info("开始查询所有数据...");
        return userService.findAll();
    }
}
