package com.github.stazxr.gof23.行为型.类行为.模板方法;

public class CookBaoCai extends Cook {
    @Override
    public void pourVege() {
        System.out.println("包菜搞里头");
    }

    @Override
    public void pourSauce() {
        System.out.println("辣椒搞里头");
    }
}
