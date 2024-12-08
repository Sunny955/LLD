package org.lld_practice.newsfeedDesign;
import java.util.*;
public class Post {
    String postId;
    String content;
    Date timeStamp;
    User author;
    Integer likes;
    List<Comment> comments;

    public Post(String postId, String content, Date timeStamp, User author) {
        this.postId = postId;
        this.content = content;
        this.timeStamp = timeStamp;
        this.author = author;
        this.likes = 0;
        this.comments = new ArrayList<>();
    }

    public String getContent() {
        return content;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void like() {
        likes++;
    }
}
