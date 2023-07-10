package com.github.stazxr.gof23.创建型.工厂.简单工厂;

public abstract class Coffee {
    public abstract String name();

    public void addMilk() {
        System.out.println("加奶");
    }

    public void addSugar() {
        System.out.println("加糖");
    }
}
