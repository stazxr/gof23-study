package com.github.stazxr.gof23.原型.深克隆;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {
    // 获奖学生
    private Student student;

    public Citation() {
        System.out.println("具体原型类创建成功");
    }

    public void show() {
        System.out.println(student.getName() + "同学：获得三好学生奖状");
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
