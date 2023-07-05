package com.github.stazxr.gof23.单例;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo9 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取字节码对象、获取构造方法
        Class<Demo6> clazz = Demo6.class;
        Constructor<Demo6> declaredConstructor = clazz.getDeclaredConstructor();

        // 取消访问检查
        declaredConstructor.setAccessible(true);

        Demo6 demo1 = declaredConstructor.newInstance();
        Demo6 demo2 = declaredConstructor.newInstance();
        System.out.println(demo1);
        System.out.println(demo2);
    }
}


