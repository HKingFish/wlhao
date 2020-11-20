package com.kingfish.springbootdemo.replace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/5/17 17:17
 * @Des:
 */
public class DemoMethodReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("method = " + method);
        return "reimplement";
    }
}