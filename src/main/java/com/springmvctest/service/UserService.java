package com.springmvctest.service;

import com.springmvctest.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findUsers() throws Exception;
}
