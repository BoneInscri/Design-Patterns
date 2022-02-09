package org.hdbone.builder;

// Builder 抽象类
// Worker 具体的实现类 (建造者)
public class Worker extends Builder{
    private Product product;
    public Worker() {
        // 工人创建的
        product=new Product();
    }
    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基建造完毕");
    }
    @Override
    void buildB() {
        product.setBuildB("钢筋工程");
        System.out.println("钢筋工程建筑完毕");
    }
    @Override
    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("电线铺设完毕");
    }
    @Override
    void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷完毕");
    }
    @Override
    Product getProduct() {
        return product;
    }
}
