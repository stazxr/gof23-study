package com.github.stazxr.gof23.行为型.类行为.解释器;

import java.util.HashMap;
import java.util.Map;

public class Context {
    // 存储变量及对应的值
    private final Map<Variable, Integer> variables = new HashMap<>();

    public void assign(Variable var, Integer value) {
        variables.put(var, value);
    }

    public int getValue(Variable var) {
        return variables.get(var);
    }
}
