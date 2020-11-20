package com.kingfish.selfioc.commons;

import com.kingfish.selfioc.annotation.SelfAutowired;
import com.kingfish.selfioc.annotation.SelfComponent;
import com.kingfish.selfioc.utils.ClassParseUtils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author : wlhao
 * @Email : wlhao@iflytek.com
 * @Data: 2020/2/15
 * @Des: 自定义上下文
 */

public class SelfPathXmlApplicationContext {
    // 要扫描的报名路径
    private String packageName;
    // 封装所有bean的容器
    private ConcurrentHashMap<String, Object> beanMap;

    public SelfPathXmlApplicationContext(String packageName) {
        this.packageName = packageName;
        this.beanMap = new ConcurrentHashMap<>();
        initBeans();
    }

    /**
     * 初始化bean
     */
    private void initBeans() {
        List<Class> clazzs = ClassParseUtils.getClasssFromPackage(packageName);
        clazzs.stream()
                .filter(clazz -> existAnnotation(clazz))
                .forEach(clazz -> {
                    try {
                        beanMap.put(toLowerCaseFirstOne(clazz.getSimpleName()), clazz.newInstance());
                    } catch (InstantiationException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });

    }


    /**
     * 初始化bean的实例对象的所有属性 - 只有注入到Spring 容器中的类才需要判断其属性需不需要注入
     */
    private void initEntryField() {
        beanMap.forEach((beanId, instance) -> {
            // 1. 循环遍历每个注入实例 instance
            Class<?> aClass = instance.getClass();
            Field[] fields = aClass.getDeclaredFields();
            // 2. 循环遍历instance里面的每个属性
            Arrays.stream(fields)
                    .filter(field -> null != field.getAnnotation(SelfAutowired.class))
                    .forEach(field -> {
                        // 如果有属性需要注入，则从map中拿到对应的属性注入
                        Object o = beanMap.get(field.getName());
                        if (o != null){
                            // 允许访问私有属性
                            field.setAccessible(true);
                            // 参数1 ，需要修改字段的对象， 参数2，修改的属性的新值
                            try {
                                field.set(instance, o);
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            }
                        }

                    });
        });
    }

    /**
     * 判断是否存在注入注解
     *
     * @param cls
     * @return
     */
    private boolean existAnnotation(Class<?> cls) {
        return null != cls.getAnnotation(SelfComponent.class);
    }

    /**
     * 首字母转小写
     *
     * @param s
     * @return
     */
    public String toLowerCaseFirstOne(String s) {
        if (Character.isLowerCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }

    /**
     * 依赖注入注解原理
     *
     * @param object
     * @throws Exception
     */
    public void attriAssign(Object object) throws Exception {

        // 1.使用反射机制,获取当前类的所有属性
        Class<? extends Object> classInfo = object.getClass();
        Field[] declaredFields = classInfo.getDeclaredFields();

        // 2.判断当前类属性是否存在注解
        for (Field field : declaredFields) {
            SelfAutowired extResource = field.getAnnotation(SelfAutowired.class);
            if (extResource != null) {
                // 获取属性名称
                String beanId = field.getName();
                Object bean = beanMap.get(beanId);
                if (bean != null) {
                    // 3.默认使用属性名称，查找bean容器对象 1参数 当前对象 2参数给属性赋值
                    field.setAccessible(true); // 允许访问私有属性
                    field.set(object, bean);
                }
            }
        }

    }


}