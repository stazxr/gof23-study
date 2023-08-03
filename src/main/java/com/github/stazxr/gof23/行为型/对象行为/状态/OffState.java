package com.github.stazxr.gof23.行为型.对象行为.状态;

public class OffState extends LiftState {
    @Override
    public void on() {
        // 电梯停止状态可运行
        super.liftContext.setCurrentState(LiftContext.ON_STATE);
        super.liftContext.on();
    }

    @Override
    public void off() {
        System.out.println("电梯停止运行...");
    }

    @Override
    public void open() {
        // 电梯停止状态可开门
        super.liftContext.setCurrentState(LiftContext.OPEN_STATE);
        super.liftContext.open();
    }

    @Override
    public void close() {
        // 电梯停止状态可关门
        super.liftContext.setCurrentState(LiftContext.CLOSE_STATE);
        super.liftContext.close();
    }
}
