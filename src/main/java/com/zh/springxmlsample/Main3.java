package com.zh.springxmlsample;

import com.zh.spring.anno.Stage;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
        //获取注解标识的Bean实例
        Stage stage = (Stage) context.getBean("stage");
        System.out.println("舞台歌手：" + stage.getSinger());
        System.out.println("舞台舞者：" + stage.getDancer());
    }
}