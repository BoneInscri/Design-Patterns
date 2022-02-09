package org.hdbone.builder;

public abstract class Builder {
    abstract void buildA();//地基
    abstract void buildB();//钢筋工程
    abstract void buildC();//铺电线
    abstract void buildD();//粉刷

    abstract Product getProduct();// 房子

}
