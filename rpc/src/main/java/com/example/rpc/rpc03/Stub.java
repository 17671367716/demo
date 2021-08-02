package com.example.rpc.rpc03;

import com.example.rpc.demo.User;
import com.example.rpc.demo.UserService;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

/**
 *  充当 客户端的代理
 */

public class Stub {

    public static UserService getStub(){

         InvocationHandler h  = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Socket socket = new Socket("127.0.0.1", 8888);

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                DataOutputStream dos = new DataOutputStream(baos);
                dos.writeInt(123);

                socket.getOutputStream().write(baos.toByteArray());
                socket.getOutputStream().flush();

                DataInputStream dis = new DataInputStream(socket.getInputStream());
                int id = dis.readInt();
                String name = dis.readUTF();
                User user = new User(id, name);

                dos.close();
                socket.close();
                return user;
            }
        };
        /**
         *     public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         */
        Object o = Proxy.newProxyInstance(UserService.class.getClassLoader(), new Class[]{UserService.class}, h);
        System.out.println(o.getClass().getName());
        System.out.println(o.getClass().getInterfaces()[0]);
        return (UserService) o;
    }

}
