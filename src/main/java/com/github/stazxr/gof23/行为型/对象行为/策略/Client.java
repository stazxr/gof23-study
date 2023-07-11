package com.github.stazxr.gof23.行为型.对象行为.策略;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new StrategyB());
        context.show();
    }
}
