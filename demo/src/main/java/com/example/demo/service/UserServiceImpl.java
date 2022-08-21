package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    public UserDao userDao;

    public boolean insertUser(String username,String password){
        userDao.insertUser(username,password);
        return true;
    }

    public User selectUser(String username,String password){
        System.out.println(username+" " +password);
        return userDao.selectUser(username,password);
    }
    public Student selectStudent(String username,String password){
        return userDao.selectStudent(username,password);
    }
}