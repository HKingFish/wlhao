package com.kingfish.springjdbcdemo.pojo;

import lombok.Data;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/6/11 22:18
 * @Des:
 */
@Data
public class User {
    private int id;
    private String userId;
    private String username;
    private String password;
}