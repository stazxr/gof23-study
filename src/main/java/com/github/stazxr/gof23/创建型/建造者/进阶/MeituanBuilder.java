package com.github.stazxr.gof23.创建型.建造者.进阶;

public class MeituanBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("美团车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("美团车座");
    }

    @Override
    public Bike buildBike() {
        return bike;
    }
}
