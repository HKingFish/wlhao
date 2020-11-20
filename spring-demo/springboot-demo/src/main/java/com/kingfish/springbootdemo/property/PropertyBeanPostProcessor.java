package com.kingfish.springbootdemo.property;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/5/23 14:58
 * @Des:
 */
@Component
public class PropertyBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (bean instanceof PropertyDemoA){
            System.out.println("bean = " + bean);
        }
        return true;
    }
}