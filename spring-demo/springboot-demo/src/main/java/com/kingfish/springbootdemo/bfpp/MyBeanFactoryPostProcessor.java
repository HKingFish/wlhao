package com.kingfish.springbootdemo.bfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

import java.util.Arrays;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/5/30 17:32
 * @Des:
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Arrays.stream(beanFactory.getBeanDefinitionNames())
                .map(beanName -> beanFactory.getBeanDefinition(beanName))
                .forEach(bd -> {
                    StringValueResolver stringValueResolver = new StringValueResolver() {
                        @Override
                        public String resolveStringValue(String strVal) {
                            return "6666";
                        }
                    };
                    bd.setInitMethodName("initMethod");
                    BeanDefinitionVisitor beanDefinitionVisitor = new BeanDefinitionVisitor(stringValueResolver);
                    beanDefinitionVisitor.visitBeanDefinition(bd);
                });


    }
}