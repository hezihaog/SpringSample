package com.zh.spring.model;

/**
 * 舞者类
 */
public class Dancer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + name + '\'' +
                '}';
    }
}