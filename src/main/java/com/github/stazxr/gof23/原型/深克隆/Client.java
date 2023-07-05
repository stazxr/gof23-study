package com.github.stazxr.gof23.原型.深克隆;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");

        Citation realizeType = new Citation();
        realizeType.setStudent(student);
        Citation clone = realizeType.clone();
        clone.getStudent().setName("李四");

        realizeType.show();
        clone.show();

        /* 输出：
         * 具体原型类创建成功
         * 具体原型克隆成功
         * 李四同学：获得三好学生奖状
         * 李四同学：获得三好学生奖状
         */
    }
}
