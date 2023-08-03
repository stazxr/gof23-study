package com.github.stazxr.gof23.行为型.对象行为.观察者;

import java.util.ArrayList;
import java.util.List;

public class WxSubject implements Subject {
    // 存储多个观察者对象（一对多的关系）
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notice(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
