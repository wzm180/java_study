package com.example.service.impl;

import com.example.mapper.UserMapper;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String test(String id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user.getUserName() + user.getAge();
    }
}
