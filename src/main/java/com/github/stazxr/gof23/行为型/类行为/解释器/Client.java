package com.github.stazxr.gof23.行为型.类行为.解释器;

public class Client {
    public static void main(String[] args) {
        // 创建环境对象
        Context context = new Context();

        // 创建变量对象
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        // 将变量存储到环境对象中
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);

        // 获取抽象语法树  a + b + c - d
        AbstractExpression expression = new Minus(new Plus(new Plus(a, b), c), d);

        // 解释语法树（计算结果）
        int result = expression.interpret(context);
        System.out.println(expression + " = " + result);
    }
}
