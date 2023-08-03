package com.github.stazxr.gof23.行为型.对象行为.备忘录.黑箱;

public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
