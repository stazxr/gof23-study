package com.github.stazxr.gof23.创建型.工厂.静态工厂;

public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
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
