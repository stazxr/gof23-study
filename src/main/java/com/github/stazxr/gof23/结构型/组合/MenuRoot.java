package com.github.stazxr.gof23.结构型.组合;

public abstract class MenuRoot {
    // 菜单名称
    protected String name;
    // 菜单层级
    protected int level;

    public void addMenu(MenuRoot menu) {
        throw new UnsupportedOperationException();
    }

    public void removeMenu(MenuRoot menu) {
        throw new UnsupportedOperationException();
    }

    public MenuRoot getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract void print();

    @Override
    public String toString() {
        return name;
    }
}
