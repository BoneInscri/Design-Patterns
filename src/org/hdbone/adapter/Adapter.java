package org.hdbone.adapter;

// 适配器
// 如果是 extend 继承就类似于无线网卡
/*
* 1 继承 : 类适配器, 单继承
* 2 组合 : 对象适配器, 常用
* */
public class Adapter extends EthernetCable implements NetToUsb{


    @Override
    public void handleRequest() {
        super.request();// 调用父类的方法即可上网
    }
}

