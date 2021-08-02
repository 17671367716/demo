package com.example.rpc.rpc03;

import com.example.rpc.demo.User;
import com.example.rpc.demo.UserService;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {

        UserService service = Stub.getStub();
        User user = service.findUserById(123);
        System.out.println(user.toString());

    }
}
