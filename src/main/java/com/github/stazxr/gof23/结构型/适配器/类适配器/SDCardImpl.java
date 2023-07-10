package com.github.stazxr.gof23.结构型.适配器.类适配器;

public class SDCardImpl implements SDCard {
    String data = null;

    @Override
    public String readSD() {
        System.out.println("从 SD 卡读取数据");
        return data;
    }

    @Override
    public void writeSD(String data) {
        System.out.println("往 SD 卡写入数据");
        this.data = data;
    }
}
