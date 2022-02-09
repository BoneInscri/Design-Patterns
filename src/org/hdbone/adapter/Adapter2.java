package org.hdbone.adapter;

public class Adapter2 implements NetToUsb {

    private EthernetCable ethernetCable;

    public Adapter2(EthernetCable ethernetCable) {
        this.ethernetCable = ethernetCable;
    }

    @Override
    public void handleRequest() {
        ethernetCable.request();
    }
}
