package com.github.stazxr.gof23.行为型.对象行为.备忘录.黑箱;

public class GameRole {
    private int vit; // 生命力
    private int atk; // 攻击力
    private int def; // 防御力

    public GameRole() {
        initData();
    }

    // 初始化数据
    private void initData() {
        vit = 100;
        atk = 100;
        def = 100;
    }

    // 战斗
    public void fight() {
        vit = vit - 10;
    }

    // 保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    // 恢复角色状态
    public void restoreState(Memento memento) {
        RoleStateMemento stateMemento = (RoleStateMemento) memento;
        // 将备忘录中存储的对象状态赋值给当前对象
        vit = stateMemento.getVit();
        atk = stateMemento.getAtk();
        def = stateMemento.getDef();
    }

    public void showState() {
        System.out.println("===>角色信息：");
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

    private static class RoleStateMemento implements Memento {
        private int vit; // 生命力
        private int atk; // 攻击力
        private int def; // 防御力

        public RoleStateMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }

        public RoleStateMemento() {
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
    }
}
