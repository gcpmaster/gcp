package com.example.cloudsqldemo.dao;

import com.example.cloudsqldemo.entities.User;

import java.util.List;

public interface UserDao {

    public void create(User user);

    public List<User> getAll();
}
