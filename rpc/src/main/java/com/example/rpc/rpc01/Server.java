package com.example.rpc.rpc01;

import com.example.rpc.demo.User;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static boolean running = true;

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        while (running){
            Socket client = server.accept();
            process(client);
            client.close();
        }
    }

    private static void process(Socket socket) throws IOException {
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        int id = dis.readInt();
        UserServiceImpl userService = new UserServiceImpl();
        User user = userService.findUserById(id);
        dos.writeInt(user.getId());
        dos.writeUTF(user.getName());
        dos.flush();
    }

}
