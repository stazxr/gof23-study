package com.github.stazxr.gof23.行为型.对象行为.访问者;

public class Owner implements Person {
    @Override
    public void feed(Animal animal) {
        System.out.println("主人喂食" + animal);
    }
}
