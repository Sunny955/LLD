package org.lld_practice.PubSub;

import java.util.HashMap;
import java.util.Map;

public class MessageBroker {
    private final Map<String,Topic> topics;
    public MessageBroker() {
        this.topics = new HashMap<>();
    }
    public void createTopic(String topicName) {
        topics.put(topicName,new Topic(topicName));
    }
    public void subscribe(String topicName,Subscriber subscriber) {
        Topic topic = topics.get(topicName);

        if(topic != null) {
            topic.addSubscribers(subscriber);
        }
    }
    public void unsubscribe(String topicName, Subscriber subscriber) {
        Topic t = topics.get(topicName);

        if(t != null) {
            t.removeSubscribers(subscriber);
        }
    }
    public void publish(String topicName,Message message) {
        Topic t = topics.get(topicName);
        if(t != null) {
            for(Subscriber s: t.getSubscribers()) {
                s.receive(message);
            }
        }
    }
}
