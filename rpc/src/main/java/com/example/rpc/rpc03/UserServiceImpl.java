package com.example.rpc.rpc03;

import com.example.rpc.demo.User;
import com.example.rpc.demo.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(Integer id) {
        return new User(id,"张三");
    }
}
