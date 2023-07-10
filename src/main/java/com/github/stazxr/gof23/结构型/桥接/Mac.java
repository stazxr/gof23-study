package com.github.stazxr.gof23.结构型.桥接;

public class Mac extends OperationSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void playVideo(String filename) {
        System.out.println("Mac 系统播放");
        videoFile.decode(filename);
    }
}
