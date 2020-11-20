package com.kingfish.dubboproviderdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("dubbo-config.xml")
public class DubboProviderDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderDemoApplication.class, args);
    }

}
