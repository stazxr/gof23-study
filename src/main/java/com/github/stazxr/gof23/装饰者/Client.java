package com.github.stazxr.gof23.装饰者;

public class Client {
    public static void main(String[] args) {
        FastFood food = new FiredRice();
        System.out.println(food.getDesc().concat(":").concat(String.valueOf(food.cost())).concat("元"));

        // 加鸡蛋
        System.out.println("===========");
        food = new Egg(food);
        System.out.println(food.getDesc().concat(":").concat(String.valueOf(food.cost())).concat("元"));

        // 加培根
        System.out.println("===========");
        food = new Bacon(food);
        System.out.println(food.getDesc().concat(":").concat(String.valueOf(food.cost())).concat("元"));
    }
}
