package com.github.stazxr.gof23.行为型.对象行为.策略;

public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("策略1：买一送一");
    }
}
