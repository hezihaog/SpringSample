package com.zh.springxmlsample;

import com.zh.spring.model.Driver;
import com.zh.spring.model.Singer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //获取一个司机实例
        Driver driver1 = (Driver) context.getBean("driver1");
        driver1.work();
        //获取周杰伦
        Singer zhoujielun = (Singer) context.getBean("zhoujielun");
        zhoujielun.sing();
        //获取林俊杰
        Singer linjunjie = (Singer) context.getBean("linjunjie");
        linjunjie.sing();
    }
}