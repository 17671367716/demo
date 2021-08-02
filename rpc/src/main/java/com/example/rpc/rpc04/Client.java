package com.example.rpc.rpc04;

import com.example.rpc.demo.User;
import com.example.rpc.demo.UserService;
import com.example.rpc.demo.UserService_4;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {

        UserService_4 userService = Stub.getStub();
        System.out.println(userService.findUserById(123));
        System.out.println(userService.findUserByName("李四"));

    }
}
