package com.github.stazxr.gof23.行为型.类行为.解释器;

public class Minus implements AbstractExpression {
    // - 号左边的表达式
    private final AbstractExpression left;

    // - 号右边的表达式
    private final AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left + " - " + right + ")";
    }
}
