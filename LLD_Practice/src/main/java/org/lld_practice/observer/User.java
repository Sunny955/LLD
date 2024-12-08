package org.lld_practice.observer;

public class User implements Observer{
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName) {
        System.out.println("Hello " + name + ", the product " + productName + " is back in stock!");
    }
}
