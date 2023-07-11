package com.github.stazxr.gof23.结构型.享元;

public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块性状：" + getShape() + "，颜色：" + color);
    }
}
