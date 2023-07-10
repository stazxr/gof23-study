package com.github.stazxr.gof23.创建型.单例;

/**
 * 饿汉模式：线程安全
 */
public class Demo2 {
    private static final Demo2 instance;

    static {
        instance = new Demo2();
    }

    private Demo2() { }

    public static Demo2 getInstance() {
        return instance;
    }
}
