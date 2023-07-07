package com.github.stazxr.gof23.装饰者;

// 配料
public abstract class Garnish extends FastFood {
    // 声明快餐类的实例
    private FastFood fastFood;

    public Garnish(FastFood fastFood, String desc, float price) {
        super(desc, price);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
