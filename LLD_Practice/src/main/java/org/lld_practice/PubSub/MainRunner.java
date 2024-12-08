package org.lld_practice.PubSub;

@SuppressWarnings("unused")
public class MainRunner {
    public static void main(String[] args) {
        MessageBroker messageBroker = new MessageBroker();

        // Create topics
        messageBroker.createTopic("sports");
        messageBroker.createTopic("tech");

        // Create subscribers
        Subscriber s1 = new Subscriber("1");
        Subscriber s2 = new Subscriber("2");
        Subscriber s3 = new Subscriber("3");

        // Subscriber to topics
        messageBroker.subscribe("sports", s1);
        messageBroker.subscribe("sports", s2);
        messageBroker.subscribe("tech", s3);

        // Create publishers
        Publisher p1 = new Publisher(messageBroker);
        Publisher p2 = new Publisher(messageBroker);

        p1.publish("sports", new Message("Ronaldo won Ballon'Dor"));
        p1.publish("tech", new Message("Python is trending right now!"));
    }
}
