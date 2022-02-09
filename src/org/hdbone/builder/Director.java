package org.hdbone.builder;

// 指挥者
// 负责指挥构建一个工程
public class Director {

    // 指挥造一个房子
    public Product build(Builder builder)
    {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }

}
