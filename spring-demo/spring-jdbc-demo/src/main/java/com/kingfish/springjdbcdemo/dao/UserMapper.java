package com.kingfish.springjdbcdemo.dao;

import com.kingfish.springjdbcdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/6/13 13:09
 * @Des:
 */
@Mapper
public interface UserMapper {

    List<User> findAll();

    void updateUser(User user);

    void insertUser(User user);
}