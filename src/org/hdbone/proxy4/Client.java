package org.hdbone.proxy4;

import org.hdbone.proxy2.UserService;
import org.hdbone.proxy2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        ProxyInvocationHandler proxyInvocationHandler=new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);

        UserService proxy= (UserService) proxyInvocationHandler.getProxy();
        proxy.add();
    }
}
