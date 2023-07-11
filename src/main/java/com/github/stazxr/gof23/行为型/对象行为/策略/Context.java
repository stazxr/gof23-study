package com.github.stazxr.gof23.行为型.对象行为.策略;

public class Context {
    // 持有抽象策略模式的引用
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void show() {
        strategy.show();
    }
}
