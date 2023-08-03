package com.github.stazxr.gof23.行为型.对象行为.职责链;

public class Client {
    public static void main(String[] args) {
        // 创建各个节点（需要客户端做）
        Node1 node1 = new Node1();
        Node2 node2 = new Node2();
        Node3 node3 = new Node3();

        // 设置请求链（需要客户端做）
        node1.setNextHandle(node2);
        node2.setNextHandle(node3);

        // 创建请假请求对象
        RestRequest request = new RestRequest("张三", 3, "病假");

        // 提交请假请求
        node1.submit(request);
    }
}
