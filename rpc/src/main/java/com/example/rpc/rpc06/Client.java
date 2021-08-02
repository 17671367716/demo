package com.example.rpc.rpc06;

import com.example.rpc.demo.User;
import com.example.rpc.demo.UserService;
import com.example.rpc.rpc06.test.Test;
import com.example.rpc.rpc06.test.TestService;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {

//        UserService userService =(UserService) Stub.getStub(UserService.class);
//        System.out.println(((User)userService.findUserById(123)).toString());

        TestService testService =(TestService) Stub.getStub(TestService.class);
        System.out.println(((Test)testService.getTest()).toString());
    }
}
