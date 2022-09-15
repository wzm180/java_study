package com.example;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
@MapperScan("com.jack.shardingspherejdbc.mapper")
public interface CourseMapper extends BaseMapper<Course> {

}
