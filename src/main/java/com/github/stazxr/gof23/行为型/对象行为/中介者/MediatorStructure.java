package com.github.stazxr.gof23.行为型.对象行为.中介者;

public class MediatorStructure extends Mediator {
    // 聚合具体交互者对象
    private HouseOwner owner;

    private Tenant tenant;

    public HouseOwner getOwner() {
        return owner;
    }

    public void setOwner(HouseOwner owner) {
        this.owner = owner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, Person person) {
        if (person == owner) {
             tenant.getMessage(message);
        }

        if (person == tenant) {
            owner.getMessage(message);
        }
    }
}
