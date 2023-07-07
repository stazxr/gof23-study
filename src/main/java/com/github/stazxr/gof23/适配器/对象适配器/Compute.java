package com.github.stazxr.gof23.适配器.对象适配器;

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
