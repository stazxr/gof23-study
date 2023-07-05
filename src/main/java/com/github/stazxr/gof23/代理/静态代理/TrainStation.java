package com.github.stazxr.gof23.代理.静态代理;

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站出票");
    }
}
