package org.lld_practice.newsfeedDesign;

import java.util.*;

public class User {
    String userId;
    String name;
    List<User> friends;
    List<Post> posts;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public void addFriend(User user) {
        friends.add(user);
    }

    public void createPost(String content) {
        Post newPost = new Post(UUID.randomUUID().toString(),"New Post",new Date(),this);
        posts.add(newPost);
        notifyFriends(newPost);
    }

    void update(Post post) {
        System.out.println("Hey!, your friend added a new post: "+ post + " by :" + this.name);
    }

    private void notifyFriends(Post p) {
        for(User u: friends) {
            u.update(p);
        }
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<User> getFriends() {
        return friends;
    }

    List<FeedItem> getNewsFeed() {
        NewsFeedService newsFeedService = NewsFeedService.getInstance(this);
        return newsFeedService.generateFeed();
    }
}
