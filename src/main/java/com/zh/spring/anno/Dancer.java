package com.zh.spring.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 舞者类
 */
@Component("liujia")
public class Dancer {
    //设置值
    @Value("刘迦")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + name + '\'' +
                '}';
    }
}