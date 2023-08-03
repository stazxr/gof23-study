package com.github.stazxr.gof23.行为型.对象行为.职责链;

public class Node1 extends RestHandle {
    public Node1() {
        super(0, LEVEL_1);
    }

    @Override
    protected void handleRestEvent(RestRequest request) {
        System.out.println(request.getName()+ "请假" + request.getDays() + "天，" + request.getDesc() + "。");
        System.out.println("小组长审批同意");
    }
}
