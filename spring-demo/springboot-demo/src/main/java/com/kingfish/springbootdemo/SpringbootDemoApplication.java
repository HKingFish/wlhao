package com.kingfish.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@ImportResource("property-bean.xml")
//@Import(DemoConfig.class)/

public class SpringbootDemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootDemoApplication.class, args);
//        DemoEvent demoEvent = new DemoEvent("", "world");
//        run.publishEvent(demoEvent);
//        DemoComponent.DemoInclass bean = run.getBean(DemoComponent.DemoInclass.class);
//        System.out.println("bean = " + bean);
//        bean.getClass().getMethod().in
//        PropertyDemoA bean = run.getBean(PropertyDemoA.class);
//        System.out.println("bean = " + bean);

//        BCircular bCircular = run.getBean(BCircular.class);
//        CCircular cCircular = run.getBean(CCircular.class);

//        System.out.println("cCircular = " + cCircular);
//        DemoController bean = run.getBean(DemoController.class);
//        System.out.println("bean = " + bean);
//
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);
//        annotationConfigApplicationContext.getBean("demoService");

    }


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity("https://msg.csdn.net/v1/web/message/view/unread", null, String.class);
//
//        String body = stringResponseEntity.getBody();
//
//        System.out.println(body);
    }
}
