package org.lld_practice.inventory_management;

import java.util.Arrays;
import java.util.List;

public class InventoryManagement {
    public static void main(String[] args) {
        Inventory inventory = Inventory.getInstance();

        // Adding Products
        Product p1 = new Product(1, "Laptop", "Gaming Laptop", 1200.0, 10);
        Product p2 = new Product(2, "Phone", "Smartphone", 800.0, 5);
        inventory.addProduct(p1);
        inventory.addProduct(p2);

        User admin = new Admin(1, "Luchcha");
        User manager = new InventoryManager(2, "Lafanga");

        NotificationService notificationService = new NotificationService();
        notificationService.addObserver(admin);
        notificationService.addObserver(manager);

        // Create Customer
        Customer customer = new Customer(1, "Alice", "alice@example.com", "123 Main St");

        // Create and process order
        List<Product> orderProducts = Arrays.asList(p1, p2);
        Order order = new Order(101, orderProducts, customer);
        customer.placeOrder(order);

        order.processOrder();
        inventory.reduceStock(1, 8);
    }
}
