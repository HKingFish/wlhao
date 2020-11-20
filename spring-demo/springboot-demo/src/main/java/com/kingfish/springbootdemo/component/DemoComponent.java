package com.kingfish.springbootdemo.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/6/6 18:26
 * @Des:
 */
@Configuration
@PropertySource(value = "demo.properties")
@ComponentScan("com.kingfish.springbootdemo")
public class DemoComponent {

    @Component
    public static class DemoInclass{

    }
}