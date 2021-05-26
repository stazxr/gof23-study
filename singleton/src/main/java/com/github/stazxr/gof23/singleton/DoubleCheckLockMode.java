package com.github.stazxr.gof23.singleton;

/**
 * 双重检锁模式（线程安全）
 *
 * 是方法级锁的优化，减少了部分获取实例的耗时
 * 也满足懒加载
 */
public class DoubleCheckLockMode {
    private static DoubleCheckLockMode instance;

    private DoubleCheckLockMode() {
    }

    public static DoubleCheckLockMode getInstance() {
        if (null != instance) {
            return instance;
        }
        synchronized (DoubleCheckLockMode.class) {
            if (null == instance) {
                instance = new DoubleCheckLockMode();
            }
        }
        return instance;
    }
}
