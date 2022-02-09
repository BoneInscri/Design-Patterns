package org.hdbone.Abstract;

public class Client {
    public static void main(String[] args) {
        System.out.println("====华为系列产品====");
        huaweiFactory huaweiFactory=new huaweiFactory();

        PhoneProduct huaweiPhone=huaweiFactory.phoneProduct();
        huaweiPhone.start();
        huaweiPhone.call();
        huaweiPhone.shutdown();

        RouterProduct huaweiRouter=huaweiFactory.routerProduct();
        huaweiRouter.start();
        huaweiRouter.openWifi();
        huaweiRouter.shutdown();

        System.out.println("====苹果系列产品====");
        iFactory iFactory=new iFactory();

        PhoneProduct iPhone=iFactory.phoneProduct();
        iPhone.start();
        iPhone.call();
        iPhone.shutdown();

        RouterProduct iRouter=iFactory.routerProduct();
        iRouter.start();
        iRouter.openWifi();
        iRouter.shutdown();
    }
}
