package org.lld_practice.observer;

import java.util.*;

public class Product implements Observable{
    private String name;
    private int stock;
    private List<Observer> observers;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob: observers) {
            ob.update(name);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
        if(stock > 0) {
            notifyObservers();
        }
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }
}
