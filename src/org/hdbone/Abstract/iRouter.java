package org.hdbone.Abstract;

public class iRouter implements RouterProduct{

    @Override
    public void start() {
        System.out.println("苹果路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("苹果路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("苹果路由器打开Wifi");
    }
}
