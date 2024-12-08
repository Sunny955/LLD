package org.lld_practice.inventory_management;

import java.util.List;

@SuppressWarnings("unused")
public class Order {
    private Integer orderId;
    private List<Product> products;
    private String status;
    private Customer customer;

    public Order(int orderId, List<Product> products, Customer customer) {
        this.orderId = orderId;
        this.products = products;
        this.customer = customer;
        this.status = "Created";
    }

    public void processOrder() {
        // Process order logic
        status = "Processed";
        System.out.println("Order " + orderId + " for customer " + customer.getName() + " processed successfully.");
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", status=" + status + ", customer=" + customer
                + "]";
    }

}
