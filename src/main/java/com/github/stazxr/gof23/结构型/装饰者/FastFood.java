package com.github.stazxr.gof23.结构型.装饰者;

// 抽象构件角色
public abstract class FastFood {
    // 描述
    private String desc;

    // 价格
    private float price;

    public FastFood() {
    }

    public FastFood(String desc, float price) {
        this.desc = desc;
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // 总价
    public abstract float cost();
}
