package com.github.stazxr.gof23.行为型.对象行为.访问者;

public interface Animal {
    // 接收访问者的方法
    void accept(Person person);
}
