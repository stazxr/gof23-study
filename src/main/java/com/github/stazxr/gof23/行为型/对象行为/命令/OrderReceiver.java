package com.github.stazxr.gof23.行为型.对象行为.命令;

public class OrderReceiver {
    public void makeFood(String name, int value) {
        System.out.println("厨师制作了".concat(name).concat(String.valueOf(value)).concat("份"));
    }
}
