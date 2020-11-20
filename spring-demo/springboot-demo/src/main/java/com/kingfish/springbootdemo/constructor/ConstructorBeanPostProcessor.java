package com.kingfish.springbootdemo.constructor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/5/21 19:57
 * @Des:
 */
@Component
public class ConstructorBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass == ConstructorDemoA.class) {
            System.out.println("beanClass = " + beanClass);
        }
        return null;
    }
}