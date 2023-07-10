package com.github.stazxr.gof23.创建型.单例;

import java.io.IOException;
import java.io.InputStream;

public class Demo10 {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ipconfig");
        InputStream inputStream = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        int len = inputStream.read(arr); // 返回读到的字节的个数
        System.out.println(len);
        System.out.println(new String(arr, 0, len, "GBK"));
    }
}
