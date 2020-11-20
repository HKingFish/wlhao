package com.kingfish.kafkaserverdemo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import static com.kingfish.kafkaserverdemo.commons.common.Constants.KAFKA_TOPIC;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/9 20:32
 * @Des:
 */
@Component
@Slf4j
public class KafkaApplicationRunner implements ApplicationRunner {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //发送消息方法
        for (int i = 0; i < 5; i++) {
            kafkaTemplate.send(KAFKA_TOPIC, "测试  = " + i);
            log.info("消息发送 : " + "测试  = " + i);
        }
    }
}