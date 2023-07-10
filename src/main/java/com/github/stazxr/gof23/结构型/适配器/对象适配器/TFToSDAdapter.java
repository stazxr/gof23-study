package com.github.stazxr.gof23.结构型.适配器.对象适配器;

public class TFToSDAdapter implements SDCard {
    private final TFCard tfCard;

    public TFToSDAdapter(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("适配器读取 TF 数据");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("适配器写入 TF 数据");
        tfCard.writeTF(data);
    }
}
