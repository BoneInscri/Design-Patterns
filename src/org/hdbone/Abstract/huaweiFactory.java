package org.hdbone.Abstract;

public class huaweiFactory implements ProductFactory{

    @Override
    public PhoneProduct phoneProduct() {
        return new huaweiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new huaweiRouter();
    }
}
