package com.github.stazxr.gof23.行为型.对象行为.访问者.双分派;

public class Person {
    void feed(Animal animal) {
        System.out.println("Animal");
    }

    void feed(Cat cat) {
        System.out.println("Cat");
    }
}
