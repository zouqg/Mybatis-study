package com.zou.dao;

import com.zou.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> getUserList();// @Param 在实现方法时，找到对应参数
    void insertUser(@Param("id") int id,@Param("name") String name,@Param("pwd") String pwd);
}
