package com.github.stazxr.gof23.行为型.对象行为.观察者.扩展;

import java.util.Observable;
import java.util.Observer;

public class Policeman implements Observer {
    private final String name;

    public Policeman(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("警察" + name + "：" + ((Thief) o).getName() + "我来抓你了");
    }
}
