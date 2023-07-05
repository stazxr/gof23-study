package com.github.stazxr.gof23.工厂.静态工厂;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");
        System.out.println(coffee.name());
    }
}
