package com.github.stazxr.gof23.行为型.类行为.解释器;

public class Variable implements AbstractExpression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
