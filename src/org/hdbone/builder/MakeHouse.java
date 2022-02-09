package org.hdbone.builder;

public class MakeHouse {
    public static void main(String[] args) {

        Director director=new Director();
        Product product=director.build(new Worker());
        System.out.println(product.toString());
    }
}
