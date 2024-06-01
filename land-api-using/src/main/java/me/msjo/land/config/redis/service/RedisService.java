package me.msjo.land.config.redis.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

//@Service
@Slf4j
@RequiredArgsConstructor
public class RedisService {

    StringRedisTemplate stringRedisTemplate;

    private final RedisTemplate<String, Object> redisTemplate;

    /**
     * Get data
     */
    public Object get(int key) {

        ValueOperations<String, Object> setOperations = redisTemplate.opsForValue();

        Object result = setOperations.get(key);

        return result;

    }

    /**
     * Put data
     * @param key
     * @param value
     */
    public void put(int key, Object value) {

        int expireTime = 14 * 1000;

        redisTemplate.opsForValue().set(String.valueOf(key), value);
        redisTemplate.expire(String.valueOf(key), expireTime, TimeUnit.SECONDS);
    }

}
