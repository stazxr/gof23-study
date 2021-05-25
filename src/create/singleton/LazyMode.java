package create.singleton;

/**
 * 懒汉模式（线程不安全）
 *
 * 有一个私有的成员变量实例
 * 私有化构造器，不允许外部创建
 * 提供公共访问接口，getInstance()，获取对象实例
 */
public class LazyMode {
    private static LazyMode instance;

    private LazyMode() {
    }

    public static LazyMode getInstance() {
        if (instance != null) {
            System.out.println("【懒汉模式】对象已存在");
            return instance;
        }

        System.out.println("【懒汉模式】第一次加载，创建实例");
        instance = new LazyMode();
        return instance;
    }
}
