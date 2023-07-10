package com.github.stazxr.gof23.创建型.建造者;

public abstract class Builder {
    protected Bike bike = new Bike();

    // 构建车架
    public abstract void buildFrame();

    // 构造车座
    public abstract void buildSeat();

    // 构建自行车
    public abstract Bike buildBike();
}
