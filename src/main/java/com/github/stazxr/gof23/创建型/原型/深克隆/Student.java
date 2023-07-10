package com.github.stazxr.gof23.创建型.原型.深克隆;

import java.io.Serializable;

public class Student implements Serializable {
    // 学生姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
