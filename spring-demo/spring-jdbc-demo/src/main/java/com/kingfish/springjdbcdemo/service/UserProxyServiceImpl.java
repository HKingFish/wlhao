package com.kingfish.springjdbcdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/12 14:10
 * @Des:
 */
@Service
public class UserProxyServiceImpl {
    @Autowired
    private UserService userService;

    @Transactional
    public void findAll(){
        userService.findAll();
    }
}