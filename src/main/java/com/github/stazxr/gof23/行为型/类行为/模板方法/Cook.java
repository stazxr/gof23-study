package com.github.stazxr.gof23.行为型.类行为.模板方法;

public abstract class Cook {
    // 模板方法
    public final void cookProcess() {
        // 第一步：倒油
        this.pourOil();
        // 第二步：热油
        this.heatOil();
        // 第三步：倒蔬菜
        this.pourVege();
        // 第四步：倒调料味
        this.pourSauce();
        // 第五步：翻炒
        this.fry();
    }

    // 以下为基本方法
    public void pourOil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }

    public abstract void pourVege();

    public abstract void pourSauce();

    public void fry() {
        System.out.println("翻炒");
    }
}
