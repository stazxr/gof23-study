package com.github.stazxr.gof23.结构型.代理.动态代理.CGLIB代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    // 声明目标对象
    private final TrainStation station = new TrainStation();

    // 获取代理对象的方法
    public TrainStation getProxyObject() {
        // 创建 Enhancer 对象，类似于 JDK 代理中的 Proxy
        Enhancer enhancer = new Enhancer();

        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);

        // 设置回调函数
        enhancer.setCallback(this);

        // 创建代理对象
        return (TrainStation) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理商收取中间费");
        return method.invoke(station, objects);
    }
}
