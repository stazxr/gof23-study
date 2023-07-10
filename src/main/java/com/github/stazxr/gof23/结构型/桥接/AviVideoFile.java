package com.github.stazxr.gof23.结构型.桥接;

public class AviVideoFile implements VideoFile {
    @Override
    public void decode(String filename) {
        System.out.println("AVI 解吗：" + filename);
    }
}
