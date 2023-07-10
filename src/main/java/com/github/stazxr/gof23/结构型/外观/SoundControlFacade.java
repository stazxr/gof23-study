package com.github.stazxr.gof23.结构型.外观;

public class SoundControlFacade {
    // 聚合子系统角色
    private final Light light;
    private final TV tv;
    private final AirConditioner airConditioner;

    public SoundControlFacade() {
        light = new Light();
        tv = new TV();
        airConditioner = new AirConditioner();
    }

    // 提供一个公共接口供外部访问
    public void say(String message) {
        if (message.contains("打开")) {
            oneKeyOn();
        } else if (message.contains("关闭")) {
            oneKeyOff();
        } else {
            System.out.println("听不懂你在说什么");
        }
    }

    private void oneKeyOn() {
        light.on();
        tv.on();
        airConditioner.on();
    }

    private void oneKeyOff() {
        light.off();
        tv.off();
        airConditioner.off();
    }
}
