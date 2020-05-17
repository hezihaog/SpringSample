package com.zh.springxmlsample;

import com.zh.spring.javaconfig.BeanConfiguration;
import com.zh.spring.javaconfig.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main4 {
    public static void main(String[] args) {
        //这里需要使用AnnotationConfigApplicationContext，而不是ClassPathXmlApplicationContext了
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Stage stage = (Stage) context.getBean("stage");
        System.out.println("舞台歌手：" + stage.getSinger());
        System.out.println("舞台舞者：" + stage.getDancer());
    }
}