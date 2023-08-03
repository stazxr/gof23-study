package com.github.stazxr.gof23.行为型.对象行为.备忘录.白箱;

public class GameRole {
    private int vit; // 生命力
    private int atk; // 攻击力
    private int def; // 防御力

    private int version; // 版本

    public GameRole() {
        initData();
    }

    // 初始化数据
    private void initData() {
        vit = 100;
        atk = 100;
        def = 100;
        version = 1;
    }

    // 战斗
    public void fight() {
        vit = vit - 10;
    }

    // 保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def, version++);
    }

    // 恢复角色状态
    public void restoreState(RoleStateMemento memento) {
        // 将备忘录中存储的对象状态赋值给当前对象
        vit = memento.getVit();
        atk = memento.getAtk();
        def = memento.getDef();
        version = memento.getVersion();
    }

    public void showState() {
        System.out.println("===>版本信息：" + version);
        System.out.println("角色生命力：" + vit);
        System.out.println("角色攻击力：" + atk);
        System.out.println("角色防御力：" + def);
        System.out.println("<===");
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
