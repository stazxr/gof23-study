package com.github.stazxr.gof23.适配器.对象适配器;

public class TFCardImpl implements TFCard {
    String data = null;

    @Override
    public String readTF() {
        System.out.println("从 TF 卡读取数据");
        return data;
    }

    @Override
    public void writeTF(String data) {
        System.out.println("往 TF 卡写入数据");
        this.data = data;
    }
}
