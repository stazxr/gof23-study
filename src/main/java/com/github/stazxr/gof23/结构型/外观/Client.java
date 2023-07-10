package com.github.stazxr.gof23.结构型.外观;

public class Client {
    public static void main(String[] args) {
        // 创建外观角色
        SoundControlFacade facade = new SoundControlFacade();

        // 调用公共方法
        facade.say("打开家电");
        System.out.println("===========");
        facade.say("关闭家电");
    }
}
