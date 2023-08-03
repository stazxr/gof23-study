package com.github.stazxr.gof23.行为型.对象行为.状态;

public class OpenState extends LiftState {
    @Override
    public void on() {
        throw new RuntimeException("电梯没关门，无法运行...");
    }

    @Override
    public void off() {
        // 只有运行中的电梯才可以停止
    }

    @Override
    public void open() {
        System.out.println("电梯门打开...");
    }

    @Override
    public void close() {
        // 电梯开门状态可关门
        super.liftContext.setCurrentState(LiftContext.CLOSE_STATE);
        super.liftContext.close();
    }
}
