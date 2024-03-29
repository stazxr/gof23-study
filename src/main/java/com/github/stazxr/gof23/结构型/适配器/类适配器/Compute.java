package com.github.stazxr.gof23.结构型.适配器.类适配器;

public class Compute {
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new RuntimeException("SDCard不存在");
        }

        return sdCard.readSD();
    }

    public void writeSD(SDCard sdCard, String data) {
        if (sdCard == null) {
            throw new RuntimeException("SDCard不存在");
        }

        sdCard.writeSD(data);
    }
}
