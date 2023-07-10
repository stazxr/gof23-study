package com.github.stazxr.gof23.结构型.桥接;

public class Windows extends OperationSystem {
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void playVideo(String filename) {
        System.out.println("Windows 系统播放");
        videoFile.decode(filename);
    }
}
