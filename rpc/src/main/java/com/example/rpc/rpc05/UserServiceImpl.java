package com.example.rpc.rpc05;

import com.example.rpc.demo.User;
import com.example.rpc.demo.UserService;
import com.example.rpc.demo.UserService_4;

public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(Integer id) {
        return new User(id,"张三");
    }

}
