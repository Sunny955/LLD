package org.lld_practice.observer;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("Laptop",0);

        User u1 = new User("Alice");
        User u2 = new User("Bob");

        p.addObserver(u1);
        p.addObserver(u2);

        System.out.println("Stocking the product!");
        p.setStock(10);

        p.removeObserver(u1);

        System.out.println("Again stocking the product!");
        p.setStock(20);
    }
}
