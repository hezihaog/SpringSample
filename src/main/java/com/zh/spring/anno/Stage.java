package com.zh.spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 舞台类
 */
@Component("stage")
public class Stage {
    //注入
    @Autowired
    @Qualifier("zhoujielun")
    private Singer singer;
    @Autowired
    @Qualifier("liujia")
    private Dancer dancer;

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Dancer getDancer() {
        return dancer;
    }

    public void setDancer(Dancer dancer) {
        this.dancer = dancer;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "singer=" + singer +
                ", dancer=" + dancer +
                '}';
    }
}