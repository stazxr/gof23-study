package com.github.stazxr.gof23.行为型.对象行为.中介者;

public abstract class Person {
    protected String name;

    // 依赖中介者对象
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
