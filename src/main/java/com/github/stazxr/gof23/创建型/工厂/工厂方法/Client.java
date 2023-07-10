package com.github.stazxr.gof23.创建型.工厂.工厂方法;

public class Client {
    public static void main(String[] args) {
        // 创建咖啡店对象
        CoffeeStore store = new CoffeeStore();

        // 创建具体工厂对象
        CoffeeFactory factory = new LatteCoffeeFactory();
        store.setFactory(factory);

        // 点单
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.name());
    }
}
