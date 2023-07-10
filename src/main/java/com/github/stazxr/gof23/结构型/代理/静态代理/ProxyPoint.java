package com.github.stazxr.gof23.结构型.代理.静态代理;

public class ProxyPoint implements SellTickets {
    private final TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("从代售点买票，收取服务费");
        trainStation.sell();
    }
}
