package com.github.stazxr.gof23.singleton;

/**
 * 饿汉模式（线程安全）
 *
 * 与静态类类似，在程序启动的时候直接实例化
 * 需根据业务场景决定是否使用
 */
public class HungryMode {
    private static HungryMode instance = new HungryMode();

    private HungryMode() {
    }

    public static synchronized HungryMode getInstance() {
        return instance;
    }
}
