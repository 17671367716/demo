package com.example.aop.test;

import com.example.aop.config.AppConfig;
import com.example.aop.a.Boy;
import com.example.aop.a.Girl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Boy boy = context.getBean("boy", Boy.class);
//        Girl girl = context.getBean("girl", Girl.class);
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0;i<10;i++){
//            list.add(i);
//        }
        boy.buy(1,"s");
//        boy.f1(10);
//        boy.f2("b1");
//        boy.f3(list);
//        System.out.println("-----------------");
//        girl.buy();
//        girl.f1(2);
//        girl.f2("g2");
//        girl.f3(list);
    }
}
