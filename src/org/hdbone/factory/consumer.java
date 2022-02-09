package org.hdbone.factory;

public class consumer {
    public static void main(String[] args) {
        //Car car1=new factory1();
        //Car car2=new factory2();

        // 去共产拿车
        Car car1=CarFactory.getCar("特斯拉");
        Car car2=CarFactory.getCar("法拉第");
        car1.name();
        car2.name();
    }
}
