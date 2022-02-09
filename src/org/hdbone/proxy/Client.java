package org.hdbone.proxy;

public class Client {
    public static void main(String[] args) {
        Landlord landlord=new Landlord();
        // 代理 (中介) 一般会有一些附属的操作
        Proxy proxy=new Proxy(landlord);
        proxy.rent();
        // 直接接触的是代理 没有接触房东
    }
}
