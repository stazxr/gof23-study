package com.github.stazxr.gof23.行为型.对象行为.职责链;

public class RestRequest {
    private final String name;

    private final int days;

    private final String desc;

    public RestRequest(String name, int days, String desc) {
        this.name = name;
        this.days = days;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public String getDesc() {
        return desc;
    }
}
