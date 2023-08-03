package com.github.stazxr.gof23.行为型.对象行为.观察者.扩展;

import java.util.Observable;

// 主题对象
public class Thief extends Observable {
    private final String name;

    public Thief(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void steal() {
        System.out.println(name + "：我偷东西了，来抓我");
        super.setChanged();
        super.notifyObservers();
    }
}
