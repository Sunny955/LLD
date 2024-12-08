package org.lld_practice.inventory_management;

import java.util.HashSet;
import java.util.Set;

public class NotificationService {
    private static Set<User> observers = new HashSet<>();

    public void addObserver(User u) {
        observers.add(u);
    }

    public void removeObserver(User u) {
        observers.remove(u);
    }

    public void notify(Product p) {
        for (User observer : observers) {
            observer.update(p);
        }
    }
}
