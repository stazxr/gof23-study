package com.github.stazxr.gof23.结构型.代理.动态代理.JDK代理;

public class Client {
    public static void main(String[] args) {
        // 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        // 使用代理对象调用代理方法
        proxyObject.sell();
    }
}
