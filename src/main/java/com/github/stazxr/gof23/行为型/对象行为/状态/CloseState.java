package com.github.stazxr.gof23.行为型.对象行为.状态;

public class CloseState extends LiftState {
    @Override
    public void on() {
        // 电梯关门状态可启动
        super.liftContext.setCurrentState(LiftContext.ON_STATE);
        super.liftContext.on();
    }

    @Override
    public void off() {
        // 只有运行中的电梯才可以停止
    }

    @Override
    public void open() {
        // 只有停止的电梯才可以开门
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }
}
