package com.kingfish.kafkaserverdemo.bean;

import lombok.Data;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/9 20:30
 * @Des:
 */
@Data
public class KafkaBean<T> {
    private String id;
    private String msg;
    private T data;
}