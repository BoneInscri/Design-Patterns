package org.hdbone.proxy;

// 房东
public class Landlord implements Rent{

    @Override
    public void rent() {
        System.out.println("房东需要租房子");
    }
}
