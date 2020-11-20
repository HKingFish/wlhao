package com.kingfish.kafkaserverdemo.commons;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static com.kingfish.kafkaserverdemo.commons.common.Constants.KAFKA_TOPIC;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/11 14:46
 * @Des:
 */
@Component
@Slf4j
public class KafkaConsumerHandler {
    /**
     * kafka消息消费者
     * @param record
     */
    @KafkaListener(topics = {KAFKA_TOPIC})
    public void listen(ConsumerRecord<?, ?> record, Acknowledgment acknowledgment) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            log.info("接收到消息 ： record = {}, message = ", record, message);
            acknowledgment.acknowledge();
        }
    }
}