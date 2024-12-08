package org.lld_practice.inventory_management;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Integer customerId;
    private List<Order> orders;
    private String name;
    private String email;
    private String address;

    public Customer(Integer customerId, String name, String email, String address) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Placed order successfully!");
    }

    public void viewOrderHistory() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

}
