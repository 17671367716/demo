package com.example.aop.config;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class BuyAspectJ2 {

    public BuyAspectJ2() {
        System.out.println("BuyAspectJ2");
    }

//    @Order(1)
    @Before("execution(* com.example.aop.service.*.*(..))")
    public void f2(){
        System.out.println("2");
    }

//    @Order(1)
//    @Before("execution(* com.example.aop.service.IBuy.buy(..))")
//    public void f1(){
//        System.out.println("f1");
//    }

//    @Before("execution(* com.example.aop.service.*.*(Integer))")
//    public void f3(){
//        System.out.println("f3");
//    }
//
//    @Before("execution(* com.example.aop.service.*.*(Integer))")
//    public void f4(){
//        System.out.println("f4");
//    }

}
