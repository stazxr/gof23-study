package com.github.stazxr.gof23.结构型.装饰者.扩展;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\a.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello");
        bufferedWriter.close();
    }
}
