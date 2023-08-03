package com.github.stazxr.gof23.行为型.对象行为.职责链;

public abstract class RestHandle {
    protected static final int LEVEL_1 = 1;
    protected static final int LEVEL_2 = 3;
    protected static final int LEVEL_3 = 7;

    private int numberStart;
    private int numberEnd;

    // 后继者
    private RestHandle nextHandle;

    public RestHandle(int numberStart) {
        this.numberStart = numberStart;
    }

    public RestHandle(int numberStart, int numberEnd) {
        this.numberStart = numberStart;
        this.numberEnd = numberEnd;
    }

    public void setNextHandle(RestHandle nextHandle) {
        this.nextHandle = nextHandle;
    }

    // 处理请假请求的方法
    protected abstract void handleRestEvent(RestRequest request);

    // 提交请假请求的方法
    public final void submit(RestRequest request) {
        this.handleRestEvent(request);

        if (this.nextHandle != null && request.getDays() > this.numberEnd) {
            // 后续节点处理
            this.nextHandle.submit(request);
        } else {
            System.out.println("流程结束！");
        }
    }
}
