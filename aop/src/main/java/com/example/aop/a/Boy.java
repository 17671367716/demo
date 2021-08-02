package com.example.aop.a;

import com.example.aop.service.IBuy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Boy implements IBuy {
    @Override
    public String buy(int i,String s) {
        System.out.println("boy");
        return "boy";
    }

    @Override
    public String f1(int i) {
        System.out.println("b-" + i);
        return i+"";
    }

    @Override
    public String f2(String s) {
        System.out.println("b-"+s);
        return s;
    }

    @Override
    public String f3(List list) {
//        list.forEach(date -> System.out.println(date));
        System.out.println("b-list");
        return "list";
    }
}
