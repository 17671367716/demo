package com.example.rpc.rpc04;

import com.example.rpc.demo.User;
import com.example.rpc.demo.UserService;
import com.example.rpc.demo.UserService_4;

public class UserServiceImpl implements UserService_4 {
    @Override
    public User findUserById(Integer id) {
        return new User(id,"张三");
    }

    @Override
    public User findUserByName(String name) {
        return new User(456,name);
    }

}
