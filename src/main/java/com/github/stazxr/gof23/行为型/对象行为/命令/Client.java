package com.github.stazxr.gof23.行为型.对象行为.命令;

public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setTableNum(1);
        order1.addFoodMenu("西红柿鸡蛋面", 1);
        order1.addFoodMenu("冰峰", 1);

        Order order2 = new Order();
        order2.setTableNum(2);
        order2.addFoodMenu("牛肉拉面", 2);

        OrderReceiver receiver = new OrderReceiver();
        Command command1 = new OrderCommand(order1, receiver);
        Command command2 = new OrderCommand(order2, receiver);

        OrderInvoker invoker = new OrderInvoker();
        invoker.appendCommand(command1);
        invoker.appendCommand(command2);

        invoker.invoker();
    }
}
