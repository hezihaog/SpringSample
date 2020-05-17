package com.zh.spring.model;

/**
 * 舞台类
 */
public class Stage {
    /**
     * 歌手
     */
    private Singer singer;
    //按名字装配，对应daolang
//    private Singer stage;
    /**
     * 舞者
     */
    private Dancer dancer;
    //按名字装配，对应liujia
//    private Dancer liujia;

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