package com.github.stazxr.gof23.创建型.工厂.扩展;

import com.github.stazxr.gof23.temp.Coffee;

public class Client {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.name());
        System.out.println("=================");
        Coffee cat = CoffeeFactory.createCoffee("cat");
        System.out.println(cat.name());
    }
}
