package com.springmvctest.service;

import com.springmvctest.mapper.UserMapper;
import com.springmvctest.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserMapper userMapper;
    public List<User> findUsers() throws Exception
    {
        List<User> users = new ArrayList<User>();
        users = userMapper.selectByExample(null);
        return users;
    }
}
