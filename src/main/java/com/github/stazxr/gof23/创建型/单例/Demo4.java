package com.github.stazxr.gof23.创建型.单例;

import java.io.Serializable;

/**
 * 懒汉模式（线程安全）
 * 由于锁加到了访问方法上，导致所有的访问都需要锁占用，导致资源浪费，不建议使用！
 */
public class Demo4 implements Serializable {
    private static Demo4 instance;

    private Demo4() {
        if (instance != null) {
            throw new RuntimeException("禁止重复创建对象");
        }
    }

    public static synchronized Demo4 getInstance() {
        if (instance != null) {
            System.out.println("【懒汉模式-线程安全】对象已存在");
            return instance;
        }

        System.out.println("【懒汉模式-线程安全】第一次加载，创建实例");
        instance = new Demo4();
        return instance;
    }
}
