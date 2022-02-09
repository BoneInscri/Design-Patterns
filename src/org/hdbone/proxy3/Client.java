package org.hdbone.proxy3;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Landlord landlord=new Landlord();
        // 代理角色
        ProxyInvocationHandler proxyInvocationHandler=new ProxyInvocationHandler();
        // 设置真实角色
        proxyInvocationHandler.setRent(landlord);
        // 获取动态代理对象
        Rent proxy=(Rent) proxyInvocationHandler.getProxy();
        proxy.rent();
    }
}
