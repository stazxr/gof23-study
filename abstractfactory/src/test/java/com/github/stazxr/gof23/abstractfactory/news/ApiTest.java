package com.github.stazxr.gof23.abstractfactory.news;

import com.github.stazxr.gof23.abstractfactory.news.factory.JDKProxy;
import com.github.stazxr.gof23.abstractfactory.news.factory.impl.EGMCacheAdapter;
import com.github.stazxr.gof23.abstractfactory.news.factory.impl.IIRCacheAdapter;
import com.github.stazxr.gof23.abstractfactory.news.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * 在测试的代码中通过传⼊不同的集群类型，就可以调⽤不同的集群下的⽅法。
 * JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter())
 *
 * 如果后续有扩展的需求，也可以按照这样的类型⽅式进⾏补充，同时对于改造上来说并没有改动原
 * 来的⽅法，降低了修改成本
 */
public class ApiTest {
    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);
    }
}
