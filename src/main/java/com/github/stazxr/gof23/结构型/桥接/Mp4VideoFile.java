package com.github.stazxr.gof23.结构型.桥接;

public class Mp4VideoFile implements VideoFile {
    @Override
    public void decode(String filename) {
        System.out.println("MP4 解吗：" + filename);
    }
}
