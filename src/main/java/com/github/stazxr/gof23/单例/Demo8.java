package com.github.stazxr.gof23.单例;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo8 implements Serializable {
    public static void main(String[] args) throws Exception {
        writeObjectToFile();
        readObjectFromFile();
        readObjectFromFile();
        /*  执行结果：发现反序列化后不是同一个对象
            com.github.stazxr.gof23.com.github.stazxr.gof23.单例.Demo4@723279cf
            com.github.stazxr.gof23.com.github.stazxr.gof23.单例.Demo4@10f87f48
        * */
    }

    private static void writeObjectToFile() throws Exception {
        Demo6 instance = Demo6.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("D:\\c.txt")));
        oos.writeObject(instance);
        oos.close();
    }

    private static void readObjectFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("D:\\c.txt")));
        Demo6 instance = (Demo6) ois.readObject();
        System.out.println(instance);
        ois.close();
    }
}
