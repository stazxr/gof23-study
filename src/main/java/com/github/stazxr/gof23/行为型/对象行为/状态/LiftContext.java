package com.github.stazxr.gof23.行为型.对象行为.状态;

public class LiftContext {
    // 定义对应状态对象的常量
    public static final OpenState OPEN_STATE = new OpenState();
    public static final CloseState CLOSE_STATE = new CloseState();
    public static final OnState ON_STATE = new OnState();
    public static final OffState OFF_STATE = new OffState();

    // 当前状态变量
    private LiftState currentState;

    public LiftState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(LiftState currentState) {
        this.currentState = currentState;

        // 重点：设置当前状态对象的 Context 对象
        this.currentState.setLiftContext(this);
    }

    public void on() {
        this.currentState.on();
    }

    public void off() {
        this.currentState.off();
    }

    public void open() {
        this.currentState.open();
    }

    public void close() {
        this.currentState.close();
    }
}
