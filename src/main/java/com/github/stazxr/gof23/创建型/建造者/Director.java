package com.github.stazxr.gof23.创建型.建造者;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.buildBike();
    }
}
