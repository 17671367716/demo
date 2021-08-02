package com.example.rpc.rpc01;

import com.example.rpc.demo.User;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeInt(123);

        socket.getOutputStream().write(baos.toByteArray());
        socket.getOutputStream().flush();

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        int id = dis.readInt();
        String name = dis.readUTF();
//        int id = dis.readInt();
        User user = new User(id, name);
        System.out.println(user.toString());
        dos.close();
        socket.close();
    }
}
