package com.github.stazxr.gof23.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS模式（线程安全）
 *
 * 依赖Java并发库的原子类AtomicReference
 *
 * 好处
 * 不使用传统的加锁的方式来保证线程，而是依赖CAS的忙等算法，依赖于底层硬件的时间，来保证线程安全
 * 相对于其他锁的实现，没有了线程的切换和阻塞的开销，可以支持较大的并发性
 * 缺点
 * 如果一直没有获取到将会一直忙等，限于死循环中
 */
public class CasMode {
    private static final AtomicReference<CasMode> INSTANCE = new AtomicReference<>();

    private CasMode() {
    }

    public static CasMode getInstance() {
        // 依赖CAS的忙等
        for (;;) {
            CasMode instance = INSTANCE.get();
            if (instance != null) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new CasMode());
            return INSTANCE.get();
        }
    }
}
