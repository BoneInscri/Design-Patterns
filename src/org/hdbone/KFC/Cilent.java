package org.hdbone.KFC;

public class Cilent {
    public static void main(String[] args) {
        // 服务员
        Worker worker=new Worker();
        // 默认的情况下
        //Product product=worker.getProduct();

        // 链式编程 (用户自定义)
        Product product=worker.buildA("全家桶").buildB("土豆泥").buildD("鸡米花").getProduct();
        System.out.println(product.toString());
    }
}
