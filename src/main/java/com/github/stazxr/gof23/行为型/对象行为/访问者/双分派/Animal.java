package com.github.stazxr.gof23.行为型.对象行为.访问者.双分派;

public class Animal {
    void accept(Person person) {
        person.feed(this);
    }
}
