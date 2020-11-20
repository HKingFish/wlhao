package com.kingfish.springbootdemo.replace;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/5/17 13:58
 * @Des:
 */

public class DemoA implements DemoBase {


    public DemoBase getDemoBase() {
        return new DemoB();
    }

    @Override
    public String hello() {
        return "demoA hello";
    }
}