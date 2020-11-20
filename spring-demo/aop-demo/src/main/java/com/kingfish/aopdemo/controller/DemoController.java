package com.kingfish.aopdemo.controller;

import com.kingfish.aopdemo.service.DemoService;
import com.kingfish.aopdemo.service.impl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/2 22:57
 * @Des:
 */
@RestController
@Component
public class DemoController {
    @Autowired
    private DemoService demoService;

    @Autowired
    public void setDemoService(DemoService demoService) {
        this.demoService = new DemoServiceImpl("setter");
    }

    public DemoController(DemoService demoService) {
        this.demoService = new DemoServiceImpl("构造");
    }

    public void hello(String msg) {
        System.out.println("hello " + msg);
    }
}