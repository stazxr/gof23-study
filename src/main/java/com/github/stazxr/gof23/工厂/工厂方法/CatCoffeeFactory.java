package com.github.stazxr.gof23.工厂.工厂方法;

public class CatCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new CatCoffee();
    }
}
