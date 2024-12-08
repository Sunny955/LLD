package org.lld_practice.deliveryapp;

import java.util.List;

public class Order {
    Long id;
    Customer customer;
    Store store;
    List<Product> products;
    Double totalAmount;
    OrderStatus status;

    public Double calculateTotalAmount() {
        // calculate total amount
        return 0.0;
    }

    public String updateStatus(OrderStatus status) {
        this.status = status;
        return status.name();
    }
}
