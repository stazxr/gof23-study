package com.github.stazxr.gof23.行为型.对象行为.访问者;

public class Dog implements Animal {
    @Override
    public void accept(Person person) {
        // 接受访问者方法的具体实现，使用访问者提供的访问该元素类的方法
        person.feed(this);
        System.out.println("汪汪汪~~~");
    }

    @Override
    public String toString() {
        return "狗";
    }
}
