package com.github.stazxr.gof23.工厂.简单工厂;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        switch (type) {
            case "latte":
                return new LatteCoffee();
            case "cat":
                return new CatCoffee();
            default:
                throw new RuntimeException("不支持的咖啡类型");
        }
    }
}
