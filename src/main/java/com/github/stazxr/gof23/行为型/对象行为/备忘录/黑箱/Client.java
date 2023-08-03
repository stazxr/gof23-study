package com.github.stazxr.gof23.行为型.对象行为.备忘录.黑箱;

public class Client {
    public static void main(String[] args) {
        System.out.println("=======大战Boss前=======");
        // 创建游戏角色对象，并初始化值
        GameRole gameRole = new GameRole();
        gameRole.showState();

        // 创建管理者对象
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(gameRole.saveState());
        System.out.println("=======大战Boss后=======");
        gameRole.fight();
        gameRole.showState();
        System.out.println("=======恢复之前的状态=======");
        gameRole.restoreState(caretaker.getMemento());
        gameRole.showState();
    }
}
