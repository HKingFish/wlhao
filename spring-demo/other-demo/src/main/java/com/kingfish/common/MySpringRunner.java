package com.kingfish.common;

import com.kingfish.auto.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/5 16:27
 * @Des:
 */
@Component
public class MySpringRunner  implements ApplicationRunner {
    @Autowired
    private Demo demo;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        demo.getmsg();
    }
}