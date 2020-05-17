package com.zh.spring.javaconfig;

/**
 * 舞台类
 */
public class Stage {
    /**
     * 歌手
     */
    private Singer singer;
    /**
     * 舞者
     */
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