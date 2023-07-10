package com.github.stazxr.gof23.结构型.代理.动态代理.JDK代理;

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站出票");
    }
}
