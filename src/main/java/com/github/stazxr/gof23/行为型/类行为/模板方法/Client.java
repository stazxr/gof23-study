package com.github.stazxr.gof23.行为型.类行为.模板方法;

public class Client {
    public static void main(String[] args) {
        Cook cook = new CookBaoCai();
        cook.cookProcess();
    }
}
