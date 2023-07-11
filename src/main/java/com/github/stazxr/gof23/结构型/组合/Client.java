package com.github.stazxr.gof23.结构型.组合;

public class Client {
    public static void main(String[] args) {
        // root
        MenuRoot root = new Menu("系统管理", 1);

        // menu
        MenuRoot root1 = new Menu("用户管理", 2);
        MenuRoot root2 = new Menu("角色管理", 2);
        MenuRoot root3 = new Menu("权限管理", 2);
        root.addMenu(root1);
        root.addMenu(root2);
        root.addMenu(root3);

        // item
        root1.addMenu(new MenuItem("新增用户", 3));

        // print
        root.print();
    }
}
