package com.github.stazxr.gof23.行为型.对象行为.职责链;

public class Node3 extends RestHandle {
    public Node3() {
        super(LEVEL_2, LEVEL_3);
    }

    @Override
    protected void handleRestEvent(RestRequest request) {
        System.out.println(request.getName()+ "请假" + request.getDays() + "天，" + request.getDesc() + "。");
        System.out.println("部门领导审批同意");
    }
}
