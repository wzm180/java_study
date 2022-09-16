package com.example.mapper;

import com.example.model.Course;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.spring.annotation.MapperScan;

@Repository
@MapperScan("com.example.mapper")
public interface CourseMapper extends BaseMapper<Course> {

}