package com.github.stazxr.gof23.行为型.对象行为.状态;

public class OnState extends LiftState {
    @Override
    public void on() {
        System.out.println("电梯开始运行...");
    }

    @Override
    public void off() {
        // 电梯运行状态可停止
        super.liftContext.setCurrentState(LiftContext.OFF_STATE);
        super.liftContext.off();
    }

    @Override
    public void open() {
        // no do
    }

    @Override
    public void close() {
        // no do
    }
}
