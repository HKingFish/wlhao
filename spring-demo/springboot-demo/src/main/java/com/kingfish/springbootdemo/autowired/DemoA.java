package com.kingfish.springbootdemo.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/5/28 21:20
 * @Des:
 */
@Component
public class DemoA {
    private DemoB demoB;
    private String name;

    @Autowired(required = false)
    public DemoA(DemoB demoB, @Value("${demo.name}") String name) {
        this.demoB = demoB;
        this.name = name;

//        System.out.println("demoB = " + demoB + ", name = " + name);
    }
    @Autowired(required = false)
    public DemoA(DemoB demoB) {
        this.demoB = demoB;
    }
}