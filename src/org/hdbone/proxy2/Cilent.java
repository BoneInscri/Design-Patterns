package org.hdbone.proxy2;

public class Cilent {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        UserServiceProxy userServiceProxy=new UserServiceProxy();
        // 不改变原有业务代码的情况下 实现新的功能
        userServiceProxy.setUserServiceProxy(userService);
        userServiceProxy.add();
        userServiceProxy.query();
    }
}
