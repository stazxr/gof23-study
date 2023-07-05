package com.github.stazxr.gof23.单例;

/**
 * 测试类
 */
public class TestSingleton {
    public static void main(String[] args) throws Exception {
//        // 测试饿汉模式
//        Demo1 hungry1 = Demo1.getInstance();
//        Demo1 hungry2 = Demo1.getInstance();
//        if (hungry1 != hungry2) {
//            throw new Exception("饿汉模式测试失败，两个对象地址值不相等");
//        }
//        System.out.println("Demo1 ==================== OK");
//
//        // 测试饿汉模式
//        Demo2 hungry3 = Demo2.getInstance();
//        Demo2 hungry4 = Demo2.getInstance();
//        if (hungry3 != hungry4) {
//            throw new Exception("饿汉模式测试失败，两个对象地址值不相等");
//        }
//        System.out.println("Demo2 ==================== OK");
//
//        // 测试懒汉模式，两个对象应是同一个
//        Demo3 lazy1 = Demo3.getInstance();
//        Demo3 lazy2 = Demo3.getInstance();
//        if (lazy1 != lazy2) {
//            throw new Exception("懒汉模式测试失败，两个对象地址值不相等");
//        }
//        System.out.println("Demo3 ==================== OK");

        // 测试懒汉模式的线程安全性
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(() -> {
                Demo5.getInstance().hashCode();
            });
            thread.setName("lazy" + i);
            thread.start();
        }
        System.out.println("耗时: " + (System.currentTimeMillis() - startTime));

//        // 测试线程安全的懒汉模式
//        LazySafeMode lazySafe1 = LazySafeMode.getInstance();
//        LazySafeMode lazySafe2 = LazySafeMode.getInstance();
//        if (lazySafe1 != lazySafe2) {
//            throw new Exception("懒汉模式-线程安全测试失败，两个对象地址值不相等");
//        }
//        System.out.println("==================== OK");
//

//        // 测试静态内部类模式
//        StaticInnerClassMode innerClass1 = StaticInnerClassMode.getInstance();
//        StaticInnerClassMode innerClass2 = StaticInnerClassMode.getInstance();
//        if (innerClass1 != innerClass2) {
//            throw new Exception("静态内部类模式测试失败，两个对象地址值不相等");
//        }
//        System.out.println("==================== OK");
//
//        // 测试双重检锁模式
//        DoubleCheckLockMode doubleCheckLock1 = DoubleCheckLockMode.getInstance();
//        DoubleCheckLockMode doubleCheckLock2 = DoubleCheckLockMode.getInstance();
//        if (doubleCheckLock1 != doubleCheckLock2) {
//            throw new Exception("双重检锁模式测试失败，两个对象地址值不相等");
//        }
//        System.out.println("==================== OK");
//
//        // 测试CAS模式
//        CasMode cas1 = CasMode.getInstance();
//        CasMode cas2 = CasMode.getInstance();
//        if (cas1 != cas2) {
//            throw new Exception("CAS模式测试失败，两个对象地址值不相等");
//        }
//        System.out.println("==================== OK");
//

//
//        // 测试加锁的懒汉模式的性能
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            Thread thread = new Thread(() -> {
//                LazySafeMode instance = LazySafeMode.getInstance();
//                System.out.println(Thread.currentThread().getName() + "\t" + instance);
//            });
//            thread.setName("lazySafe" + i);
//            thread.start();
//        }
//        System.out.println("线程安全的懒汉模式耗时: " + (System.currentTimeMillis() - startTime));
//
//        // 测试饿汉模式的性能
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            Thread thread = new Thread(() -> {
//                Demo1 instance = Demo1.getInstance();
//                System.out.println(Thread.currentThread().getName() + "\t" + instance);
//            });
//            thread.setName("hungry" + i);
//            thread.start();
//        }
//        System.out.println("饿汉模式耗时: " + (System.currentTimeMillis() - startTime));
//
//        // 测试静态内部类模式的性能
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            Thread thread = new Thread(() -> {
//                StaticInnerClassMode instance = StaticInnerClassMode.getInstance();
//                System.out.println(Thread.currentThread().getName() + "\t" + instance);
//            });
//            thread.setName("StaticInnerClass" + i);
//            thread.start();
//        }
//        System.out.println("静态内部类模式耗时: " + (System.currentTimeMillis() - startTime));
//
//        // 测试双重检锁模式的性能
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            Thread thread = new Thread(() -> {
//                DoubleCheckLockMode instance = DoubleCheckLockMode.getInstance();
//                System.out.println(Thread.currentThread().getName() + "\t" + instance);
//            });
//            thread.setName("DoubleCheckLock" + i);
//            thread.start();
//        }
//        System.out.println("双重检锁模式耗时: " + (System.currentTimeMillis() - startTime));
//
//        // 测试CAS模式的性能
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < 50; i++) {
//            Thread thread = new Thread(() -> {
//                CasMode instance = CasMode.getInstance();
//                System.out.println(Thread.currentThread().getName() + "\t" + instance);
//            });
//            thread.setName("Cas" + i);
//            thread.start();
//        }
//        System.out.println("CAS模式耗时: " + (System.currentTimeMillis() - startTime));
    }
}
