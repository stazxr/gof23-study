package com.github.stazxr.gof23.创建型.单例;

/**
 * 饿汉模式：线程安全
 */
public class Demo1 {
    private static final Demo1 instance = new Demo1();

    private Demo1() { }

    public static Demo1 getInstance() {
        return instance;
    }
}
