package com.mengxuegu.springboot.bean;

public class Forte {

    private String name;
    private Integer time;

    @Override
    public String toString() {
        return "Forte{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
