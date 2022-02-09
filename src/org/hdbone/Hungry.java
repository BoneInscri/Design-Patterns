package org.hdbone;

// 饿汉式
// 可能浪费资源
// 直接就加载了这个类
public class Hungry {

    private Hungry()
    {

    }
    private final static Hungry HUNGRY=new Hungry();

    public static Hungry getInstance()
    {
        return HUNGRY;
    }

}
