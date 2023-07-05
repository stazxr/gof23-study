package com.github.stazxr.gof23.temp;

public abstract class Coffee {
    public abstract String name();

    public void addMilk() {
        System.out.println("加奶");
    }

    public void addSugar() {
        System.out.println("加糖");
    }
}
