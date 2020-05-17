package com.zh.springxmlsample;

import com.zh.spring.model.Stage;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        //获取舞台实例
        Stage stage = (Stage) context.getBean("stage");
        System.out.println("舞台歌手：" + stage.getSinger());
        System.out.println("舞台舞者：" + stage.getDancer());
    }
}