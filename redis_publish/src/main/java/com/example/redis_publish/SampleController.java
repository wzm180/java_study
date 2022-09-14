package com.example.redis_publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * redis生产者测试
     * @param data
     * @return
     */
    @PostMapping("/send")
    public String send1(@RequestBody String data) {
        redisTemplate.convertAndSend("test", data);
        return "success";
    }

}
