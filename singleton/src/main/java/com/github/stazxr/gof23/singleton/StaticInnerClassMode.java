package com.github.stazxr.gof23.singleton;

/**
 * 静态内部类模式（线程安全）
 *
 * 即满足懒加载，又满足线程安全，同时又不会因为加锁导致性能的耗费，是一种推荐的单例模式
 *
 * 主要原因是因为JVM虚拟机可以保证在多线程并发访问的正确性，也就是一个类的构造方法在多线程环境下也可以被正常的加载
 */
public class StaticInnerClassMode {
    private static class InstanceHolder {
        private static StaticInnerClassMode instance = new StaticInnerClassMode();
    }

    private StaticInnerClassMode() {
    }

    public static StaticInnerClassMode getInstance() {
        return InstanceHolder.instance;
    }
}
