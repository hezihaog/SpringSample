package com.zh.springxmlsample;

import com.zh.spring.aop.Car;
import com.zh.spring.aop.SpringConfig;
import com.zh.spring.aop.Truck;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Truck truck = context.getBean(Truck.class);
        Car car = context.getBean(Car.class);
        truck.in();
        car.in();
        truck.out();
        car.out();
    }
}