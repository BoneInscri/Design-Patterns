package org.hdbone.adapter;

// 电脑客户端
public class Computer {
    public void net(Adapter adapter)
    {
        // 需要一个转接头
        adapter.handleRequest();
    }
    public void net(Adapter2 adapter2)
    {
        adapter2.handleRequest();
    }

    public static void main(String[] args) {
        // 电脑 , 网线 , 适配器
        Computer computer=new Computer();
        EthernetCable ethernetCable=new EthernetCable();
        Adapter adapter=new Adapter();
        computer.net(adapter);

        // 真正的适配器
        // (不仅需要和网线相连 , 还要和电脑相连)
        Adapter2 adapter2=new Adapter2(ethernetCable);
        computer.net(adapter2);

    }
}
