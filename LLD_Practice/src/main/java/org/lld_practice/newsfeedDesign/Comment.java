package org.lld_practice.newsfeedDesign;
import java.util.*;
public class Comment {
    String commentId;
    String content;
    Date timeStamp;
    User author;

    public Comment(String commentId, String content, Date timeStamp, User author) {
        this.commentId = commentId;
        this.content = content;
        this.timeStamp = timeStamp;
        this.author = author;
    }
}
