package com.study.springboot_redis.springboot_redis.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController
{
    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("/redis/addString")
    public String addToRedis(String name,String value){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set(name,value);
        return "";
    }
    @GetMapping("redis/getString")
    public String getForRedis(String key){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        return valueOperations.get(key).toString();
    }
}
