package com.github.stazxr.gof23.行为型.对象行为.命令;

public class OrderCommand implements Command {
    // 业务对象
    private final Order order;

    // 持有接收者对象
    private final OrderReceiver orderReceiver;

    public OrderCommand(Order order, OrderReceiver orderReceiver) {
        this.order = order;
        this.orderReceiver = orderReceiver;
    }

    @Override
    public void execute() {
        System.out.println("桌号：" + order.getTableNum());
        for (String foodName : order.getFoodMenu().keySet()) {
            orderReceiver.makeFood(foodName, order.getFoodMenu().get(foodName));
        }

        System.out.println(order.getTableNum() + "桌食物制作完成");
    }
}
