package com.github.stazxr.gof23.建造者.进阶;

public class HaluoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("哈啰车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("哈啰车座");
    }

    @Override
    public Bike buildBike() {
        return bike;
    }
}
