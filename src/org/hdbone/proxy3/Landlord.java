package org.hdbone.proxy3;

// 房东
public class Landlord implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
