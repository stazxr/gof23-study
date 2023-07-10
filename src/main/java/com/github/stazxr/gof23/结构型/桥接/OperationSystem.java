package com.github.stazxr.gof23.结构型.桥接;

public abstract class OperationSystem {
    // 引用实例化角色的对象
    protected final VideoFile videoFile;

    public OperationSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    // 业务方法，播放 Video
    public abstract void playVideo(String filename);
}
