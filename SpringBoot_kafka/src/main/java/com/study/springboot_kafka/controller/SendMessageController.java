package com.study.springboot_kafka.controller;

import com.study.springboot_kafka.domain.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;
    @GetMapping("send/{message}")
    public void sendMessage(@PathVariable String message){
        this.kafkaTemplate.send("test",new Message("mess",message  ));
    }
}
