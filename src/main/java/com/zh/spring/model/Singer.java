package com.zh.spring.model;

/**
 * 歌手类
 */
public class Singer {
    private String name;

    public void sing() {
        System.out.println("歌手[" + name + "]开唱啦，快挥舞起你手中的荧光棒吧");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                '}';
    }
}