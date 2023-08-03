package com.github.stazxr.gof23.行为型.对象行为.观察者;

public interface Subject {
    // 添加订阅者（观察者）
    void attach(Observer observer);

    // 添加订阅者（观察者）
    void detach(Observer observer);

    // 通知订阅者（观察者）
    void notice(String message);
}
