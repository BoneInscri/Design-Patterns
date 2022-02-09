package org.hdbone.proxy;
// 代理
public class Proxy implements Rent{
    private Landlord landlord;

    public Proxy() {
    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    // 代理帮组房东租房
    @Override
    public void rent() {
        TakeAfterHouse();
        landlord.rent();
        contract();
        Fare();

    }
    public void TakeAfterHouse()
    {
        System.out.println("中介帮助照看房子");
    }
    public void Fare()
    {
        System.out.println("中介需要收中介费");
    }
    public void contract(){
        System.out.println("签租赁合同");
    }
}
