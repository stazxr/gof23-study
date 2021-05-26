package com.github.stazxr.gof23.singleton;

/**
 * 懒汉模式（线程安全）
 *
 * 由于锁加到了访问方法上，导致所有的访问都需要锁占用，导致资源浪费，不建议使用！
 *
 * 有一个私有的成员变量实例
 * 私有化构造器，不允许外部创建
 * 提供公共访问接口，getInstance()，获取对象实例，加锁，保证线程安全
 */
public class LazySafeMode {
    private static LazySafeMode instance;

    private LazySafeMode() {
    }

    public static synchronized LazySafeMode getInstance() {
        if (instance != null) {
            System.out.println("【懒汉模式-线程安全】对象已存在");
            return instance;
        }

        System.out.println("【懒汉模式-线程安全】第一次加载，创建实例");
        instance = new LazySafeMode();
        return instance;
    }
}
