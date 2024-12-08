package org.lld_practice.inventory_management;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    NotificationService notificationService = new NotificationService();
    Map<Integer, Product> products = new HashMap<>();
    static Inventory instance = null;

    public Inventory() {
    }

    public static Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public void updateProduct(Product product) {
        if (products.containsKey(product.getId())) {
            products.put(product.getId(), product);
        }
    }

    public void deleteProduct(int productId) {
        products.remove(productId);
    }

    public Product getProduct(int productId) {
        return products.get(productId);
    }

    public void addStock(int productId, int qty) {
        Product product = products.get(productId);
        product.setQty(product.getQty() + qty);
    }

    public void reduceStock(int productId, int qty) {
        Product product = products.get(productId);
        product.setQty(product.getQty() - qty);

        if (product.getQty() - qty <= 2) {
            notificationService.notify(product);
        }
    }

    public int getStock(int productId) {
        return products.get(productId).getQty();
    }
}
