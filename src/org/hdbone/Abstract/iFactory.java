package org.hdbone.Abstract;

public class iFactory implements ProductFactory{
    @Override
    public PhoneProduct phoneProduct() {
        return new iPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new iRouter();
    }
}
