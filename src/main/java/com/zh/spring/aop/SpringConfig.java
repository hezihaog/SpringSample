package com.zh.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 */
//标识为配置类，配置容器
@Configuration
//开启AOP
@EnableAspectJAutoProxy
//配置扫描包
@ComponentScan("com.zh.spring.aop")
public class SpringConfig {
    /**
     * 注册卡车实例
     */
    @Bean
    public Truck truck() {
        return new Truck();
    }

    /**
     * 注册轿车实例
     */
    @Bean
    public Car car() {
        return new Car();
    }
}