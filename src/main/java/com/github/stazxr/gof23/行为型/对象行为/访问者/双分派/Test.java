package com.github.stazxr.gof23.行为型.对象行为.访问者.双分派;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();

        Person person = new Person();
        animal.accept(person);
    }
}
