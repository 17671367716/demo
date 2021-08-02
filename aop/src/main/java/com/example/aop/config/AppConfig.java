package com.example.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


/**
 * @author Administrator
 */
@Configuration
//@ComponentScan("com.example.aop")
@ComponentScans( value = {
        @ComponentScan(basePackageClasses = {com.example.aop.service.IBuy.class}),
//        @ComponentScan(basePackageClasses = {com.example.aop.config.BuyAspectJ.class}),
//        @ComponentScan(basePackageClasses = {com.example.aop.config.BuyAspectJ2.class}),
        @ComponentScan(basePackageClasses = {com.example.aop.config.BuyAspectJ3.class}),
        @ComponentScan("com.example.aop")
    }
)
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
}
