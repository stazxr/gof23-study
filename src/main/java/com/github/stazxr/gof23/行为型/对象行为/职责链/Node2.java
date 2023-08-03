package com.github.stazxr.gof23.行为型.对象行为.职责链;

public class Node2 extends RestHandle {
    public Node2() {
        super(LEVEL_1, LEVEL_2);
    }

    @Override
    protected void handleRestEvent(RestRequest request) {
        System.out.println(request.getName()+ "请假" + request.getDays() + "天，" + request.getDesc() + "。");
        System.out.println("项目经理审批同意");
    }
}
