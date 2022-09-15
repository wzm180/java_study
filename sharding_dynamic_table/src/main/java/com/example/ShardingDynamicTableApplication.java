package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jack.shardingspherejdbc.mapper")
public class ShardingDynamicTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingDynamicTableApplication.class, args);
    }

}
