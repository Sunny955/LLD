package org.lld_practice.Linkedin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public abstract class Post {
    private UUID id;
    private String content;
    private User postedBy;
    private long likes;
    private List<String> comments;

    public Post(User postedBy, String content, long likes) {
        this.id = UUID.randomUUID();
        this.postedBy = postedBy;
        this.content = content;
        this.likes = likes;
        this.comments = new ArrayList<>();
    }

    public User getPostedBy() {
        return postedBy;
    }

    public long getLikes() {
        return likes;
    }

    public void like() {
        likes++;
    }

    public void setPostedBy(User postedBy) {
        this.postedBy = postedBy;
    }

    public List<String> getComments() {
        return this.comments;
    }
}
