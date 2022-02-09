package org.hdbone.factory;

// 简单工厂模式 (静态工厂模式)
// 没有满足开闭原则
public class CarFactory {
    public static Car getCar(String car)
    {
        if(car.equals("特斯拉"))
        {
            return new factory1();
        }
        else if(car.equals("法拉第"))
        {
            return new factory2();
        }
        else
        {
            return null;
        }
    }
    // 静态工厂模式
    public static Car getCar1()
    {
        return new factory1();
    }
    public static Car getCar2()
    {
        return new factory2();
    }


}
