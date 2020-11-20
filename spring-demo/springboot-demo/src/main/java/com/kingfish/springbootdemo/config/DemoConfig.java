package com.kingfish.springbootdemo.config;

import com.kingfish.springbootdemo.controller.DemoController;
import com.kingfish.springbootdemo.server.DemoService;
import com.kingfish.springbootdemo.server.impl.DemoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/20 20:30
 * @Des:
 */
@Component
@Configuration
public class DemoConfig {
    @Bean
    public DemoService demoService(){
        return new DemoServiceImpl();
    }
    @Bean
    public DemoController demoController(){
        System.out.println("demoController : " +  demoService());
        return new DemoController();
    }

    @Bean("demoController2")
    public DemoController demoController2(){
        System.out.println("demoController2222 : " +  demoService());
        return new DemoController();
    }
}