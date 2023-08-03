package com.github.stazxr.gof23.行为型.对象行为.访问者;

public interface Person {
    // 定义访问元素的行为（可以每一个具体元素定义一个方法），这里使用多态只定义一个方法
    void feed(Animal animal);
}
