package com.github.stazxr.gof23.行为型.类行为.模板方法;

public class CookCaiXin extends Cook {
    @Override
    public void pourVege() {
        System.out.println("菜心搞里头");
    }

    @Override
    public void pourSauce() {
        System.out.println("蒜蓉搞里头");
    }
}
