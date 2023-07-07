package com.github.stazxr.gof23.装饰者;

public class Egg extends Garnish {
    public Egg(FastFood fastFood) {
        super(fastFood, "鸡蛋", 1.5F);
    }

    @Override
    public float cost() {
        // 配料的价格加上
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
