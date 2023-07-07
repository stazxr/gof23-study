package com.github.stazxr.gof23.适配器.类适配器;

public class Client {
    public static void main(String[] args) {
        // 创建计算机对象
        Compute compute = new Compute();
        // 创建 SDCard 对象
        SDCard sdCard = new SDCardImpl();

        // 从 SDCard 读写数据
        compute.writeSD(sdCard, "HELLO SDCARD!!!");
        String sdData = compute.readSD(sdCard);
        System.out.println("SD: " + sdData);

        // 从 TFCard 读写数据
        System.out.println("=============");
        TFToSDAdapter adapter = new TFToSDAdapter();
        compute.writeSD(adapter, "HELLO TFCARD!!!");
        String tfData = compute.readSD(adapter);
        System.out.println("TF: " + tfData);
    }
}
