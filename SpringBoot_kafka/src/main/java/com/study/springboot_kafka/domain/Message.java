package com.study.springboot_kafka.domain;

import lombok.Data;

import java.io.Serializable;


@Data
public class Message implements Serializable
{
    private String from;
    private String message;
    public Message(){}
    public Message(String from,String message){
        this.from = from;
        this.message = message;
    }

    @Override
    public String toString(){
        return "Message{"+
                "from='"+from+'\''+
                ",message='"+message+'\''+
                "}";
    }

}