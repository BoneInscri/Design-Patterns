package org.hdbone.proxy3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 自动产生代理类
public class ProxyInvocationHandler implements InvocationHandler{

    // 被代理的接口
    private Rent rent;

    public void setRent(Rent rent)
    {
        this.rent=rent;
    }
    // 生成得到代理类
    public Object getProxy()
    {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);
    }

    // 处理代理实例 , 返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 使用反射机制实现动态代理
        TakeAfterHouse();
        Object object= method.invoke(rent,args);
        Fare();
        contract();
        return object;
    }
    public void TakeAfterHouse()
    {
        System.out.println("中介帮助照看房子");
    }
    public void Fare()
    {
        System.out.println("中介需要收中介费");
    }
    public void contract(){
        System.out.println("签租赁合同");
    }

}
