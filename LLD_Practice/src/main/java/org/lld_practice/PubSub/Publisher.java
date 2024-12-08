package org.lld_practice.PubSub;

public class Publisher {
    private final MessageBroker messageBroker;
    public Publisher(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }
    public void publish(String topicName,Message message) {
        messageBroker.publish(topicName,message);
    }
}
