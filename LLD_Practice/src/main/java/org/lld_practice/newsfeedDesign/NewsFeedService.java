package org.lld_practice.newsfeedDesign;

import java.util.*;

public class NewsFeedService {
    private static NewsFeedService instance = null;
    private User user;
    private List<FeedItem> items;

    public NewsFeedService(User user) {
        this.user = user;
        items = new ArrayList<>();
    }

    public static NewsFeedService getInstance(User user) {
        if (instance == null) {
            instance = new NewsFeedService(user);
        }

        return instance;
    }

    public List<FeedItem> generateFeed() {
        // List<FeedItem> feedItems = new ArrayList<>();

        List<User> friends = user.getFriends();

        for (User user : friends) {
            for (Post post : user.getPosts()) {
                RelevanceStrategy strategy = new EngagementStrategy();
                FeedItem item = FeedItemFactory.createFeedItem(post, strategy);
                items.add(item);
            }
        }

        sortFeed(items);
        return items;
    }

    public void sortFeed(List<FeedItem> items) {
        items.sort((FeedItem one, FeedItem two) -> (two.getRelevanceScore() - one.getRelevanceScore()));
    }
}
