package com.github.stazxr.gof23.原型.深克隆;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Client2 {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setName("张三");

        Citation citation1 = new Citation();
        citation1.setStudent(student);

        // 写
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("D:\\a.txt")));
        oos.writeObject(citation1);
        oos.close();

        // 读
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("D:\\a.txt")));
        Citation citation2 = (Citation) ois.readObject();
        citation2.getStudent().setName("李四");
        ois.close();

        citation1.show();
        citation2.show();

        /* 输出：
         * 张三同学：获得三好学生奖状
         * 李四同学：获得三好学生奖状
         */
    }
}
