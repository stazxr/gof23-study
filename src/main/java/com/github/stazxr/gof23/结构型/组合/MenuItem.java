package com.github.stazxr.gof23.结构型.组合;

public class MenuItem extends MenuRoot {
    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }

        System.out.println(name);
    }
}
