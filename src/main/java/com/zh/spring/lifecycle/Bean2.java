package com.zh.spring.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bean2")
public class Bean2 {
    public void sayMsg(String msg) {
        System.out.println("Bean1 => " + msg);
    }

    /**
     * 创建成功
     */
    @PostConstruct
    public void init() throws Exception {
        System.out.println("Bean2 => 创建");
    }

    /**
     * 准备销毁
     */
    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Bean2 => 销毁");
    }
}