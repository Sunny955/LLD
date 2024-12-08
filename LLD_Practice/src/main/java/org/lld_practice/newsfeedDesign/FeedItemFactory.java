package org.lld_practice.newsfeedDesign;

public class FeedItemFactory {
    public static FeedItem createFeedItem(Post post, RelevanceStrategy strategy) {
        FeedItem item = new FeedItem(post);
        item.calculateRelevance(strategy);
        return item;
    }
}
