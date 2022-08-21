package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImp;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/dologin")
    public String doLogin(User user, Map<String,Object> map){
        User user1 = userServiceImp.selectUser(user.getUsername(),user.getPassword());
        System.out.println(user1);
        if(user1==null){
            map.put("msg","密码或账户错误！");
            return "fail";
        }else{
            map.put("mag","登入成功");
            return "success";
        }
    }

    @RequestMapping("/doregister")
    public String doRegister(User user,Map<String,Object> map){
        Student student = userServiceImp.selectStudent(user.getUsername(),user.getPassword());
        if (student == null){
            map.put("msg","你输入的账号在stu中没有对应的参数！请重新输入！");
            return "fail";
        }else {
        User user1 = userServiceImp.selectUser(user.getUsername(),user.getPassword());
        if (user1 ==null){
            userServiceImp.insertUser(user.getUsername(),user.getPassword());
            map.put("msg","注册成功");
            return "success";
            }else {
            map.put("msg","该用户以存在！");
            return "fail";
            }
        }
    }
}