package com.github.stazxr.gof23.工厂.扩展;

import com.github.stazxr.gof23.temp.Coffee;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class CoffeeFactory {
    private static final Map<String, Coffee> coffeeMap = new HashMap<>();

    static {
        Properties properties = new Properties();
        try (InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties")) {
            // 加载配置文件
            properties.load(is);

            // 遍历 Key
            for (Object key : properties.keySet()) {
                // 类名
                String className = properties.getProperty((String) key);

                Class<?> clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                coffeeMap.put((String) key, coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException("加载工厂类失败", e);
        }
    }

    /**
     * 创建咖啡对象
     *
     * @return Coffee
     */
    public static Coffee createCoffee(String name) {
        return coffeeMap.get(name);
    }
}
