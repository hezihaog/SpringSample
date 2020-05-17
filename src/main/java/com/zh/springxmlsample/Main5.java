package com.zh.springxmlsample;

import com.zh.spring.lifecycle.Bean1;
import com.zh.spring.lifecycle.Bean2;
import com.zh.spring.lifecycle.Singer1;
import com.zh.spring.lifecycle.Singer2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_lifecycle.xml");
        //懒加载
        Singer1 singer1 = (Singer1) context.getBean("singer1");
        singer1.sing();
        Singer2 singer2 = (Singer2) context.getBean("singer2");
        singer2.sing();
        //生命周期回调
        Bean1 bean1 = (Bean1) context.getBean("bean1");
        bean1.sayMsg("我是Bean1");
        Bean2 bean2 = (Bean2) context.getBean("bean2");
        bean2.sayMsg("我是Bean2");
        //销毁Bean
        context.destroy();
    }
}