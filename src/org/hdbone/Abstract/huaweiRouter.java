package org.hdbone.Abstract;

public class huaweiRouter implements RouterProduct{
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器打开WiFi");
    }
}
