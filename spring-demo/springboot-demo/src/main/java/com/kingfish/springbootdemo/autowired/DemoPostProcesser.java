package com.kingfish.springbootdemo.autowired;//package com.kingfish.springbootdemo.processer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.lang.reflect.Constructor;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/5/16 13:45
 * @Des:
 */
//@Component
public class DemoPostProcesser implements SmartInstantiationAwareBeanPostProcessor{
    @Override

    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass == DemoA.class){
            System.out.println("beanClass = " + beanClass);
        }
        return null;
    }
}
