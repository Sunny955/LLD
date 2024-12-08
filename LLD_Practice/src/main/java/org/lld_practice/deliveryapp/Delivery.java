package org.lld_practice.deliveryapp;

public class Delivery {
    Long id;
    Order order;
    DeliveryPerson deliveryPerson;
    DeliveryStatus status;

    public void assignDeliveryPerson(DeliveryPerson dp) {

    }
    public void updateStatus(DeliveryStatus status) {
        this.status = status;
    }
}
