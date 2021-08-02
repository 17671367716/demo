package com.example.rpc.rpc05;

import com.example.rpc.demo.User;
import com.example.rpc.demo.UserService;
import com.example.rpc.demo.UserService_4;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                //  方法名
                String methodName = method.getName();
                //  参数列表类型（方法重载）
                Class<?>[] parameterTypes = method.getParameterTypes();

                oos.writeUTF(methodName);
                oos.writeObject(parameterTypes);
                oos.writeObject(args);
                oos.flush();

//                ByteArrayOutputStream baos = new ByteArrayOutputStream();
//                DataOutputStream dos = new DataOutputStream(baos);
//                dos.writeInt(123);
//                socket.getOutputStream().write(baos.toByteArray());
//                socket.getOutputStream().flush();

//                DataInputStream dis = new DataInputStream(socket.getInputStream());
//                int id = dis.readInt();
//                String name = dis.readUTF();
//                User user = new User(id, name);
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                User user = (User)ois.readObject();

                oos.close();
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
