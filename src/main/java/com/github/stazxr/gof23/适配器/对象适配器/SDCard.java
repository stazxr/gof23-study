package com.github.stazxr.gof23.适配器.对象适配器;

public interface SDCard {
    // 读
    String readSD();

    // 写
    void writeSD(String data);
}
