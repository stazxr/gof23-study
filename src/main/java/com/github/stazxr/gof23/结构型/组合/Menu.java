package com.github.stazxr.gof23.结构型.组合;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuRoot {
    private final List<MenuRoot> childMenu = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addMenu(MenuRoot menu) {
        childMenu.add(menu);
    }

    @Override
    public void removeMenu(MenuRoot menu) {
        childMenu.add(menu);
    }

    @Override
    public MenuRoot getChild(int index) {
        return childMenu.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }

        System.out.println(this);
        for (MenuRoot menu : childMenu) {
            menu.print();
        }
    }
}
