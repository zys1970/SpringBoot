package com.study.springboot_kafka.listener;


import com.study.springboot_kafka.domain.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageListener
{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = "test",groupId = "test-consumer")
    public void listen(Message message){
        logger.info("收到消息:{}",message);
    }
}
