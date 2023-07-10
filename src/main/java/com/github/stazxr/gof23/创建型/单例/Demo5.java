package com.github.stazxr.gof23.创建型.单例;

/**
 * 双重检查锁模式（线程安全）
 * 优点：
 * 双重检查锁模式解决了单例、性能、线程安全的问题
 * 缺点：
 * 在多线程的情况下，可能会出现空指针的问题，出现问题的原因是 JVM 在实例化对象的时候会进行优化和指令重排操作，
 * 要解决这个问题可以使用 volatile 关键字，来保证其可见性和有序性。
 */
public class Demo5 {
    private static volatile Demo5 instance;

    private Demo5() { }

    public static Demo5 getInstance() {
        if (instance == null) {
            synchronized (Demo5.class) {
                if (instance == null) {
                    // 写操作
                    instance = new Demo5();
                }
            }
        }

        // 读操作
        return instance;
    }
}
