package com.github.stazxr.gof23.行为型.对象行为.中介者;

public class Client {
    public static void main(String[] args) {
        // 创建中介者对象
        MediatorStructure mediator = new MediatorStructure();

        // 创建交互者对象：租客
        Tenant tenant = new Tenant("张三", mediator);

        // 创建交互者对象：房东
        HouseOwner houseOwner = new HouseOwner("李四", mediator);

        // 中介者需要知道具体的交互者对象
        mediator.setTenant(tenant);
        mediator.setOwner(houseOwner);

        // 交互
        tenant.contact("需要组一个三室一厅");
        houseOwner.contact("我这里有房源，可以来看房吗？");
    }
}
