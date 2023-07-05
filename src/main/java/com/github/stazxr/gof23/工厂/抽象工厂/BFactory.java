package com.github.stazxr.gof23.工厂.抽象工厂;

public class BFactory implements AbstractFactory {
    @Override
    public Coffee createCoffee() {
        return new BCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new BDessert();
    }
}
