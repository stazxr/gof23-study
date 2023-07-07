package com.github.stazxr.gof23.装饰者;

public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(fastFood, "培根", 4);
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
