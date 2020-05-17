package com.zh.spring.lifecycle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 歌手类
 */
@Component(value = "singer2")
//Lazy注解：懒加载
@Lazy()
public class Singer2 {
    @Value("歌手2")
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