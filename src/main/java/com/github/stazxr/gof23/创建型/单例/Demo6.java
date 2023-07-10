package com.github.stazxr.gof23.创建型.单例;

import java.io.Serializable;

/**
 * 静态内部类模式（线程安全）
 *
 * 即满足懒加载，又满足线程安全，同时又不会因为加锁导致性能的耗费，是一种推荐的单例模式
 *
 * 静态内部类单例模式中实例由内部类创建，由于 JVM 在加载外部类的过程中，是不会加载静态内部类的
 * 只有在内部类的属性/方法在被调用时才会被加载，并初始化其属性（懒加载）。
 * 静态属性由于被 static 关键字修饰，保证只被实例化一次（单实例）
 * 并且严格保证实例化顺序（线程安全）
 */
public class Demo6 implements Serializable {
    private static boolean flag = false;

    private Demo6() {
        synchronized (Demo6.class) {
            if (flag) {
                throw new RuntimeException("禁止重复创建对象");
            }

            flag = true;
        }
    }

    private static class InstanceHolder {
        private static final Demo6 instance = new Demo6();
    }

    public static Demo6 getInstance() {
        return InstanceHolder.instance;
    }

    // 当进行反序列化时，会自动调用该方法，将该方法的返回内容直接返回
    public Object readResolve() {
        return InstanceHolder.instance;
    }
}
