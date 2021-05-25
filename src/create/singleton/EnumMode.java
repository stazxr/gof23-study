package create.singleton;

/**
 * 枚举模式（线程安全）
 *
 * 缺点
 *   存在继承的模式是不可以用的
 *
 * 解决了线程安全，自由串行化，单一实例，绝对防止了实例化，其他还可以通过反射进行实例化
 */
public enum EnumMode {
    INSTANCE;

    public void getInstance() {
        System.out.println("do...");
    }
}
