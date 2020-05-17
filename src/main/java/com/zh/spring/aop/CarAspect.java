package com.zh.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 切面类
 */
//切面类也是Spring管理的Bean
@Component
@Aspect
public class CarAspect {
    @Before("execution(public void out())")
    public void outBeforeNote(JoinPoint point) {
        //在出门前执行
        System.out.println("\n<========= 出门登记 ========>");
        //接入方法信息
        System.out.println("point.getSignature() = " + point.getSignature());
        //接入目标对象的类型信息
        System.out.println("point.getTarget().getClass().getName() = " + point.getTarget().getClass().getName());
    }

    @After("execution(public void out())")
    public void outAfterNote(JoinPoint point) {
        //在出门后执行
        System.out.println("<========= 出门成功 ========>\n");
    }

    @Around("execution(public void out())")
    public void aroundNote(ProceedingJoinPoint point) throws Throwable {
        long startTime = System.currentTimeMillis();
        //执行原方法
        point.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("出门耗时（毫秒）：" + (endTime - startTime));
    }
}