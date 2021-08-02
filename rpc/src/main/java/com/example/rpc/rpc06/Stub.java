package com.example.rpc.rpc06;

import com.example.rpc.demo.User;
import com.example.rpc.demo.UserService;

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

    public static Object getStub(Class clazz){

         InvocationHandler h  = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Socket socket = new Socket("127.0.0.1", 8888);

                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                //  接口名
                String clazzName = clazz.getName();
                //  接口内方法名
                String methodName = method.getName();
                //  参数列表类型（方法重载）
                Class<?>[] parameterTypes = method.getParameterTypes();

                oos.writeUTF(clazzName);
                oos.writeUTF(methodName);
                oos.writeObject(parameterTypes);
                oos.writeObject(args);
                oos.flush();

                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Object o = ois.readObject();

                oos.close();
                socket.close();
                return o;
            }
        };
        /**
         *     public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         */
        Object o = Proxy.newProxyInstance(clazz.getClassLoader(),new Class[]{clazz}, h);
//        Object o = Proxy.newProxyInstance(clazz.getClass().getClassLoader(),clazz.getInterfaces(), h);
        System.out.println(o.getClass().getName());
//        System.out.println(o.getClass().getInterfaces()[0]);
        return o;
    }

}
