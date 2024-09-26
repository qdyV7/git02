package com.msb.service_impl;


import com.msb.mapper.UserMapper;
import com.msb.pojo.User;
import com.msb.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service("si")
public class ServiceImpl  implements Service {
    @Autowired
    UserMapper userMapper;
    @Override
    public User select(int id) {

        return userMapper.selectById(id);
    }
}
