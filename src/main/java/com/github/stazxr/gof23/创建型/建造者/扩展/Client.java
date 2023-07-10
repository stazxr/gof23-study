package com.github.stazxr.gof23.创建型.建造者.扩展;

public class Client {
    public static void main(String[] args) {
        Demo demo = new Demo.Builder()
            .field1("FILE1")
            .field2("FILE2")
            .field3("FILE3")
            .field4("FILE4")
            .field5("FILE5")
            .build();
        System.out.println(demo);
    }
}
