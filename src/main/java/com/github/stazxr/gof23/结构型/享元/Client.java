package com.github.stazxr.gof23.结构型.享元;

public class Client {
    public static void main(String[] args) {
        AbstractBox l1 = BoxFactory.getBox("L");
        l1.display("黑色");

        AbstractBox l2 = BoxFactory.getBox("L");
        l2.display("白色");

        System.out.println(l1 == l2); // true 是同一个对象
    }
}
