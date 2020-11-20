package com.kingfish.kafkaserverdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/11 16:04
 * @Des:
 */
@RequestMapping
@RestController
public class KafkaController {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("say")
    public String say(){
        kafkaTemplate.send("hello", "good");
        return "123";
    }
}