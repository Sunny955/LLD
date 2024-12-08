package org.lld_practice.PubSub;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private final String name;
    private final List<Subscriber> subscribers;

    public Topic(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void addSubscribers(Subscriber s) {
        subscribers.add(s);
    }

    public void removeSubscribers(Subscriber s) {
        subscribers.remove(s);
    }
}
