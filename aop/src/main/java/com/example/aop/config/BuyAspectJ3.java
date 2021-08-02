package com.example.aop.config;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class BuyAspectJ3 {

    public BuyAspectJ3() {
        System.out.println("BuyAspectJ");
    }

    @Before("execution(* com.example.aop.service.IBuy.buy(..))")
    public void f1(JoinPoint jp){
        Object[] args = jp.getArgs();
        for(Object obj: args){
            System.out.println(obj+"");
        }
        System.out.println("Before");
    }

    @After("execution(* com.example.aop.service.IBuy.buy(..))")
    public String f2() {
        System.out.println("After");
        return "f2";
    }

    @Around("execution(* com.example.aop.service.IBuy.buy(..))")
    public void f3(ProceedingJoinPoint pjp) throws Throwable {
        f();
        pjp.proceed();
        f();
    }
    public void f(){
        System.out.println("dasd");
    }

}
