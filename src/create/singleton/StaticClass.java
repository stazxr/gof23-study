package create.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态类使用
 *
 * 静态类的方法可以在项目启动的时候直接初始化Map
 * 在不需要维持任何状态下，仅仅用于全局访问，这里使用静态类的方式更加方便
 * 但如果需要被继承或维持一些特殊状态的情况下，就适合使用单例模式
 */
public class StaticClass {
    /**
     * 项目被启动就会被初始化
     */
    public static Map<String, String> cache = new ConcurrentHashMap<>();

    static {
        cache.put("系统预置数据", "Test");
    }
}
