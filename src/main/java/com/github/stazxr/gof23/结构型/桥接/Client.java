package com.github.stazxr.gof23.结构型.桥接;

public class Client {
    public static void main(String[] args) {
        Mp4VideoFile mp4VideoFile = new Mp4VideoFile();
        OperationSystem os = new Windows(mp4VideoFile);
        os.playVideo("CCTV1");
    }
}
