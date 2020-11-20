package com.kingfish.springbootdemo.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/6/4 21:56
 * @Des: 自定义监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent event) {
        System.out.println("event = " + event);
    }
}