package org.lld_practice.newsfeedDesign;

public class EngagementStrategy implements RelevanceStrategy{
    @Override
    public int calculateRelevance(Post post) {
        return post.getLikes() + post.getComments().size();
    }
}
