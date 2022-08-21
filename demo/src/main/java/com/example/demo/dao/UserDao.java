package com.example.demo.dao;

import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    public void insertUser(@Param("username")String username, @Param("password")String password);
    public User selectUser(@Param("username")String username,@Param("password")String password);
    public Student selectStudent(@Param("username")String username,@Param("password")String password);
}
