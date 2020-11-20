package com.kingfish.springbootdemo.constructor;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/5/21 19:50
 * @Des:
 */
public class ConstructorDemoBase {
    private ConstructorDemoB constructorDemoB;
    private Integer name;
    private String password;

    @Autowired
    public ConstructorDemoBase(ConstructorDemoB constructorDemoB, Integer name, String password) {
        this.constructorDemoB = constructorDemoB;
        this.name = name;
        this.password = password;
    }

//    @Autowired
    private ConstructorDemoBase(ConstructorDemoB constructorDemoB) {
        this.constructorDemoB = constructorDemoB;
    }

    public ConstructorDemoBase() {
    }
}