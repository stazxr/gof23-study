package com.github.stazxr.gof23.行为型.对象行为.状态;

public class Client {
    public static void main(String[] args) {
        LiftContext context = new LiftContext();
        context.setCurrentState(new OnState());

        context.off();
        context.open();
        context.close();
        context.on();
        context.open();
    }
}
