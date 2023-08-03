package com.github.stazxr.gof23.行为型.对象行为.备忘录.白箱;

public class RoleStateMemento {
    private int vit; // 生命力
    private int atk; // 攻击力
    private int def; // 防御力

    private int version; // 版本

    public RoleStateMemento() {
    }

    public RoleStateMemento(int vit, int atk, int def, int version) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
        this.version = version;
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
