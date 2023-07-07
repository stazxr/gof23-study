package com.github.stazxr.gof23.适配器.类适配器;

public class TFToSDAdapter extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("适配器读取 TF 数据");
        return readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("适配器写入 TF 数据");
        writeTF(data);
    }
}
