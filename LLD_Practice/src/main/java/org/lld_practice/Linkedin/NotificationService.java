package org.lld_practice.Linkedin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private static NotificationService instance;
    private Map<User, List<String>> notifications;

    public NotificationService() {
        this.notifications = new HashMap<>();
    }

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void notify(User u, String message) {
        notifications.putIfAbsent(u, new ArrayList<>());
        notifications.get(u).add(message);
    }
}
