package com.github.stazxr.gof23.创建型.工厂.抽象工厂;

public interface AbstractFactory {
    /**
     * 创建咖啡对象
     *
     * @return Coffee
     */
    Coffee createCoffee();

    /**
     * 创建甜点对象
     *
     * @return Dessert
     */
    Dessert createDessert();
}
