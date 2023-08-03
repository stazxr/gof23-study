package com.github.stazxr.gof23.行为型.对象行为.备忘录.白箱;

import java.util.HashMap;
import java.util.Map;

public class RoleStateCaretaker {
    private final Map<Integer, RoleStateMemento> mementoMap = new HashMap<>();

    public void saveMemento(RoleStateMemento memento) {
        mementoMap.put(memento.getVersion(), memento);
    }

    public RoleStateMemento getMemento(int version) {
        return mementoMap.get(version);
    }
}
