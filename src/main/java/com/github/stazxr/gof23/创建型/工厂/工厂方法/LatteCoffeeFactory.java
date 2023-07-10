package com.github.stazxr.gof23.创建型.工厂.工厂方法;

public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
