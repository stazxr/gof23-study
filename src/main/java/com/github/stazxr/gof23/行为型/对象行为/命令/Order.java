package com.github.stazxr.gof23.行为型.对象行为.命令;

import java.util.HashMap;
import java.util.Map;

public class Order {
    // 餐桌号
    private int tableNum;

    // 订单内容
    private final Map<String, Integer> foodMenu = new HashMap<>();

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public Map<String, Integer> getFoodMenu() {
        return foodMenu;
    }

    public void addFoodMenu(String name, Integer value) {
        foodMenu.put(name, value);
    }
}
