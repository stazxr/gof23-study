package com.github.stazxr.gof23.单例;

/**
 * 枚举模式（线程安全）
 *
 * 枚举特性：天然线程安全，且只会装载一次
 *
 * 枚举模式是所有单例模式中，唯一一种不会被破坏的单例实现模式（反射、序列化）。
 *
 * 缺点：存在继承的模式是不可以用的
 */
public enum Demo7 {
    INSTANCE;

    public void getInstance() {
        System.out.println("do...");
    }
}
