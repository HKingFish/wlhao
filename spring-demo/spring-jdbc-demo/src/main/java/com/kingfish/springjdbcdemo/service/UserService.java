package com.kingfish.springjdbcdemo.service;

import com.kingfish.springjdbcdemo.pojo.User;

import java.util.List;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/6/14 13:07
 * @Des:
 */
public interface UserService {

    List<User> findAll();

    List<User> findAll2();

    void updateUser(User user);
}
