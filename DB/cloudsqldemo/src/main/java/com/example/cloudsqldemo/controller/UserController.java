package com.example.cloudsqldemo.controller;

import com.example.cloudsqldemo.dao.UserDao;
import com.example.cloudsqldemo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    UserDao userDao;

    @GetMapping("/createUser")
    public void createuser() {
        User user = new User();
        user.setUserName("test");
        userDao.create(user);
    }
}
