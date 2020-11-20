package com.kingfish.beaninitdemo;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeanInitDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BeanInitDemoApplication.class, args);
        Object demoFactoryBean = run.getBean("demoFactoryBean");
        Object bean = run.getBean("&demoFactoryBean");
        System.out.println( "BeanInitDemoApplication.main");

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);
//        DemoBean bean = applicationContext.getBean(DemoBean.class);

//     addSingletonFactory(beanName, new ObjectFactory() {
//            @Override
//            public Object getObject() throws BeansException {
//                return getEarlyBeanReference(beanName, mbd, bean);
//            }
//        });

        System.out.println("bean = " + bean);
    }

}
