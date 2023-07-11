package com.github.stazxr.gof23.结构型.享元;

import java.util.HashMap;
import java.util.Map;

public class BoxFactory {
    private static final Map<String, AbstractBox> boxMap;

    static {
        boxMap = new HashMap<>();
        boxMap.put("I", new IBox());
        boxMap.put("L", new LBox());
        boxMap.put("O", new OBox());
    }

    private BoxFactory() {
    }

    public static AbstractBox getBox(String shape) {
        return boxMap.get(shape);
    }
}
