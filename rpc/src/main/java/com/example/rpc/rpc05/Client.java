package com.example.rpc.rpc05;

import com.example.rpc.demo.UserService;
import com.example.rpc.demo.UserService_4;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {

        UserService userService = Stub.getStub();
        System.out.println(userService.findUserById(123));

    }
}
