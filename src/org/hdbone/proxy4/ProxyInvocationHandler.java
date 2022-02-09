package org.hdbone.proxy4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 自动产生代理类
public class ProxyInvocationHandler implements InvocationHandler{

    // 被代理的接口
    private Object target;

    public void setTarget(Object target)
    {
        this.target=target;
    }
    // 生成得到代理类
    public Object getProxy()
    {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }

    // 处理代理实例 , 返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 使用反射机制实现动态代理
        Object object= method.invoke(target,args);
        return object;
    }
}
