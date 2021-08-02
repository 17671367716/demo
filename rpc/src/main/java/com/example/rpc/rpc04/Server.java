package com.example.rpc.rpc04;

import com.example.rpc.demo.User;

import java.io.*;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static boolean running = true;

    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8888);
        while (running){
            Socket client = server.accept();
            process(client);
            client.close();
        }
    }

    private static void process(Socket socket) throws Exception {

        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        ObjectInputStream ois = new ObjectInputStream(in);
        DataOutputStream dos = new DataOutputStream(out);

        //  从 socket 中读取方法名
        String methodName = ois.readUTF();
        //  从 socket 中读取参数类型列表
        Class[] parameterTypes = (Class[])ois.readObject();
        //  从 socket 中读取参数列表
        Object[] args =(Object[]) ois.readObject();

        UserServiceImpl userService = new UserServiceImpl();
        //  通过反射的方式，找到对应的方法
        Method method = userService.getClass().getMethod(methodName, parameterTypes);
        User user =(User) method.invoke(userService, args);

        dos.writeInt(user.getId());
        dos.writeUTF(user.getName());
        dos.flush();
    }

}
