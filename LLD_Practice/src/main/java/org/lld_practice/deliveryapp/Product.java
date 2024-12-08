package org.lld_practice.deliveryapp;

public class Product {
    Long id;
    String name;
    Double price;
    Integer stock;
    Store store;
    public void updateStock(Integer quantity) {
        this.stock = quantity;
    }
}
