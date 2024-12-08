package org.lld_practice.deliveryapp;

import java.util.List;

public class Customer extends User {
    List<Order> orderHistory;

    public void browseProduct() {

    }

    public void placeOrder(Order order) {

    }

    public String trackOrder(Long orderId) {
        return "Delivered";
    }
}
