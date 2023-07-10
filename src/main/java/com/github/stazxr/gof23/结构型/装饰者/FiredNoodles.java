package com.github.stazxr.gof23.结构型.装饰者;

public class FiredNoodles extends FastFood {
    public FiredNoodles() {
        super("炒面", 13);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
