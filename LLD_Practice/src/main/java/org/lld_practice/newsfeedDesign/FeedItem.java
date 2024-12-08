package org.lld_practice.newsfeedDesign;
import java.util.*;
public class FeedItem {
    String itemId;
    Post post;
    Integer relevanceScore;

    public FeedItem(Post post) {
        this.itemId = UUID.randomUUID().toString();
        this.post = post;
    }

    public Post getPost() {
        return post;
    }

    public void calculateRelevance(RelevanceStrategy strategy) {
        this.relevanceScore = strategy.calculateRelevance(post);
    }

    public Integer getRelevanceScore() {
        return relevanceScore;
    }
}
