package com.example.aop.a;

import com.example.aop.service.IBuy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Girl implements IBuy {
    @Override
    public String buy(int i,String s) {
        System.out.println("girl");
        return "girl";
    }

    @Override
    public String f1(int i) {
        System.out.println("g-" + i);
        return i+"";
    }

    @Override
    public String f2(String s) {
        System.out.println("g-"+s);
        return s;
    }

    @Override
    public String f3(List list) {
        System.out.println("g-list");
        return "list";
    }
}
