package com.github.stazxr.gof23.创建型.单例;

/**
 * 懒汉模式（线程不安全）
 */
public class Demo3 {
    private static Demo3 instance;

    private Demo3() { }

    public static Demo3 getInstance() {
        if (instance != null) {
            System.out.println("【懒汉模式】对象已存在");
            return instance;
        }

        System.out.println("【懒汉模式】第一次加载，创建实例");
        instance = new Demo3();
        return instance;
    }
}
