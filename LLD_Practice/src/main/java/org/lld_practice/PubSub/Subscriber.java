package org.lld_practice.PubSub;

public class Subscriber {
    private String id;

    public Subscriber(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void receive(Message message) {
        System.out.println("Subscriber "+id+" received: "+message.getContent());
    }
}
