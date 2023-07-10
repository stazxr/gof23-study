package com.github.stazxr.gof23.创建型.建造者;

public class Client {
    public static void main(String[] args) {
        Builder builder = new MeituanBuilder();
        Director director = new Director(builder);
        Bike construct = director.construct();
        System.out.println(construct);
    }
}
