package com.zh.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 切面类
 */
//切面类也是Spring管理的Bean
@Component
@Aspect
public class OutAspect {
    @Before("execution(public void out())")
    public void outBeforeNote(JoinPoint point) {
        //在出门前执行
        System.out.println("\n<========= 出门登记 ========>");
    }

    @After("execution(public void out())")
    public void outAfterNote(JoinPoint point) {
        //在出门后执行
        System.out.println("<========= 出门成功 ========>\n");
    }
}