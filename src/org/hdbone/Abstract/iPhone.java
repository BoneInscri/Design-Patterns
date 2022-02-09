package org.hdbone.Abstract;

public class iPhone implements PhoneProduct{

    @Override
    public void start() {
        System.out.println("苹果手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("苹果手机关机");
    }

    @Override
    public void call() {
        System.out.println("苹果手机打电话");
    }
}
