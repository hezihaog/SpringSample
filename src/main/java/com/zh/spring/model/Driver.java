package com.zh.spring.model;

/**
 * 司机类
 */
public class Driver {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("司机" + this.name + "开始送货啦");
    }
}