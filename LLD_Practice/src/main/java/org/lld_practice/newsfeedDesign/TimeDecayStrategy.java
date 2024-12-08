package org.lld_practice.newsfeedDesign;

import java.util.Date;

public class TimeDecayStrategy implements RelevanceStrategy{
    @Override
    public int calculateRelevance(Post post) {
        long currentTime = new Date().getTime();
        long postTime = post.getTimeStamp().getTime();
        return (int) (currentTime - postTime);
    }
}
