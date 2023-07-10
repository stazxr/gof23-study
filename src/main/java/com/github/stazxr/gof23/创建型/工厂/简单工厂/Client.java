package com.github.stazxr.gof23.创建型.工厂.简单工厂;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");
        System.out.println(coffee.name());
    }
}
