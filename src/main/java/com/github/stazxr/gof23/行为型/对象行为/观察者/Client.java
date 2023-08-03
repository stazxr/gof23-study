package com.github.stazxr.gof23.行为型.对象行为.观察者;

public class Client {
    public static void main(String[] args) {
        Subject subject = new WxSubject();
        subject.attach(new WxObserver("张三"));
        subject.attach(new WxObserver("李四"));
        WxObserver wangWu = new WxObserver("王五");
        subject.attach(wangWu);
        subject.notice("一则消息");

        System.out.println("=========");
        subject.detach(wangWu);
        subject.notice("新消息");
    }
}
