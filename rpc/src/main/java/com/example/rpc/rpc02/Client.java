package com.example.rpc.rpc02;

import com.example.rpc.demo.User;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        User user = new Stub().findUserById(123);
        System.out.println(user.toString());

    }
}
