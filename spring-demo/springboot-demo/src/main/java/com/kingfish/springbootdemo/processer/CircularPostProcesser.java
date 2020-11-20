//package com.kingfish.springbootdemo.processer;
//
//import com.kingfish.springbootdemo.circular.ACircular;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.PropertyValues;
//import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
//import org.springframework.stereotype.Component;
//
//import java.beans.PropertyDescriptor;
//
///**
// * @Author : wlhao
// * @Email : kingfishx@163.com
// * @Data: 2020/5/16 13:45
// * @Des:
// */
//@Component
//public class CircularPostProcesser implements InstantiationAwareBeanPostProcessor {
//    @Override
//    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
//        System.out.println("#### ->1 ");
//        return null;
//    }
//
//    @Override
//    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
//        System.out.println("#### ->1 ");
//        return false;
//    }
//
//    @Override
//    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
//        System.out.println("#### ->1 ");
//        return null;
//    }
//
//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        return null;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("#### ->1 ");
//        return null;
//    }
//
//    @Override
//    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
//        if (bean instanceof ACircular){
//            System.out.println("pvs = " + pvs);
//        }
//        return pvs;
//    }
//
//}
