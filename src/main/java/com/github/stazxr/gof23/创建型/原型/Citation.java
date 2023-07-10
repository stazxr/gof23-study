package com.github.stazxr.gof23.创建型.原型;

public class Citation implements Cloneable {
    // 获奖学生姓名
    private String name;

    public Citation() {
        System.out.println("具体原型类创建成功");
    }

    public void show() {
        System.out.println(name + "同学：获得三好学生奖状");
    }

    @Override
    public Citation clone() {
        try {
            System.out.println("具体原型克隆成功");
            return (Citation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
