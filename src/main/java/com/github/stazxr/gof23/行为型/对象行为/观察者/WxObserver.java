package com.github.stazxr.gof23.行为型.对象行为.观察者;

public class WxObserver implements Observer {
    private final String name;

    public WxObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "接收到消息：" + message);
    }
}
