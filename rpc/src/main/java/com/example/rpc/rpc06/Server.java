package com.example.rpc.rpc06;

import com.example.rpc.demo.User;
import com.example.rpc.rpc06.test.TestService;
import com.example.rpc.rpc06.test.TestServiceImpl;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
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
//        DataOutputStream dos = new DataOutputStream(out);
        ObjectOutputStream oos = new ObjectOutputStream(out);

        //  从 socket 中读取 接口名称
        String clazzName = ois.readUTF();
        //  从 socket 中读取方法名
        String methodName = ois.readUTF();
        //  从 socket 中读取参数类型列表
        Class[] parameterTypes = (Class[])ois.readObject();
        //  从 socket 中读取参数列表
        Object[] args =(Object[]) ois.readObject();

        Class clazz = null;
//        clazz = UserServiceImpl.class;
        clazz = TestServiceImpl.class;

        //  通过反射的方式，找到对应的方法
        Method method = clazz.getMethod(methodName, parameterTypes);
        Object o =(Object) method.invoke(clazz.newInstance(), args);

        oos.writeObject(o);
        oos.flush();
    }

}
