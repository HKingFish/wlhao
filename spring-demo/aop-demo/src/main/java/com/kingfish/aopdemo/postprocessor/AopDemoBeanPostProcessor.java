package com.kingfish.aopdemo.postprocessor;

import com.kingfish.aopdemo.aop.AopDemo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/4 14:40
 * @Des:
 */
@Component
public class AopDemoBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass == AopDemo.class){
            System.out.println("beanClass = " + beanClass);
        }
        return null;
    }
}