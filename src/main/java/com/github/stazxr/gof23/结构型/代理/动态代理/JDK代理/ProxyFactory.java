package com.github.stazxr.gof23.结构型.代理.动态代理.JDK代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    // 声明目标对象
    private final TrainStation station = new TrainStation();

    // 获取代理对象的方法
    public SellTickets getProxyObject() {
        // 返回代理对象
        /*
          ClassLoader loader：类加载器，用于加载代理类，可以通过目标对象获取类加载器
          Class<?>[] interfaces：代理类实现的字节码对象
          InvocationHandler h：代理对象的调用处理程序
         */
        return (SellTickets) Proxy.newProxyInstance(
            station.getClass().getClassLoader(),
            station.getClass().getInterfaces(),
            new InvocationHandler() {
                /*
                  proxy：代理对象，与本方法生成的代理对象是同一个对象
                  method：代理方法（代理对象调用的方法）
                  args：调用代理方法的实际参数
                  返回值：代理方法的返回值
                 */
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    // 代理业务逻辑
                    System.out.println("收取中介费用");
                    return method.invoke(station, args);
                }
            }
        );
    }
}
