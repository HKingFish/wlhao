package com.kingfish.springbootdemo.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/6/4 21:56
 * @Des:  自定义监听事件
 */
public class DemoEvent  extends ApplicationEvent {
    private String msg;
    public DemoEvent(Object source) {
        super(source);
    }

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public void printMsg(){
        System.out.println("msg = " + msg);
    }
}