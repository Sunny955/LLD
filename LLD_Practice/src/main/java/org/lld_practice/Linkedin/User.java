package org.lld_practice.Linkedin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    UUID id;
    String name;
    String email;
    List<User> connections;
    List<Post> posts;

    public User(String name, String email) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.connections = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<User> getConnections() {
        return connections;
    }

    public void setConnections(List<User> connections) {
        this.connections = connections;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void sendConnectionRequest(User user) {
        NotificationService.getInstance().notify(user, this.name + " sent you a connection request.");
    }

    public void acceptConnectionRequest(User user) {
        this.connections.add(user);
        user.connections.add(this);

        NotificationService.getInstance().notify(user, this.name + " accepted your connection request.");
    }

    public void createPost(Post p) {
        posts.add(p);
    }
}
