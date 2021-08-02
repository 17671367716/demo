package com.example.rpc.rpc02;

import com.example.rpc.demo.User;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *  充当 客户端的代理
 */

public class Stub {

    public User findUserById(Integer id) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeInt(123);

        socket.getOutputStream().write(baos.toByteArray());
        socket.getOutputStream().flush();

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        int userId = dis.readInt();
        String name = dis.readUTF();
        User user = new User(userId, name);

        dos.close();
        socket.close();
        return user;
    }

}
