package com.github.stazxr.gof23.行为型.对象行为.命令;

import java.util.ArrayList;
import java.util.List;

public class OrderInvoker {
    // 持有命令对象（一对多）
    private final List<Command> commandList = new ArrayList<>();

    public void appendCommand(Command command) {
        commandList.add(command);
    }

    // 发起命令
    public void invoker() {
        System.out.println("服务员：后厨来订单了");
        for (Command command : commandList) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
