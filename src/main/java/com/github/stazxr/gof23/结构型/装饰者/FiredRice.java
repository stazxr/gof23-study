package com.github.stazxr.gof23.结构型.装饰者;

public class FiredRice extends FastFood {
    public FiredRice() {
        super("炒饭", 10);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
