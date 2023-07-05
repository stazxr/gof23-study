package com.github.stazxr.gof23.工厂.抽象工厂;

public class Client {
    public static void main(String[] args) {
        // 创建具体工厂对象
        AbstractFactory factory = new BFactory();

        // 点单
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.name());
        dessert.show();
    }
}
