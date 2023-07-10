package com.github.stazxr.gof23.创建型.建造者.进阶;

public class Client {
    public static void main(String[] args) {
        Builder builder = new MeituanBuilder();
        Bike construct = builder.construct();
        System.out.println(construct);
    }
}
