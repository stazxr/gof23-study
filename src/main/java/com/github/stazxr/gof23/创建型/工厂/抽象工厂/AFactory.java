package com.github.stazxr.gof23.创建型.工厂.抽象工厂;

public class AFactory implements AbstractFactory {
    @Override
    public Coffee createCoffee() {
        return new ACoffee();
    }

    @Override
    public Dessert createDessert() {
        return new ADessert();
    }
}
