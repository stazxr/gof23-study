package com.github.stazxr.gof23.abstractfactory.news.factory;

import com.github.stazxr.gof23.abstractfactory.news.util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 在代理类的实现中其实也⾮常简单，通过穿透进来的集群服务进⾏⽅法操作。
 *
 * 另外在 invoke 中通过使⽤获取⽅法名称反射⽅式，调⽤对应的⽅法功能，也就简化了整体的使⽤
 *
 * 到这我们就已经将整体的功能实现完成了，关于抽象⼯⼚这部分也可以使⽤⾮代理的⽅式进⾏实现。
 */
public class JDKInvocationHandler implements InvocationHandler {
    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
    }
}
