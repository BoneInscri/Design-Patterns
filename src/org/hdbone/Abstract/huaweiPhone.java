package org.hdbone.Abstract;

public class huaweiPhone implements PhoneProduct{

    @Override
    public void start() {
        System.out.println("打开华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
