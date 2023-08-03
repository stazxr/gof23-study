package com.github.stazxr.gof23.行为型.对象行为.观察者.扩展;

public class Client {
    public static void main(String[] args) {
        Thief thief = new Thief("李四");
        Policeman policeman = new Policeman("张三");
        thief.addObserver(policeman);
        thief.steal();
    }
}
