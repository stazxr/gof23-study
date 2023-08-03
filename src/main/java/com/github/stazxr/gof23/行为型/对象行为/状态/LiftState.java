package com.github.stazxr.gof23.行为型.对象行为.状态;

public abstract class LiftState {
    // 声明环境角色类变量
    protected LiftContext liftContext;

    public void setLiftContext(LiftContext liftContext) {
        this.liftContext = liftContext;
    }

    // 电梯启动
    public abstract void on();

    // 电梯停止
    public abstract void off();

    // 电梯开门
    public abstract void open();

    // 电梯关门
    public abstract void close();
}
