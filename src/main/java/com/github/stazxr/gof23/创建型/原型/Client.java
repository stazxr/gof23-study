package com.github.stazxr.gof23.创建型.原型;

public class Client {
    public static void main(String[] args) {
        Citation realizeType = new Citation();
        realizeType.setName("张三");
        System.out.println(realizeType);
        realizeType.show();
        Citation clone = realizeType.clone();
        System.out.println(clone);
        clone.show();
    }
}
